package Collection2;

public class Car {
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNoPlate() {
		return noPlate;
	}
	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	private int price;
	private String color;
	private String noPlate;
	private boolean isAutomatic;
	
	public Car(String brand,int price, String color,String noPlate,boolean isAutomatic) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.noPlate=noPlate;
		this.isAutomatic=isAutomatic;
	}
	public String toString() {
		return "Brand="+brand+" "+"Price="+price+" "+"Color="+color+" "+"NoPlate="+noPlate+" "+"IsAutomatic="+isAutomatic;
	}
	
	}
	
	


