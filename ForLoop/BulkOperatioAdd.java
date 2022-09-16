package ForLoop;

public class BulkOperatioAdd {
	public static void main(String[] args) {
    int num=12357;
    int temp=0;
    for (;num>0;) {
    int reminder=num%10;
    temp=temp+reminder;
    num=num/10;
    }
    System.out.println(temp);
	}

}
