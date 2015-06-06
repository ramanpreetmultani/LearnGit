import java.util.Stack;

public class stackCheck {
	public static void main(String args[]){
		
		Stack<Integer> test = new Stack<Integer>();
		
		test.push(1);
		test.push(2);
		test.push(3);
		
		int y;
		
		while(!test.isEmpty()){
			
			y=test.pop();
			System.out.println(y);
			
		}
	}
}
