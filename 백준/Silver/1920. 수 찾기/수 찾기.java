
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		HashSet<Integer> feild = new HashSet<>();
		int input =  0;
		for(int i = 0; i < n; i++) {
			input = scanner.nextInt();
			feild.add(input);
		}
		
		int m = scanner.nextInt();
		for(int i = 0; i < m; i++) {
			input = scanner.nextInt();
			if(feild.contains(input)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		

	}
}