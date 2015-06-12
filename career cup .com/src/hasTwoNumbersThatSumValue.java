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
		
		//Hashing is used worst case lookup for an element is O(n)
		//expected lookup is O(1)
		HashSet<Integer> test = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(test.contains(num-arr[i]))
				return true;
			else
				test.add(arr[i]);
		}
		return false;
		
		/*
		 * other method could be sort the array first
		 * [a,b,c,d,e,f]
		 * 1.	a+f>num
		 * 2.	a+f<num
		 * 3.	a+f=num
		 * 
		 * for 1.
		 * {
		 * 	decrease upper pointer from f to e
		 * 	check again(reloop)
		 * }
		 * 
		 * for 2.
		 * {
		 * 	increase upper pointer from a to b
		 * 	check again(reloop)
		 * }
		 * 
		 * for 3. return true
		 * 
		 * complexity = sorting(nlogn) + n(checking) 
		 * */
	}
}
