package Java_study;

public class If {

	public static void main(String[] args) {
		int a=5;
		if(a==2){
			System.out.println("aは2です");
			System.out.println("それ以上でも以下でもないです");

		}else if(a==1){
			System.out.println("aは2ではないが1です");
		}else if(a<3){
			System.out.println("aは2ではなく1でもないが、3未満です");
		}else{
			System.out.println("aは2ではなく1でもないし、3以上です");
		}

	}

}