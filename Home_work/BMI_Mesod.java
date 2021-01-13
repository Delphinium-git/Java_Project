package Home_work;

public class BMI_Mesod {

	public static void main(String[] args) {
				
		double body_weight  = 65.5 ;
		double height = 1.72;
		String name = "安倍";
		double BMI=body_weight/(height*height);
		String Judge = judge(BMI);
		
		
		//体重と身長を個別で表示		
		System.out.println(name+"さんの体重は"+body_weight+"ｋｇです。");
		System.out.println(name+"さんの身長は"+height+"ｍです。");		
		System.out.println("私の名前は"+ name + "でBMIは"+ BMI + "です。");
		System.out.println(name + "さんのBMIの判定は" + Judge +"です。");
	}
		
	//BMIを計算させる
	public static String judge(double BMI_judge) {
					
		if (BMI_judge>25)
			return "肥満";
		else if (BMI_judge>18.5&&BMI_judge<24)
			return "標準";
		else 
			return "低体重";
	}
}

////====変数定義====
//int JapaneseScore = 38;
//int mathScore = 38;
//String name = "安倍";
////===============
//
////個別の点数を出力する
//System.out.println(name+"さんの国語の点数は"+JapaneseScore+"点です。");
//System.out.println(name+"さんの数学の点数は"+mathScore+"点です。");
//
////Test_Calculationメソッドへ国語の点数と数学の点数を引き渡す
////Test_Calculationメソッドで計算された合計点数が『total』へ戻る
//int total = Test_Calculation(JapaneseScore,mathScore);
//
////Total_Score_Dateメソッドへ値き渡し（name+さんの合計点数は + Total_test_score + 点です。）と出力するため
//Total_Score_Date(name,total);
//
////Judgeメソッドへ国語の点数と数学の点数と合計点を引き渡す
////Judgeメソッドで判定された結果が『strJudge』へ戻る
//String strJudge = Judge(JapaneseScore,mathScore,total);
//
//System.out.println(name + "さんのテストの判定は" + strJudge +"です。");
//}
//
////メソッド1　合計点数を計算する（戻り値あり）
//public static int Test_Calculation(int National_language_test,int Math_test) {
//return National_language_test + Math_test;
//}
//
////メソッド2　合計点数を表示させる（戻り値なし）
//public static void Total_Score_Date(String name,int Total_test_score) {
//
//System.out.println(name+"さんの合計点数は" + Total_test_score + "点です。");
//}
//
////メソッド3　結果の判定を行う（判定の値はメインメソッドへ戻る）
//public static String Judge(int National_language_test,int Math_test,int Total_Score_Date) {
//if (National_language_test<39||Math_test<39) {
//return "国語または数学の点数が39点未満のため追試";
//}else if(Total_Score_Date>160) {
//return "優";
//}else if(Total_Score_Date>140&&Total_Score_Date<159) {
//return "良";
//}else if(Total_Score_Date>101&&Total_Score_Date<139) {
//return "可";
//}else {
//return "追試";
//}