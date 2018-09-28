import java.util.Scanner;
public class LogicOP {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Boolean b = false;
		System.out.println("Enter a number from 1 to 9");
		int x = sc.nextInt();
		System.out.println("Enter another number from 1 to 9");
		int y = sn.nextInt();
		while (!b) {
			if (x > 8 && y > 8) {
				b = true;
			}
			else {
				if (x > 8 || y > 8) {
					b = true;
				}
				else {
					x = x + 1;
				}
			}
		}
	}
}

