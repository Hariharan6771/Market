package Collection3;

public class Employee {
	private String name;
	private String desig;
	private int id;
	private int age;
	private int sal;
	private int exp;

	public Employee(String name, String desig, int id, int age, int sal, int exp) {
		this.name = name;
		this.desig = desig;
		this.id = id;
		this.age = age;
		this.sal = sal;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String toString() {
		return "Name=" + name + " " + "Designation=" + desig + " " + "ID=" + id + " " + "Age=" + age + " " + "Salary="
				+ sal + " " + "Experience=" + exp;
	}

}
