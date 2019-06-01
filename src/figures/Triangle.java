package figures;

public class Triangle extends Figure implements Calcs {
	/*
	 * p1---p2
	 * 	\	|
	 * 	 \	|
	 * 	  \	|
	 * 	   \|
	 * 		p3
	 */
	public Triangle() {}
	
	public Triangle(Point p1, Point p2, Point p3) {
		setP1(p1);
		setP2(p2);
		setP3(p3);
	}
	
	// Obwod trojkata
	public double perimeter() {
		return Line.length(p1, p2) + Line.length(p2, p3) + Line.length(p3, p1);
	}
	
	// Pole trojkata
	public double area() {
		double a = Line.length(p1, p2);
		double b = Line.length(p2, p3);
		double c = Line.length(p3, p1);
		
		//wzor Herona
		//polowa obwodu
		double halfPerimeter = perimeter()/2;
		// pole ze wzoru P=sqrt(p*(p-a)(p-b)(p-c))
		return Math.sqrt(halfPerimeter*((halfPerimeter - a)*(halfPerimeter - b)*(halfPerimeter - c)));
	}
	
	public void display() {
		System.out.printf("Obwod trojkata: %.2f \n", perimeter());
		System.out.printf("Pole trojkata: %.2f \n", area());
	}

}
