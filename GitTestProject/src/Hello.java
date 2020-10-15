import java.util.*;

public class Hello {

	public static void main(String[] args) {
		String message = "hello";
		Scanner s = new Scanner(System.in);
		
		//ask user for number
		System.out.println("enter a number: ");
		int num = s.nextInt();
		// print message num times
		for(int i = 0; i < num ; i++) {
			System.out.println(message);
		}
	}

}
