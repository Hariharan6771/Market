package Collections1;

public class EmployeeCons {
	private String name;
	private int id;
	private int sal;
	private String desig;
	
	public EmployeeCons(String name,int id,int sal,String desig) {
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.desig=desig;
	}
	public void setname(String name) {
		 this.name=name;
	 }
	 public String getname() {
		 return name;
	 }
	 public void setid(int id) {
		 this.id=id;
	 }
	 public int getid() {
		 return id;
	 }
	 public void sal(int sal) {
		 this.sal=sal;
	 }
	 public int getsal() {
		 return sal;
	 }
	 public void setdesig(String desig) {
		 this.desig=desig;
	 }
	 public String getdesig() {
		 return desig;
	 }




	
	public String toString() {
		return "name="+name+" "+"id="+id+" "+"sal="+sal+" "+"desig="+desig;
	}
		
	}
	


