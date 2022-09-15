import java.util.Scanner; 
public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the first integer number: ");
		int MyNum1 = scan.nextInt();
		System.out.println("Enter the second integer number: ");
		int MyNum2 = scan.nextInt();
		System.out.println("Enter the third integer number: ");
		int MyNum3 = scan.nextInt();
		System.out.println("You Entered: " + MyNum1 + "," + MyNum2 + "," + MyNum3 + ",");
		System.out.println("The average is " + (MyNum1+MyNum2+MyNum3)/3);
	}

}
