package Collection3;

public class Car {

	private int price;
	private String color;
	private int noOfSeats;
	
	public Car(String brand,int price,String color,int noOfSeats) {
	this.brand=brand;
	this.price=price;
	this.color=color;
	this.noOfSeats=noOfSeats;
	}

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

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Car brand=" + brand + ", price=" + price + ", color=" + color + ", noOfSeats=" + noOfSeats + "";
	}
	
	
	}
	





