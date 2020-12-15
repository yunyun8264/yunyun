package java02

public class App2 {
	public static void main(String[] args) {		
		
		long sum = 0;
		for (long i = 1; i <= 2147483647; i++) {
			if (i % 2 !=0) {
				sum += i;
			}
			}
		System.out.println("1-2147483647的奇数为："+sum);
		}
		
	}
