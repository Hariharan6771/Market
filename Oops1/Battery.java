package Oops1;

public class Battery {
	private int length;
	private String color;
	private boolean isSmartLook;
	
	public Battery(int length,String color,boolean isSmartLook) {
		this.length=length;
		this.color=color;
		this.isSmartLook=isSmartLook;
		
	}
	public void setlength(int length) {
		 this.length=length;
	 }
	 public int getlength() {
		 return length;
		 }
	 public void setcolor(String color) {
		 this.color=color;
	 }
	 public String getcolor() {
		 return color;
		 
	 }
	 public void setisSmartLook(boolean isSmartLook) {
		 this.isSmartLook=isSmartLook;
	 }
	 public boolean getisSmartLook() {
		 return isSmartLook;
	 }
	 public String toString() {
		 return "Length="+length+" "+"Color="+color+" "+"SmartLook="+isSmartLook;
	 }

	
}
