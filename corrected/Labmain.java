public class Labmain{

	public static void main(String args[]){
	Artist a1=new Artist();

	// displaying the first artist
	a1.display();
	
	Artist a2=new Artist("Artist2");
	//displaying the second artist
  	a2.display();
	
	System.out.println(".................................................");
	
	Artwork A1=new Artwork();
	
	A1.display();
	
	// shallow copy
	Artist A2=A1;
	//deep copy
	Artist A3=new Artist(A2);
	
	
	
	
	}
	
	
	
	
	
	
	
	}