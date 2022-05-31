import java.util.*;
class publisher
{
String pubname;
publisher(String pub){
this.pubname=pub;
}
}
class Books extends publisher{
	String Bookname;
	Books(String pub,String B){
        super(pub);
        Bookname=B;
    }  
}
class Literature extends Books{
  String Litname;
  Literature(String pub,String B,String L)
  {
    super(pub, B);
    Litname=L;
  }
  void display(){
    System.out.println("..........................................");
    System.out.println("Publisher name :"+super.pubname);
    System.out.println("Bank Name :"+super.Bookname); 
    System.out.println("Literature Name :"+Litname);  
    System.out.println("..........................................");
  }
}
class Fiction extends Books{
  String ficname;
  Fiction(String F,String pub,String B)
  {
    super(pub, B);
    ficname=F;
  }
  void display(){
    System.out.println("..........................................");
    System.out.println("Publisher name :"+super.pubname);
    System.out.println("Bank Name :"+super.Bookname); 
    System.out.println("Fiction Name"+ficname); 
    System.out.println("..........................................");
  }
}
class pub{
  public static void main(String[] args) {
    String pub_name, book_name,lit_name,fic_name;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the pub_name");
    pub_name=s.next();
    System.out.println("enter the book_name");
    book_name=s.next();
    System.out.println("enter the Lit_name");
    lit_name=s.next();
    System.out.println("enter the fic_name");
    fic_name=s.next();
    Literature obj1=new Literature(pub_name,book_name,lit_name);
    Fiction obj2=new Fiction(pub_name,book_name,fic_name);
    obj1.display();
    obj2.display();
    s.close();
  }
}
