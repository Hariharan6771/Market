package day4;

public class UsedWaterBottle {
	public static void main(String[] args) {
		String[] detail=args[0].split(",");
		WaterBottle w1=new WaterBottle();
		w1.brand=detail[0];
		w1.price=Integer.parseInt(detail[1]);
		w1.material=detail[2];
		w1.weight=detail[3];
		String total=(w1.brand+w1.material+w1.weight);
		System.out.println(total);
		System.out.println("Brand="+w1.brand+" "+"Material="+w1.material+" "+"total="+total);
		
	    }

}
