import java.util.Scanner;


public class heapSort {
	
	public static void main(String args[]){
		int x;
		Scanner input =new Scanner(System.in);
		
		x=input.nextInt();
		int arr[]=new int[x+1];
		for(int i=1;i<=x;i++)
			arr[i]=input.nextInt();
		
		int lastparent=x/2;
		//System.out.println(lastparent);
		//System.out.println(arr[lastparent]);
		for(int j=lastparent;j>0;j--)
			heapifyNode(arr,j);
		
		for(int i=1;i<=x;i++)
			System.out.print(arr[i]+" ");
		input.close();
		
	}
	public static void heapifyNode(int arr[],int pos){
		
		if(arr.length<(pos*2))
			return;
		
		//check min node of the three
		int max=checkMax(arr,pos,pos*2,pos*2+1);
		//System.out.println(max);
		
		if(max==pos)
			return;
		
		else
			arr[pos] = swap(arr[max],arr[max]=arr[pos]);//swapping :)
		
		heapifyNode(arr,max);
	}

	private static int swap(int i, int j) {
		// TODO Auto-generated method stub
		return i;
		
	}

	private static int checkMax(int[] arr, int pos, int i, int j) {
		// TODO Auto-generated method stub
		int max=pos;
		//System.out.println(max);
		
		if(arr[max]<arr[i] )
			max=i;

		if(arr.length>(pos*2+1) && arr[max]<arr[j])
			max=j;
		
		
		return max;
	}
}
