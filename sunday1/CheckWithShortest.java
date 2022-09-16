package sunday1;

public class CheckWithShortest {
	public static void main(String[] args) {
		int ram=142;
		int ravi=169;
		int arun=137;
		int sai=155;
		if (ram<ravi && ram<=arun && ram<=sai) {
			System.out.println("Ram Shortest");
		}
		else if(ravi<arun && ravi<=sai&& ravi<=ram) {
			System.out.println("Ravi shortest");
		}
		else if(arun<sai && arun<=ram && arun<=ravi) {
			System.out.println("Arun shortest");
		}
		else {
			System.out.println("pai shortest");
			
		}
	}

}
