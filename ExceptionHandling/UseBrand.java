package ExceptionHandling;

public class UseBrand {
	public static void main(String[] args)throws CheckBrand,Exception {
    String[] a= {"Reynolds","Apsara","Nataraj","Cello","Addgel"};
    try {
    for(int i=0;i<a.length;i++) {
    if(a[i].equals("fdgdg")){
    throw new CheckBrand("It is Found");
    }
    else {
    	System.out.println("It is not found");
    }
    }
    }catch(Exception e) {
    	e.printStackTrace();
    }finally {
    	System.out.println("Invalid");
    }
    }
    
    }
    
    
    
	


