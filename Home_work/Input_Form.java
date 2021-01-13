package Home_work;
import java.util.Scanner;
public class Input_Form {

		public static void main(String[] args) {

		    // Scannerクラスのインスタンスを作成
		    // 引数で標準入力System.inを指定する
		    Scanner scanner = new Scanner(System.in);

		    // 入力を促すメッセージ
		    System.out.print("IDを入力してください");
		    System.out.print("パスワードを入力してください");

		    //入力された内容をインスタンスから取得　ここに入力値が入る
		    String input_ID = scanner.nextLine();
		    String input_password = scanner.nextLine();

		    String ID ="murakami";
		    String password ="taiki1201";
		    
		    if (ID==input_ID&&password==input_password)
		    System.out.print("ひらがなを入力してください");
		    
		    else　if(ID==input_ID&&password==input_password)
		    System.out.print("ログインIDが間違っています");
		    
		    else if　(ID==input_ID&&password==input_password)
		    		
		    //入力された内容を画面に表示
		    System.out.println(input_ID + "が入力されました");
		    System.out.println(input_password + "が入力されました");
		    
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();

		  }

		
	}