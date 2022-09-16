package Collections1;

public class StoryBook {
private	int id;
private	String author;
private String title;
private	int price;


public StoryBook(int id,String author,String title, int price) {
	this.id=id;
	this.author=author;
	this.title=title;
	this.price=price;
}
public void setid(int id) {
	this.id=id;
}
public int getid() {
	return id;
}
public void setauthor(String author) {
	this.author=author;
}
public String getauthor() {
	return author;
}
public void settitle(String title) {
	this.title=title;
}
public String gettitle() {
	return title;
}
public void setprice(int price) {
	this.price=price;
}
public int getprice() {
	return price;
}

public String toString() {
	return "Title:"+" "+title+","+" "+"Author:"+" "+author;
}

}
