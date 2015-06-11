import java.util.Scanner;


public class rotateArray {
	public static void main(String args[]){
		//promote user to enter length of array
		System.out.println("Enter the length of array:");
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		//create and initialize array of given length
		int arr[]=new int[size];	
		System.out.println("Enter the elements of array:");
		for(int j=0;j<size;j++){
			arr[j]=input.nextInt();
		}
		
		int max=findmax(arr)+1;
		//System.out.println(max);
		
		//promote user to enter rotation length of array
		System.out.println("Enter the integer through which array should rotate:");
		int n =input.nextInt();
		
		
		//Rotation of array through 2 for loops
		for(int i=0;i<size;i++){
			arr[(n+i)%size] = arr[(n+i)%size] + arr[i]*max;
		}
		for(int i=0;i<size;i++){
			arr[i]/=max;
			arr[i]%=max;
		}
		
		//printing out array after rotation
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		input.close();
	}

	private static int findmax(int[] arr) {
		// TODO Auto-generated method stub
		int max=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
}
