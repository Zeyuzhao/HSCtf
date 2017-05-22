import java.io.File;
import java.util.Scanner;

public class LargePrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(new File("primes.txt"));
		
		String[] list;
		
		String in = "";
		while (reader.hasNextLine()){
			in += reader.nextLine();
		}
		
		list = in.split(",");
		
		int[] primes = new int[list.length];
		for (int x = 0; x < list.length; x++){
			primes[x] = Integer.parseInt(list[x]);
		}
		System.out.println(primes);
	}

}
