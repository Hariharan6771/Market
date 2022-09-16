package ForLoop2;

public class CheckNewStartsWith {
	public static  void main(String[] args) {
    String[] names= {"surya","viji","suresh","preethi","kmn"};
    int count=0;
    int temp=0;
    for(int i=0;i<names.length;i++) {
    if(names[i].startsWith("s")) {
    count++;
    System.out.println("Name start"+" "+names[i]);
    }
    else {
    temp++;
    System.out.println("Names not start"+" "+names[i]);
    }
    }
    System.out.println("Count="+count);
    System.out.println("Count="+temp);

	}

}
