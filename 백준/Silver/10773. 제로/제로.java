
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// TODO Auto-generated method stub
		
		int input, sum = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			input = scanner.nextInt();
			if(input != 0) {
				list.add(input);
			} else {
				list.remove(list.size()-1);
			}
		}
		
		while(!list.isEmpty()) {
			sum += list.remove(0);
		}
		
		System.out.print(sum);	
		
		
		

	}
}