package condition;

public class UseWatch {
	public static void main(String[] args) {
		Watch w1=new Watch();
		w1.brand="TITAN";
		w1.price=150000;
		w1.taxAmount=5000;
		w1.colour="Red";
		w1.isSmart=true;
		
		Watch w2=new Watch();
		w2.brand="SONATO";
		w2.price=1500;
		w2.taxAmount=150;
		w2.colour="WHITE";
		w2.isSmart=false;
		
		if(w1.price>w2.price) {
			System.out.println(w1.brand);
		}
		else {
			System.out.println(w2.brand);
		}
		

		
		
	}

}
