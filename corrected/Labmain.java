import java.util.Scanner;
public class Labmain{

	public static void main(String args[]){
	Artist a1=new Artist();
	
	// displaying the first i.e., default artist
	System.out.println("Displaying the name of default Artist");

	a1.display();
	System.out.println(".................................................");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the name of second artist artist: ");
	String artist2=sc.nextLine();

	Artist a2=new Artist(artist2);
	//displaying the second artist  
  	a2.display();
	
	System.out.println(".................................................");
	
	Artwork A1=new Artwork();
	
	System.out.println("Displaying the artwork of default Artist");
	
	A1.display();
	
	System.out.println(".................................................");

	System.out.println("Enter the tittle of second Artist");
	String t2=sc.nextLine();

	System.out.println("Enter the year of second Artist");
	int y2=sc.nextInt();
	sc.nextLine();
	
	Artwork A2=new Artwork(t2,y2,a2);
	//displayig the artwork of 2nd artist
	System.out.println("The artwork of second Artist is: ");
	A2.display();
	System.out.println(".................................................");
	
	// shallow copy of Artwork 1 in Artwork 3
	System.out.println("                                     MAKING SHALLOW COPY OF ARTWORK 1 IN ARTWORK 3!                   ");
	Artwork A3=A1;
	System.out.println("Displaying the 3rd Artwork");
	A3.display();
	System.out.println(".................................................");

	System.out.println("Enter the tittle of artwork 3 that you want to change");
	String t3=sc.nextLine();
	A3.settitle(t3);
	System.out.println("After change, displaying artwork 3");
	A3.display();


	System.out.println(".................................................");
	System.out.println("After change, displaying artwork 1");
	A1.display();
	System.out.println(".................................................");
	//deep copy
	Artwork A4=new Artwork(A2);
	System.out.println("                                     MAKING DEEP COPY OF ARTWORK 2 IN ARTWORK 4!                   ");
	System.out.print("Displaying Artwork 4");
	A4.display();
	System.out.println(".................................................");
	System.out.println("Enter the tittle you want to change in Artwork 4");
	String t4=sc.nextLine();
	A4.settitle(t4);
	System.out.println("After change, displaying artwork 4");
	A4.display();
	System.out.println(".................................................");
	System.out.println("After change, displaying artwork 2");
	A2.display();
	
	}
	
	
	
	
	
	
	
	}
