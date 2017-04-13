import java.util.Queue;


public class course {
	//all these details should be public
		String name; 
		String semester;//fall spring both
		int dependentOn; 
		String dependentOnCourses[];
		Queue<course> dependentCourses;
}
