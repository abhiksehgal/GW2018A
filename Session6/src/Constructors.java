class Point{
	
	// Attributes
	int x;
	int y;
	
	// Method
	
	// Constructor
	/*Point(){
		x = 0;
		y = 0;
	}*/
	
	// Default
	Point(){
		x = 1;
		y = 1;
		System.out.println("this is: "+this);
	}
	
	// Parameterized (As it is expecting some inputs)
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+":"+y);
	}
}

public class Constructors {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setPoint(10, 20);
		
		Point p2 = new Point();
		
		Point p3 = new Point(100,200);
		
		System.out.println("p1 is: "+p1);
		System.out.println("p2 is: "+p2);
		System.out.println("p3 is: "+p3);
		
		p1.showPoint();
		p2.showPoint();
		p3.showPoint();

	}

}
