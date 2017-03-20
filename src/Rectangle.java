/*   inherit Rectangle from Figure */
public class Rectangle extends Figure {
	double Dim1 = 4;// initialization of variable
	double Dim2 = 3.14;

	/* method declare */
	public void findArea() {
		/* logic */
		double Area = Dim1 * Dim1;
		System.out.println("Area of  Rectangle =" + Area); // output
	}/* method declare */

	public void findPerimeter() {
		/* logic */

		double Per = 2 * (Dim1 + Dim2);

		System.out.println("Perimeter of  Rectangle =" + Per);// output

	}/* main method */

	public static void main(String[] args) {
		/* object creation */
		Rectangle obj = new Rectangle();
		/* calling method */
		obj.findArea();
		obj.findPerimeter();
	}
}
