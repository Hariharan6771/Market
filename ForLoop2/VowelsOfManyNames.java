package ForLoop2;

public class VowelsOfManyNames {
	public static void main(String[] args) {
	String[] names= {"surya","viji","suresh","preethi","kmn"};
	int count=0;
	int temp=0;
	
	for(int i=0;i<names.length;i++) {
	String a=names[i].toUpperCase();
	if(a.contains("A")||a.contains("E")||a.contains("I")||a.contains("O")||a.contains("U")) {
    count++;
	System.out.println(names[i]+" "+"is vowel present");
	}
	else {
	temp++;
    System.out.println(names[i]+" "+"vowel not present");
	}
	} 
	System.out.println("Count="+count);
	System.out.println("Count="+temp);
	}

}
