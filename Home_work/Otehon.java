package Home_work;

public class Otehon {

	public static void main(String[] args) {
		      /*
		          �ȉ��̕ϐ����쐬���Ă�������
		          �^�FString�@�ϐ����Fuser_name�@�����l�F"admin"
		          �^�FString�@�ϐ����Fpassword�@�����l�F"javaru"
		      */
		      String user_name = "admin";
		      String password = "javaru";
		      
		      
		      /*
		          �ȉ���if���쐬���ĉ�����
		          
		          ���[�U�[�����uadmin�v�A�p�X���[�h���uJavaru�v�̏ꍇ�A
		          �u���O�C���v�ƕ\������B
		          ���[�U�[���ƃp�X���[�h���Е��ł��Ⴄ�ꍇ�A
		          �u���[�U�[�����p�X���[�h���Ԉ���Ă��܂��v�ƕ\�����Ă��������B
		      */
		      if(user_name.equals("admin") && password.equals("Javaru")){
		         System.out.println("���O�C��");
		      }else{
		         System.out.println("���[�U�[�����p�X���[�h���Ԉ���Ă��܂�");
		      }
		      
		   }
	}


