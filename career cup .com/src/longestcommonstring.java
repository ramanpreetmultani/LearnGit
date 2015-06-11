import java.util.Scanner;


public class longestcommonstring {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two Strings:");
		
		//defining and initializing string
		String test1,test2;
		test1 =  input.nextLine();
		test2 = input.nextLine();
		
		//initializing and defining 2d array with length taken from string lengths
		int x=test1.length(),y=test2.length();
		int table[][]=new int[x+1][y+1];
		
		//initializing first row and first column
		for(int i=0;i<=x;i++)
			table[i][0]=0;
		for(int i=0;i<=y;i++)
			table[0][i]=0;
		
		//computing table using DP
		for(int i=1;i<=x;i++){
			for(int j=1;j<=y;j++){
				if(test1.charAt(i-1)==test2.charAt(j-1)){
					table[i][j]=table[i-1][j-1]+1;
				}
				else{
					table[i][j]=Math.max( table[i-1][j], table[i][j-1]);
				}
			}
		}
		
		/*//printing table for debugging
		for(int i=0;i<=x;i++){
			for(int j=0;j<=y;j++){
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		String test3="";
		int i=x,j=y;
				
		//creating longest common substring from table in inverted format
		while(i>0 && j>0){
			while(
					i>0 && j>0 &&/*boundary conditions &&*/
					table[i][j]==table[i-1][j] 
				)
				i--;
			
			while(
					i>0 && j>0 &&/*boundary conditions &&*/
					table[i][j]==table[i][j-1] 
				)
				j--;
			
			test3+=test2.charAt(j-1);
			i--;j--;
		}
		
		//printing that longest string
		String reverse = new StringBuffer(test3).reverse().toString();
		System.out.println(reverse);
			
		input.close();
	}
	
}
