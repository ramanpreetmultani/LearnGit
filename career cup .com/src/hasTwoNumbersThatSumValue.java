import java.util.HashSet;
import java.util.Scanner;


public class hasTwoNumbersThatSumValue {
	
	/*MAIN*/
	public static void main(String args[]){
		
		//initializing the array's length in variable x
		int x;
		Scanner input = new Scanner(System.in);
		x=input.nextInt();
		
		//initializing the array 
		int arr[] = new int[x];
		for(int i=0;i<x;i++)
			arr[i]=input.nextInt();
		
		//initializing number whose sum is to be checked 
		int num=input.nextInt();
		
		//running hastwoNumbersThatSumValue function
		if(funct(arr,num))
			System.out.println("!!yes it exists!!");
		else
			System.out.println("!!oops it does'nt!!");
		
		input.close();
	}
	
	/*hasTwoNumbersThatSumValue function*/
	public static boolean funct(int arr[],int num){
		
		HashSet<Integer> test = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(test.contains(num-arr[i]))
				return true;
			else
				test.add(arr[i]);
		}
		return false;
	}
}
