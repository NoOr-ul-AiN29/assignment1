public class Artwork{
	
	private String tittle;
	private int year;
	private Artist A;
	
	Artwork(String tittle,int year,Artist a){
	this.tittle=tittle;
	this.year=year;
	this.A=a;
	
	}
	
	Artwork(){
	tittle="Default tittle";
	year=0;
	A=new Artist();
	
	}
	
	Artwork(Artwork a1){
	this.tittle=a1.tittle;
	this.year=a1.year;
	this.A=new Artist(a1.A);
	//this.A=a.getname();  for shallow copy
	
	}
	
	public void settitle(String tittle){
	this.tittle=tittle;
	}
	public String gettittle(){
	return tittle;
	}
	
	public int getyear(){
	return year;
	}
	
	public Artist getA(){
	return A;
	}
	
	public void display(){
	System.out.println("The tittle of artist is : "+tittle);
	System.out.println("The year of artist is : "+year);
	System.out.println("The name of artist is : "+A.getname());

	
	
	}

	
	}
