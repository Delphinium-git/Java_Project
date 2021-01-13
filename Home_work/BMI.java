package Home_work;

public class BMI {

	public static void main(String[] args) {
		double body_weight =65.5;
		double height=1.72;
		double BMI=body_weight/(height*height);
			System.out.println(BMI);
		if (BMI>25)
			System.out.println("”ì–ž");
		else if (BMI>18.5&&BMI<24)
			System.out.println("•W€");
		else if (BMI<18.4)
			System.out.println("’á‘Ìd");
	}
}
