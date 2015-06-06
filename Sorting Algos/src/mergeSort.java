import java.util.Scanner;

public class mergeSort {
	
	public static void main(String args[]){
		System.out.println("Enter the length of array:");
		
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		int a[] = new int[y];
		
		for(int i=0;i<a.length;i++){
			a[i]=input.nextInt();
		}
		
		operate(a,a.length);
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void operate(int a[],int size){
		
		if(size == 1)
			return;
		
		else if(size>1){
			int b[] = new int [size/2];
			int c[] = new int [size/2 + size%2];
			
			//put half a in b
			for(int i=0;i<b.length;i++){
				b[i]=a[i];
			}
			
			//put second half a in c
			for(int i=0;i<c.length;i++){
				c[i]=a[i+b.length];
			}
			
			operate(b,b.length);
			operate(c,c.length);
			
			merge(a,b,c);
			
		}
		
	}
	
	public static void merge(int a[],int b[],int c[]){
		
		int i=0,j=0,k=0;
		
		for(int l=0;l<a.length;l++){
			
			if(j<b.length && k<c.length){
				if( b[j]<c[k] ){
					
					a[l]=b[j];
					j++;
				}
				else{
					a[l]=c[k];
					k++;
				}
			}
			
			else if(j<b.length){
				a[l]=b[j];
				j++;
			}
			
			else{
				a[l]=c[k];
				k++;
			}
		}
	}
}
