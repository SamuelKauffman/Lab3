import java.util.Scanner;
public class Lab3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of miles driven: ");
		double MyNum1= scan.nextDouble();
		System.out.println("Eneter the number of gallons in the tank:");
		double MyNum2= scan.nextDouble();
		System.out.println("The MPG is " + (MyNum1/MyNum2));
		
	}

}
