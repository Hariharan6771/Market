package Oops3;

public class SmartPhone implements Phone {
	public void calling() {
	System.out.println("Its is Support Voice Calling");	
	}
    public String Software(String brand) {
    if(brand.equals("Apple")) {
	return "IOS";
    }
    else {
	return "Android";
}

}
}