package Home_work;

public class BMI_Mesod {

	public static void main(String[] args) {
				
		double body_weight  = 65.5 ;
		double height = 1.72;
		String name = "���{";
		double BMI=body_weight/(height*height);
		String Judge = judge(BMI);
		
		
		//�̏d�Ɛg�����ʂŕ\��		
		System.out.println(name+"����̑̏d��"+body_weight+"�����ł��B");
		System.out.println(name+"����̐g����"+height+"���ł��B");		
		System.out.println("���̖��O��"+ name + "��BMI��"+ BMI + "�ł��B");
		System.out.println(name + "�����BMI�̔����" + Judge +"�ł��B");
	}
		
	//BMI���v�Z������
	public static String judge(double BMI_judge) {
					
		if (BMI_judge>25)
			return "�얞";
		else if (BMI_judge>18.5&&BMI_judge<24)
			return "�W��";
		else 
			return "��̏d";
	}
}

////====�ϐ���`====
//int JapaneseScore = 38;
//int mathScore = 38;
//String name = "���{";
////===============
//
////�ʂ̓_�����o�͂���
//System.out.println(name+"����̍���̓_����"+JapaneseScore+"�_�ł��B");
//System.out.println(name+"����̐��w�̓_����"+mathScore+"�_�ł��B");
//
////Test_Calculation���\�b�h�֍���̓_���Ɛ��w�̓_���������n��
////Test_Calculation���\�b�h�Ōv�Z���ꂽ���v�_�����wtotal�x�֖߂�
//int total = Test_Calculation(JapaneseScore,mathScore);
//
////Total_Score_Date���\�b�h�֒l���n���iname+����̍��v�_���� + Total_test_score + �_�ł��B�j�Əo�͂��邽��
//Total_Score_Date(name,total);
//
////Judge���\�b�h�֍���̓_���Ɛ��w�̓_���ƍ��v�_�������n��
////Judge���\�b�h�Ŕ��肳�ꂽ���ʂ��wstrJudge�x�֖߂�
//String strJudge = Judge(JapaneseScore,mathScore,total);
//
//System.out.println(name + "����̃e�X�g�̔����" + strJudge +"�ł��B");
//}
//
////���\�b�h1�@���v�_�����v�Z����i�߂�l����j
//public static int Test_Calculation(int National_language_test,int Math_test) {
//return National_language_test + Math_test;
//}
//
////���\�b�h2�@���v�_����\��������i�߂�l�Ȃ��j
//public static void Total_Score_Date(String name,int Total_test_score) {
//
//System.out.println(name+"����̍��v�_����" + Total_test_score + "�_�ł��B");
//}
//
////���\�b�h3�@���ʂ̔�����s���i����̒l�̓��C�����\�b�h�֖߂�j
//public static String Judge(int National_language_test,int Math_test,int Total_Score_Date) {
//if (National_language_test<39||Math_test<39) {
//return "����܂��͐��w�̓_����39�_�����̂��ߒǎ�";
//}else if(Total_Score_Date>160) {
//return "�D";
//}else if(Total_Score_Date>140&&Total_Score_Date<159) {
//return "��";
//}else if(Total_Score_Date>101&&Total_Score_Date<139) {
//return "��";
//}else {
//return "�ǎ�";
//}