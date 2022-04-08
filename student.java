import java.util.*;
class stud1
{
	int studid;
	String studname;
	int mark1,mark2,mark3,total,avg;
	stud1()
	{
	  studid=101;
	  studname="Anly";
	  mark1=60;
	  mark2=80;
	  mark3=90;
	}
	void display()
	{
	  System.out.println("Student id   : "+studid);
	  System.out.println("Student name : "+studname);
	  System.out.println("Mark1        : "+mark1);
	  System.out.println("Mark2        : "+mark2);
	  System.out.println("Mark3        : "+mark3);
	  System.out.println("Total        : "+(mark1+mark2+mark3));
	  System.out.println("Average      : "+(mark1+mark2+mark3/3));
	}
	stud1(int sid,String sname,int m1,int m2,int m3)
	{
		studid=sid;
		studname=sname;
		mark1=m1;
		mark2=m2;
		mark3=m3;	
	}
   stud1(int m1,int m2,int m3)
   {
	  mark1=m1;
	  mark2=m2;
	  mark3=m3;	  
   }	   
}
public class student
{
public static void main(String args[])
{
	stud1 s1=new stud1(100,"Romit",90,87,94);
	System.out.println("Student Details");
	System.out.println("\n");
	System.out.println("Student one  :");
	System.out.println("\n");
	s1.display();
	stud1 s2=new stud1();
	System.out.println("\n");
	System.out.println("Student Two  :");
	System.out.println("\n");
	s2.display();
	stud1 s3=new stud1(70,85,89);
	System.out.println("\n");
	System.out.println("Student Three  :");
	System.out.println("\n");
	s3.studid=102;
	s3.studname="Cherry";
	/*s3.mark1=70;
	s3.mark2=85;
	s3.mark3=89;*/
	s3.display();
	
}
}
	