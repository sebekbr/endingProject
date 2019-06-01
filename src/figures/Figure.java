package figures;

public abstract class Figure implements Calcs{

	protected int pointsQuantity; // ilosc wierzcholki figur
	protected double mountPointX, mountPointY; // punkt zamontowania w ukladzie wspolrzednych
	protected Point p1 = new Point(); // wierzcholki 
	protected Point p2 = new Point();
	protected Point p3 = new Point();
	protected Point p4 = new Point();
	
	public Figure() { // konstruktor figury
	}
	
	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public Point getP4() {
		return p4;
	}

	public void setP4(Point p4) {
		this.p4 = p4;
	}

	public void display() {}
}