import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class MasterMind {

	public static void main(String[] args) {
		int maxtry = 0;
		final int n = 4;
		final int m = 6;
		Random rnd = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			arr.add(rnd.nextInt(m) + 1);
		}
		System.out.println(arr);
		
		
		while (maxtry <= 10) {
		System.out.print("Choisissez un chiffre entre [1.." + m + "]? ");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr2.add(input.nextInt(m + 1));
		}
		System.out.println(arr2);
		
		
		

		for (int i = 0; i < arr2.size(); ++i) {
			if (arr2.get(i) == arr.get(i)) {
				System.out.println("#");

			} else if (arr.contains(arr2.get(i))) {
				System.out.println("O");
			}

		}
		maxtry++;
		System.out.print("oops ! mauvaise réponse .. vous pouvez réssayer  ");
		}
		
	}
	
	

}
