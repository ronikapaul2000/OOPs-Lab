import java.util.Scanner;
class Sports{
    String spo;
    int ratings;
    Sports(String s,int r)
    {
        spo=s;
        ratings=r;
    }
}
class Student1 extends Sports{
    String grade;
    double overall_per;
    Student1(String s,int r,String g,double per)
    {
        super(s,r);
        grade=g;
        overall_per=per;
    }

}
public class Result extends Student1{
    Result(String s,int r,String g,double per)
    {
        super(s,r,g,per);
    }
    void display()
        {   
            System.out.println("\n\n..........Sports Details of Student...........");
            System.out.println("Sport : "+spo);
            System.out.println("Rating : "+ratings);
            System.out.println("\n.........Academic Details of Student..........");
            System.out.println("Academic Grade : "+grade);
            System.out.println("Overall percentage : "+overall_per);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n!!!!!!!!!!!!!!Enter the Sports Details of Student!!!!!!!!!!!!!");
        System.out.print(" Sport: ");
        String s=sc.next() + sc.next();
        System.out.print(" Sport Rating out of 10: ");
        int r=sc.nextInt();
        System.out.println("\n!!!!!!!!!!!!!!Enter the Academic Details of Student!!!!!!!!!!!!!");
        System.out.print(" Academic Grade: ");
        String g=sc.next();
        System.out.print(" Overall percentage: ");
        double per=sc.nextDouble();
        sc.close();
        Result res=new Result(s,r,g,per);
        res.display();    
    }
}