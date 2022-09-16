package Collections1;

public class UseStoryBook {
	public static void main(String[] args) {
    int id=Integer.parseInt(args[0]);
    String author=args[1];
    String title=args[2];
    int price=Integer.parseInt(args[3]);
	StoryBook s=new StoryBook(id,author,title,price);
	System.out.println(s);
	}

}
