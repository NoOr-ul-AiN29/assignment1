public class Artist{
	private String name;
	
	Artist(){
	this.name="Default name";
	}

	Artist(String name){
	this.name=name;
	
	}
	public void setname(String name){
	this.name=name;
	}
	
	public String getname(){
	return name;
	}
	
	public void display(){
	System.out.println("The name of artist is : "+name);
	}
	
	
	
	}