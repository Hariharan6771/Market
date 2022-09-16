package Collection2;

public class Players {
 private String name;
 private int age;
 private int run;
 private int jerseyNo;
 private String teamName;
  
 public Players(String name,int age,int run,int jerseyNo,String teamName) {
	 this.name=name;
	 this.age=age;
	 this.run=run;
	 this.jerseyNo=jerseyNo;
	 this.teamName=teamName;
 }
 public void setname(String name) {
	 this.name=name;
 }
 public String getName() {
	 return name;
 }
 public void setage(int age) {
	 this.age=age;
 }
 public int getAge() {
	 return age;
 }
 public void setrun(int run) {
	 this.run=run;
 }
 public int getRun() {
	 return run;
 }
 public void setjerseyNo(int jerseyNo) {
	 this.jerseyNo=jerseyNo;
 }
 public int getJerseyNo() {
	 return jerseyNo;
 }
 public void setteamName(String teamNo) {
	 this.teamName=teamName;
 }
 public String getTeamName() {
	 return teamName;
 }

 public String toString() {
	 return "Name="+name+" "+"Age="+age+" "+"Runs="+run+" "+"Jersey NUmber="+jerseyNo+" "+"TeamName="+teamName;
 }

 
		
	}


