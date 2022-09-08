package sub1;

public class Test {
	
	

	public static void main(String[] args) {
		
		
		int sum = 0;

		int i = 0;

		for(i = 1; i <= 10; i++) {

			if(i % 2 != 0)

				continue;

			sum += i;

	}

		System.out.printf("%d", i + sum);

	
}
}


