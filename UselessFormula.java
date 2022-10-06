//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

import java.util.Scanner;

public class UselessFormula {	
	public static void GetInputsPrintCalculations(){
		int a = PromptInt("Enter en Integer a:");
		int b = PromptInt("Enter an Integer b:");
		
		PrintCalculations(a,b);
	}
	public static void PrintCalculations(int a, int b) {
		//Early return to avoid division by zero
		if(b == 0) {
			System.out.println("Calculation failed due to division by zero");
			return;
		}
		
		System.out.println(
				String.format("a^2/b is ~= %f", (double)a*a/b)
				);
		System.out.println(
				String.format("now with integers: %d R %d", (a*a)/b, (a*a)%b)
				);
	}
	public static int PromptInt(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextInt();
		
	}
}
