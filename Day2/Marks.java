package Day2;

public class Marks {
	public static void main(String[] args) {
		StudentsMark hari=new StudentsMark();
		hari.tamil=90;
		hari.english=52;
		hari.maths=50;
		hari.science=56;
		hari.social=44;
		System.out.println(hari.tamil+" "+hari.english+" "+hari.maths+" "+hari.science+" "+hari.social);
		hari.total=hari.tamil+hari.english+hari.maths+hari.science+hari.social;
		System.out.println(hari.total);
		hari.average=hari.total/5;
		System.out.println(hari.average);
		
		
		StudentsMark mani=new StudentsMark();
		mani.tamil=50;
		mani.english=50;
		mani.maths=56;
		mani.science=98;
		mani.social=48;
		System.out.println(mani.tamil+" "+mani.english+" "+mani.maths+" "+mani.science+" "+mani.social);
		mani.total=mani.tamil+mani.english+mani.maths+mani.science+mani.social;
		System.out.println(mani.total);
		mani.average=mani.total/5;
		System.out.println(mani.average);
			
	
		

		
		
			
		
	}

}
