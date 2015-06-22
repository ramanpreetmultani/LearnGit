import java.util.HashSet;
import java.util.Scanner;


public class palindrome {
	
	/*MAIN*/
	public static void main(String args[]){
		
		HashSet<String> test = new HashSet<String>();
		
		//Length of String array:: Initiallization, user provokation and stoing in memory
		int length;
		System.out.println("Enter the number of words:");
		Scanner input = new Scanner(System.in);
		length = input.nextInt();
		
		//tmporary String used to store the reverse of current string
		String temp;
		
		while(length-- > 0){
			
			//user input (String) stored in hash table
			temp=input.next();
			test.add(temp);
			
			temp = new StringBuffer(temp).reverse().toString();
			
			//calling success message on finding a palindrome
			if(test.contains(temp))
				System.out.println("palindrome found!!!!!!");
		}
		
		input.close();
	}
}
