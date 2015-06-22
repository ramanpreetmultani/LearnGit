
public class subtraction {
	public static void main(String args[]){
		int a[] = {8,4,0,2}, b[] = {9,2,0,1};
		String test="";
		int temp=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]>=b[i])
				temp=a[i]-b[i];
			else{
				temp=10+a[i]-b[i];
				a[i+1]--;
			}
			test=temp+test;
		}
		System.out.println(test);
	}
}
