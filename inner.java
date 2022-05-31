class CPU
{
	int price=5000;
	class processor
		{
			int nop=6;
			String manf="Paul Vessly";
		}
	static class RAM
	  {
			static String mem="4 GB";
			String manf="Ian Somerhalder";
	  }
		
}
public class inner
{
	public static void main(String args[])
	{
		CPU cpu=new CPU();
		CPU.processor pro=cpu.new processor();
		System.out.println("No.of ports in the processor: "+pro.nop);
		System.out.println("Name of the manufacturer: "+pro.manf);
		System.out.println("Size of the memory: "+CPU.RAM.mem);
		CPU.RAM ram=new CPU.RAM();  
		
		System.out.println("Name of the manufaturer: "+ram.manf);	
	}
}	