class vehicle
{
	int vehno;
	String vehname,model;
	vehicle()
	{
	}
	void display()
	{
		  System.out.println("Vehicle Number   : "+vehno);
		  System.out.println("Vehicle Name     : "+vehname);
		  System.out.println("Vehicle Model    : "+model);
	}
	vehicle(int n,String na,String m)
	{
		vehno=n;
		vehname=na;
		model=m;
	}
}
public class veh1
{
	public static void main(String args[])
	{
		vehicle[] v=new vehicle[3];
		System.out.println("Vehicle Details\n");
		v[0]=new vehicle(1,"Tesla","ModelX\n");
		v[1]=new vehicle(2,"Ford","Mustang\n");
		v[2]=new vehicle(3,"Audi","A4\n");
		v[0].display();
		v[1].display();
		v[2].display();
	}
}

	
	