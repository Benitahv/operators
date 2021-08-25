package Assignment1;
import java.util.Scanner;

public class ques7 {

	public static void main(String[] args) {
		float p,r,t,si;
		Scanner SC = new Scanner(System.in);
		p=SC.nextFloat();
		r=SC.nextFloat();
		t=SC.nextFloat();
		si=p*r*t/100;
		System.out.println("simple interest"+si);

	}

}
