import java.util.Scanner;


public class quickSort {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of array: ");
		
		int y;
		y = input.nextInt();
		
		int a[] = new int[y];
		
		for(int i=0;i<y;i++){
			a[i] = input.nextInt();
		}
		
		operate(a,0,y-1);
		
		for(int i=0;i<y;i++){
			System.out.print(a[i]+" ");
		}
	}

	public static void operate(int a[],int start,int end){
		
		if(end >=start){
			
			int i = start, j = end;
			int mid = (i+j)/2;
			int pivot = a[mid];
			
			while(j >= i){
				
				while(pivot > a[i]){
					i++;
				}
				
				while(pivot < a[j]){
					j--;
				}
				
				if(i<=j){
					
					swap(a,i,j);
					i++;
					j--;
				}
			}
			
			operate(a,start,j);
			operate(a,i,end);
		}
	}

	private static void swap(int a[],int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
}
