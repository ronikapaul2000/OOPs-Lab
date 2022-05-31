import java.util.*;
import java.lang.*;

interface shapes {
    float pi = 3.14F;
    float area();
    float perimeter();
}

class circle implements shapes {
    Scanner sc = new Scanner(System.in);
    int r;

    public float area() {
        System.out.print("Enter the radius : ");
        r = sc.nextInt();
        return (pi * r * r);

    }

    public float perimeter() {
        System.out.print("Enter the radius : ");
        r = sc.nextInt();
        return (2 * pi * r);
    }

}

class rectangle implements shapes {
    Scanner sc = new Scanner(System.in);
    int l, b;

    public float area() {
        System.out.print("Enter the Length : ");
        l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        b = sc.nextInt();
        return (l * b);

    }

    public float perimeter() {
        System.out.print("Enter the Length : ");
        l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        b = sc.nextInt();
        return (2 * (l + b));

    }
}

class lab17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        rectangle r = new rectangle();
        int ch;
        while (true) {
            System.out.println("1:Area of Circle");
            System.out.println("2:Perimeter of Circle");
            System.out.println("3:Area of Rectangle");
            System.out.println("4:Perimter of Rectangle");
            System.out.println("5:EXIT");
            System.out.println("enter choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    float ar = c.area();
                    System.out.println("Area  :" + ar);
                    break;
                case 2:
                    float pr = c.perimeter();
                    System.out.println(pr);
                    break;
                case 3:
                    float a = r.area();
                    System.out.println("Area :" + a);
                    break;
                case 4:
                    float pr1 = r.perimeter();
                    System.out.println(pr1);
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                default:
                    System.out.println("invalid!");

            }
            sc.close();
        }

    }
}
