package package01.part02.sec01_if;

public class GenderCheck {

	public static void main(String[] args) {
		String ssn = "123123-1022333";
		
		String gender = ssn.substring(7, 8);
		
		//System.out.println(gender);
		System.out.println(gender.equals("1"));
		System.out.println(gender == "1");
		
		if(gender.equals("1") || gender.equals("3")) {
			System.out.println("남자");
		} else if(gender.equals("2") || gender.equals("4")) {
			System.out.println("여자");
		}
		

	}

}
