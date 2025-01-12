
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// TODO Auto-generated method stub
		
		
		List <Integer> queue = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			queue.add(i+1);
		}
		
		int size = n;
		while(size > 1) {
			queue.remove(0);
			queue.add(queue.remove(0));
			size--;
		}
		System.out.println(queue.remove(0));	
		
		
	}
}