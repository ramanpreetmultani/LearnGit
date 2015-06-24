import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class friendshipLevel {
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		
		HashMap<Character,String> friends = new HashMap<Character,String>();
		
		int numberInput = input.nextInt();
		
		String temp;
		
		for(int i=0;i<=numberInput;i++){
			temp = input.nextLine();
			
			if(temp.length()>1){
				String test[] = temp.split(":");
				char x = test[0].charAt(0);
			
				String y = test[1];
			
				friends.put(x, y);
			}
		}
		
		funct('a',friends);
		//System.out.println(friends.values());
		input.close();
		
	}
	
	//Used BFS in this function
	public static void funct(char a,HashMap<Character,String> test){
		Queue<Character> temp1 = new LinkedList<Character>();
		Queue<Character> temp2 = new LinkedList<Character>();
		temp1.add(a);
		char temp;
		
		while(!temp1.isEmpty() || !temp2.isEmpty()){
			
			while(!temp1.isEmpty()){
				temp = temp1.poll();
				System.out.print(temp+" ");
				String abc = test.get(temp);
				insertInQueue(abc,temp2);
			}
			
			System.out.println();
			
			while(!temp2.isEmpty()){
				temp = temp2.poll();
				System.out.print(temp+" ");
				String abc = test.get(temp);
				insertInQueue(abc,temp1);
			}
			System.out.println();
		}
	}
	
	public static void insertInQueue(String abc, Queue<Character> temp){
		if(abc == null)
			return;
		
		String xyz[] = abc.split(",");
		for(int i=0;i<xyz.length;i++){
			temp.add(xyz[i].charAt(0));
		}
	}
}
