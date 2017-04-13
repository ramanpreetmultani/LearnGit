import java.util.Scanner;


public class findNumOccr {
	
	/*MAIN*/
	public static void main(String args[]){
		//git merge testing
		//initializing the length of array
		System.out.println("Enter the length of array:");
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		//array is initialized from user input
		System.out.println("Enter the array:");
		int arr[] = new int[x];
		for(int i=0;i<x;i++){
			arr[i]=input.nextInt();
		}
		
		//check binarySearch function
		System.out.println("Enter the number you want to search in array:");
		int num=input.nextInt();
		int check = binarySearch(arr,num);
		//System.out.println(check+" is the position of "+num+" in array");
		
		if(check!=-1){
			
			//checking the lower bound
			int lower=check-1;
			while(lower>=0 && arr[lower]==arr[check])
				lower--;
			
			//checking the upper bound
			int upper = check+1;
			while(upper<arr.length && arr[upper]==arr[check])
				upper++;
			
			System.out.println(upper-lower-1+" is the length of given word in array");
		}
		else
			System.out.println("0 0 0 there is nothing like this");
		input.close();
	}
	
	/*BINARY SEARCH*/
	public static int binarySearch(int arr[],int num){
		
		int start=0,end=arr.length-1;
		int mid;
		
		while(end>=start){
					
			mid=(start+end)/2;
			if(arr[mid]==num)
				return mid;
			else if(arr[mid]>num){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return -1;
	}
}
