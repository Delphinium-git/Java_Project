package Home_work;

public class Otehon {

	public static void main(String[] args) {
		      /*
		          以下の変数を作成してください
		          型：String　変数名：user_name　初期値："admin"
		          型：String　変数名：password　初期値："javaru"
		      */
		      String user_name = "admin";
		      String password = "javaru";
		      
		      
		      /*
		          以下のifを作成して下さい
		          
		          ユーザー名が「admin」、パスワードが「Javaru」の場合、
		          「ログイン」と表示する。
		          ユーザー名とパスワードが片方でも違う場合、
		          「ユーザー名かパスワードが間違っています」と表示してください。
		      */
		      if(user_name.equals("admin") && password.equals("Javaru")){
		         System.out.println("ログイン");
		      }else{
		         System.out.println("ユーザー名かパスワードが間違っています");
		      }
		      
		   }
	}


