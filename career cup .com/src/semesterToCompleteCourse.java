import java.util.Queue;
import java.util.Scanner;
public class semesterToCompleteCourse {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int courseCount=input.nextInt(),maxCourse=input.nextInt();
		String courses[] = new String[courseCount];
		
		for(int i=0;i<courseCount;i++)
			courses[i]=input.next();
		
		course c[] = new course[courseCount];
		for(int i=0;i<courseCount;i++){
			c[i]=new course();
		}
		for(int i=0;i<courseCount;i++){
			c[i].name = input.next();
			c[i].semester = input.next();
			c[i].dependentOn = input.nextInt();
			
			if(c[i].dependentOn!=0)
			c[i].dependentOnCourses = new String[c[i].dependentOn];
			
			for(int j=0;j<c[i].dependentOn;j++){
				//System.out.println(c[i].dependentOn);	
				c[i].dependentOnCourses[j]=input.next();
				course temp = check(c[i].dependentOnCourses[j], c);
				if(temp==null){
					System.out.println("Error");
					break;
				}
				temp.dependentCourses.add(c[i]);
			}
		}
		int semesters = calculate(c);
		System.out.println(semesters);
		input.close();
	}
	
	private static course check(String string, course c[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<c.length;i++)
			if(c[i].name==string)
				return c[i];
		return null;
	}

	public static int calculate(course c[]){
		
		int addsem=0;
		Queue<course> sem = null;
		String current ="fall";
		
		//insert courses whose.semester is (current) and dependentOn == 0
		for(int i=0;i<c.length;i++){
			if(c[i].semester==current || c[i].semester == "both"){
				if(c[i].dependentOn==0)
					sem.add(c[i]);
			}
		}
		while(!sem.isEmpty()){
			addsem++;
			while(!sem.isEmpty()){
				//pop out a value from current array let say b
				course b = sem.poll();
				
				while(!b.dependentCourses.isEmpty()){
					course temp = b.dependentCourses.poll();
					temp.dependentOn--;
				}
			}
			///current toggle
			if(current=="fall")
				current="spring";
			else
				current="fall";
			
			//insert courses whose.semester == (current) and dependentOn == 0
			for(int i=0;i<c.length;i++){
				if(c[i].semester==current){
					if(c[i].dependentOn==0)
						sem.add(c[i]);
				}
			}
		}
		return addsem;
	}
}
