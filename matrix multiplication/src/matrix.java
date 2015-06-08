import java.util.Scanner;


public class matrix {
	
	public static void main(String args[]){
		
		System.out.print("Enter the number of Matrix: ");
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int p[]=new int[size+1];
		
		/*if our matrices are 
		 * 
		 * 30*35
		 * 35*15
		 * 15*5
		 * 5*10
		 * 
		 * p[] will be {30,35,15,5,10} with size = 5
		 * 
		 * */
		
		//initialize p with user input
		for(int i=0;i<=size;i++){
			p[i]=input.nextInt();
		}
		
		matrixMult(p);
	}
	
	public static void matrixMult(int p[]){
		
		
		int matCount=p.length-1;
		int m[][]=new int[matCount][matCount];
		
		//initialize 2d array m[][] with zeros
		for(int i=0;i<matCount;i++)
			for(int j=0;j<matCount;j++)
				m[i][j]=0;
		
		//calculate 2d array m[][]
		for(int gap=1;gap < matCount;gap++){
			
			for(int i=0;gap+i < matCount;i++){
				
				int min1 = m[i+1][gap+i] +p[i]*p[i+1]*p[gap+i+1];
				
				for(int k=i;k<i+gap;k++){
					int num=(m[i][k]+m[k+1][gap+i] +p[i]*p[k+1]*p[gap+i+1]);
					
					min1 = Math.min(min1,num);
					
				}
				m[i][gap+i]=min1;
			}
		}
		
		//printing 2d array m[][]
		for(int i=0;i<matCount;i++){
			for(int j=0;j<matCount;j++){
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
