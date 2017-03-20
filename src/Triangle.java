/*   inherit Triangle from Figure */
public class Triangle extends Figure {
	double Dim1 = 3;// initialization of variable
	double Dim2 = 5;
	double Dim3 = 4;

	/* method declare */
	public void findArea() {
		/* logic */
		double Area = (Dim1 * Dim3) / 2;
		System.out.println("Area of  Triangle =" + Area); // output
	}/* method declare */

	public void findPerimeter() {
		/* logic */
		double Per = Dim1 + Dim2 + Dim3;

		System.out.println("Perimeter of  Triangle =" + Per); // output

	}/* main method */

	public static void main(String[] args) {
		/* object creation */
		Triangle obj = new Triangle();
		/* calling method */
		obj.findArea();
		obj.findPerimeter();
	}
}
