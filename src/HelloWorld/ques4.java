package HelloWorld;
import java.util.Scanner;
public class ques4 {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner SC = new Scanner(System.in);
		x = SC.nextInt();
		y = SC.nextInt();
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swapping numbers without third vaule"+x +y);

	}

}
