public class U10216014_HW1 {
	public static void main(String[] args) {
		
	}
}

public abstract class AbstractionDrawFunction extends JPanel {
	/** Polygon to hold the points */
	private Polygon p = new Polygon();

	protected AbstractionDrawFunction() {
		drawFunction();
	} 

	/** Return the y-coordinate */
	abstract double f(double x);

	/** Obtain points for x-coordinates 100, 101, ..., 300 */
	public void drawFunction() {
		for (int x = -100; x <= 100; x++) {
			p.addPoint(x + 200, 200 - (int)f(x));
		}
	}

	@Override /** Draw axes, labels, and connect points */
	protected void paintComponent(Graphics g) {
		// To be completed by you
	}
}

class functionOne extends AbstractionDrawFunction {

	functionOne() {

	}

	@Override
	double f(double x) {
		double result = 0;
		result = x * x;
		return result;
	}
}

class functionTwo extends AbstractionDrawFunction {

	functionTwo() {

	}

	@Override
	double f(double x) {
		double result = 0;
		result = Math.sin(x);
		return result;
	}
}
