import java.util.Scanner;


public class wildCardFor01 {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String test = input.next();
		
		//System.out.print(test.length());
		funct(test,test.length()-1);
		input.close();
	}
	public static void funct(String test,int end){
		//find position of first ? say pos
		int pos=end;
		while(pos>=0 && test.charAt(pos)!='?' )
			pos--;
		
		
		if(pos>=0){
		
			String temp = test.substring(0,pos)+'0'+test.substring(pos+1);
			funct(temp,pos-1);
			
			temp = test.substring(0,pos)+'1'+test.substring(pos+1);
			funct(temp,pos-1);
		}
		else{
			System.out.println(test);
		}
	}
}
