package chapterfour;

/*Write a method called getGrade that accepts an integer representing a student's grade in a course and returns that student's numerical course grade. The grade can be between 0.0 (failing) and 4.0 (perfect). Assume that scores are in the range of 0 to 100 and that grades are based on the following scale:

Score	Grade
<60	0.0
60-62	0.7
63	0.8
64	0.9
65	1.0
...	
92	3.7
93	3.8
94	3.9
>=95	4.0
For an added challenge, make your method throw an IllegalArgumentException if the user passes a grade lower than 0 or higher than 100.*/

public class GetGrade {

	
	public static double getGrade(int a)throws IllegalArgumentException{
		double e=0;
	int i;
	double k=0.1;
	double d=0.7;
	if(a<0||a>100){
		 throw new IllegalArgumentException();
	}
	
	else if(a<60){
		e=0;
		
	}else if(a>=60&&a<=62){
		e=0.7;
		
	}else if(a>=95){
		e=4.0;
		
	}

	else if(a>=63&&a<=94){
		i=a-62;
		
		e=d+i*k;
		
	
		
	}
	
return e;

	}
}
