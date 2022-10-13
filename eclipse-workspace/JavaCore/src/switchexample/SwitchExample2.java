package switchexample;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		String basicColor = "blue";
		// Scanner scn=new Scanner(System.in);
		// String basicColor=scn.next();
		switch (basicColor) {
		case "blue":
			System.out.println("You got blue");
			break;
		case "red":
			System.out.println("You got red");
			break;
		case "green":
			System.out.println("You got green");
			break;
		default:
			System.out.println("Not a valid color");
		}
		System.out.println("End of program");

	}

}
