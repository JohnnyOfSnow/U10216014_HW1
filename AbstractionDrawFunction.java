/**
 * Name: Johnny
 * ID: U10216014
 * Ex: 15.1
 * Information: 
 *      The exercise can let student learn Inheritance , abstract class use, and override a method.
 *
 *      The exercise you need to write seven fuction to inheritance the abstract class in order to 
 *      override the method f(x) in AbstractionDrawFunction class. Then, let user can enter a number
 *      to get answer from the seven functions.
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.*;

public abstract class AbstractionDrawFunction extends JPanel {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a scanner to enter data from keyboard.
		preface();
		int yourChoose = chooseFunction();
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("Please enter a variable x in order to calculate the answer: ");
		double x = input.nextDouble();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("You enter the variable x is: " + x);
		getFunctionCall(yourChoose,x);
	}
	
	static void getFunctionCall(int yourChoose, double x) {
		switch(yourChoose) {
			case 1:  System.out.println("The x * x result is " + new functionOne().f(x));
					 break;
			case 2:  System.out.println("The sin(x) result is " + new functionTwo().f(x));
					 break;
			case 3:  System.out.println("The cos(x) result is " + new functionThree().f(x));
					 break;
			case 4:  System.out.println("The tan(x) result is " + new functionFour().f(x));
					 break;
			case 5:  System.out.println("The cos(x) + 5 * sin(x) result is " + new functionFive().f(x));
					 break;
			case 6:  System.out.println("The 5 * cos(x) + sin(x) result is " + new functionSix().f(x));
					 break;
			case 7:  System.out.println("The log(x) + x * x result is " + new functionSeven().f(x));
					 break;
			default: System.out.println("You have the error!");
		}
	}

	// Use to tell the user what the program do.
	static void preface() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("The program can enter a number to get the answer that you choose a function.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1. x * x");
		System.out.println("2. sin(x)");
		System.out.println("3. cos(x)");
		System.out.println("4. tan(x)");
		System.out.println("5. cos(x) + 5 * sin(x)");
		System.out.println("6. 5 * cos(x) + sin(x)");
		System.out.println("7. log(x) + x * x");
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("Please enter a integer to choose what function you want to get answer: ");
	}

	// The method use to enter a integer for choosing function(and verson 1.2 add the data type check)
	static int chooseFunction() {
		Scanner input2 = new Scanner(System.in);
		boolean correct = true;
		int option = 0;
		// The loop will stop, if user can enter a vaild number.
		do {
			try {
				option = input2.nextInt();
				/**
			 	*  In try block there are two condition:
				*  case1: The number is not in 1 ~ 7 , so user should enter a number again.
				*  case2: The number is correct(data type is int, and in 1 ~ 7).
				* 	  It is caught by catch (InputMismatchException ex), and execute.
				*/
				if(option > 0 && option < 8){
					correct = false; 
					System.out.println("You have decided the fuction you want to use");
				} else {
					System.out.print("Please a integer from 1 to 7 to choose your function: ");
				}	
				
			}
			catch (InputMismatchException ex) {
				System.out.print("Please a integer from 1 to 7  to choose your function: ");
				input2.nextLine(); // Discard input
			}
		} while(correct);
		return option;
	}
	
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

// class functionOne is x * x
class functionOne extends AbstractionDrawFunction {

	functionOne() {

	}

	@Override // Override the AbstractionDrawFunction's f(x) method
	double f(double x) {
		double result = 0;
		result = x * x;
		return result;
	}
}

// class functionTwo is sin(x)
class functionTwo extends AbstractionDrawFunction {

	functionTwo() {

	}

	@Override // Override the AbstractionDrawFunction's f(x) method
	double f(double x) {
		double result = 0;
		result = Math.sin(x);
		return result;
	}
}

// class functionThree is cos(x)
class functionThree extends AbstractionDrawFunction {

	functionThree() {

	}

	@Override // Override the AbstractionDrawFunction's f(x) method
	double f(double x) {
		double result = 0;
		result = Math.cos(x);
		return result;
	}
}

// class functionFour is tan(x)
class functionFour extends AbstractionDrawFunction {

	functionFour() {

	}

	@Override // Override the AbstractionDrawFunction's f(x) method
	double f(double x) {
		double result = 0;
		result = Math.tan(x);
		return result;
	}
}

// class functionFive is cos(x) + 5 * sin(x)
class functionFive extends AbstractionDrawFunction {

	functionFive() {

	}

	@Override // Override the AbstractionDrawFunction's f(x) method
	double f(double x) {
		double result = 0;
		result = (Math.cos(x)) + (5 * Math.sin(x));
		return result;
	}
}

// class functionSix is 5 * cos(x) + sin(x)
class functionSix extends AbstractionDrawFunction {

	functionSix() {

	}

	@Override // Override the AbstractionDrawFunction's f(x) method
	double f(double x) {
		double result = 0;
		result = (5 * Math.cos(x)) + (Math.sin(x));
		return result;
	}
}

// class functionSeven is log(x) + x * x
class functionSeven extends AbstractionDrawFunction {

	functionSeven() {

	}

	@Override // Override the AbstractionDrawFunction's f(x) method
	double f(double x) {
		double result = 0;
		result = (Math.log10(x)) + (x * x);
		return result;
	}
}
