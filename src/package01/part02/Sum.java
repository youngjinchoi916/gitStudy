package package01.part02;

public class Sum {

	public static void main(String[] args) {
		System.out.println("[1~20까지의 합 구하기]");
		int sum = 0;
		
		for(int i=0 ; i<21 ; i++) {
			sum += i;
		}
		System.out.println("sum : "+sum);

	}

}
