package Home_work;

public class Test {

	public static void main(String[] args) {
		int National_language_test=100;
		int Math_test=38;
		int total_test_score=National_language_test+Math_test;
			System.out.println(total_test_score);
		if (National_language_test<39||Math_test<39)
			System.out.println("’ÇŽŽ");
		else if(total_test_score>160)
			System.out.println("—D");
		else if(total_test_score>140&&total_test_score<159)
			System.out.println("—Ç");
		else if(total_test_score>101&&total_test_score<139)
			System.out.println("‰Â");
		else
			System.out.println("’ÇŽŽ");
	}

}