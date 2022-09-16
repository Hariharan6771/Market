package Collection3;

public class Student {
	private String name;
	private int id;
	private String branch;
	private int mark;
	
	public Student(String name,int id,String branch,int mark) {
		this.name=name;
		this.id=id;
		this.branch=branch;
		this.mark=mark;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		mark = mark;
	}
	public String toString() {
		return "Name="+name+" "+"Id="+id+" "+"Branch="+branch+" "+"Marks="+mark;
	}

}
