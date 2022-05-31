class outer
{
int x=10;
 class inner
 {
   int y=5;
 } 
}
public class Innerclasseg
{
public static void main(String args[])
{
outer obj1=new outer();
outer.inner obj2=obj1.new inner();
System.out.println(obj1.x);
System.out.println(obj2.y);
}
}