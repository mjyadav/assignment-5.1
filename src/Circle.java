/*   inherit circle from Figure */
public class Circle extends Figure {
	double Dim1 = 4; // initialization of variable
	double pi = 3.14;

	/* method declare */
	public void findArea() {
		/* logic */
		double Area = pi * Dim1 * Dim1;
		System.out.println("Area of circle =" + Area); // output
	} /* method declare */

	public void findPerimeter() {
		/* logic */
		double Dim2 = 2 * pi * Dim1;
		System.out.println("Perimeter of circle =" + Dim2);// output

	}

	/* main method */
	public static void main(String[] args) {
		/* object creation */
		Circle obj = new Circle();
		/* calling method */
		obj.findArea();
		obj.findPerimeter();
	}
}
