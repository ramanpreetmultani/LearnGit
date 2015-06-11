import java.util.Scanner;

public class pathAvailable {
	
	private static int table[][]=new int[4][5];
	
	public static void main(String args[]){
		System.out.println("Enter the dimensions of path(2d array):");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		//Take user input to get table[][]
		System.out.println("Enter the 2d array:");
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++)
				table[i][j]=input.nextInt();
		
		//Checking the table for comparing and debugging
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++)
				System.out.print(table[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("Enter the starting point and ending point dimentions:");
		int x1=input.nextInt(),y1=input.nextInt();
		int x2=input.nextInt(),y2=input.nextInt();
		
		//calling funct function
		if(funct(x1,y1,x2,y2)){
			table[x2][y2]=5;
			System.out.println("tracable");
		}
		else
			System.out.println("untracable");
		
		//printing the table after tracing has been done 
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++)
				System.out.print(table[i][j]+" ");
			System.out.println();
		}
		
		input.close();
	}
	
	public static boolean funct(int x1,int y1,int x2,int y2){
		
		//if starting point is same as end point
		if(x1==x2 && y1==y2)
			return true;
		
		//making table entry 2 to check where we have gone to check the path
		//and this entry is neccessary in order to tell parser this
		//position is parsed so do not parse it again
		table[x1][y1]=2;
		
		//checking all the four direction from the current point
		//each if block is searching for single point 
		if(x1-1>=0 && x1-1<table.length && y1>=0 && y1<table[0].length && table[x1-1][y1]==0){
			
			if(funct(x1-1,y1,x2,y2)){
				
				//making table entry 5 to trace the path
				table[x1][y1]=5;
				return true;
			}
		}
		if(x1+1>=0 && x1+1<table.length && y1>=0 && y1<table[0].length && table[x1+1][y1]==0){
			
			if(funct(x1+1,y1,x2,y2)){
				table[x1][y1]=5;
				return true;
			}
		}
		if(x1>=0 && x1<table.length && y1-1>=0 && y1-1<table[0].length && table[x1][y1-1]==0){
			
			if(funct(x1,y1-1,x2,y2)){
				table[x1][y1]=5;
				return true;
			}
		}
		if(x1>=0 && x1<table.length && y1+1>=0 && y1+1<table[0].length && table[x1][y1+1]==0){
			
			if(funct(x1,y1+1,x2,y2)){
				table[x1][y1]=5;
				return true;
			}
		}
		
		//returning false in case there is no path from all the four
		//neighbouring points
		return false;
	}
}
