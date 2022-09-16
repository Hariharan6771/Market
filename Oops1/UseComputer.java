package Oops1;

public class UseComputer {
	public static void main(String[] args) {
	Cpu cpu=new Cpu();
	cpu.brand="HCL";
	cpu.ram="8GB";
	cpu.motherBoard="Ryzen";
	
	Cpu cpu1=new Cpu();
	cpu1.brand="Lenovo";
	cpu1.ram="6GB";
	cpu1.motherBoard="Intel";

	Computer c1=new Computer();
	c1.brand="Dell";
	c1.color="White";
	c1.price=50000;
	c1.isWindows=true;
	c1.cpu=cpu;
	
	Computer c2=new Computer();
	c2.brand="HP";
	c2.color="Blue";
	c2.price=25000;
	c2.isWindows=false;
	c2.cpu=cpu;
	
	Computer c3=new Computer();
	c3.brand="Acer";
	c3.color="White";
	c3.price=30000;
	c3.isWindows=true;
	c3.cpu=cpu1;
	
	Computer[] computers={c1,c2,c3};
	for(int i=0;i<computers.length;i++) {
	System.out.println(computers[i].brand+" "+computers[i].color+" "+computers[i].price+computers[i].cpu.brand+" "+computers[i].color+" "+computers[i].price+" "+computers[i].isWindows); 
    

	}
	
	System.out.println(c1.brand+" "+c1.color+" "+c1.price+" "+c1.isWindows+" "+c1.cpu.brand+" "+c1.cpu.ram+" "+c1.cpu.motherBoard+" "+c2.cpu.brand+" "+c2.cpu.ram+" "+c2.cpu.motherBoard);
	
	
	}

}
