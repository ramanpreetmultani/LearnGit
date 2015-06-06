
public class linklist {
	
	private node head;
	
	public void insert(int x){
	
		node temp = new node();
		head = temp;
		this.head.value=x;
		node temp1 = new node();
		head.ptr=temp1;
		this.head.ptr.value=x;
	
	}
	
	public void display(){
	
		node temp=head;
		while(temp != null){
		
			System.out.println(temp.value);
			temp=temp.ptr;
		
		}
		
	}
}
