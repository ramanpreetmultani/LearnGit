import java.util.Scanner;
//problem link = http://www.careercup.com/question?id=5067106322219008

public class recognizeSequence {
	
	/*MAIN*/
	public static void main(String args[]){
		
		//defining scanner object
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String test = "1";

		//no. to steps we define to compressed a string
		for(int i=1;i<n;i++){
			test=analyse(test);
		}
		
		System.out.println(test);
		input.close();
	}
	
	/*Analyze: convert a string in to compressed version one step(ENCRYPTION)*/
	public static String analyse(String test){
		//initiallizing empty string
		String xyz="";
		int count=1;
		
		for(int i=0;i<test.length()-1;i++){
			
			if(test.charAt(i)==test.charAt(i+1)){
				count++;
			}
			else{
				xyz=xyz+count;
				xyz+=test.charAt(i);
				count=1;
			}
		}
		xyz+=count;
		xyz+=test.charAt(test.length()-1);
		return xyz;
	}
}
