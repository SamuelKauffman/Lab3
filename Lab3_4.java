import java.util.Scanner;
public class Lab3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first floating point number: ");
		float MyNum1 = scan.nextFloat();
		System.out.println("Enter your second floating point number: ");
		float MyNum2 = scan.nextFloat();
		System.out.println("The sum is " + (MyNum1+=MyNum2));
		System.out.println("The difference is " + (MyNum1-=MyNum2));
		System.out.println("The product is " + (MyNum1*=MyNum2));
		
	}

}
