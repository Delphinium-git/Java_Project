package Home_work;
import java.util.Scanner;
public class Input_Form {

		public static void main(String[] args) {

		    // Scanner�N���X�̃C���X�^���X���쐬
		    // �����ŕW������System.in���w�肷��
		    Scanner scanner = new Scanner(System.in);

		    // ���͂𑣂����b�Z�[�W
		    System.out.print("ID����͂��Ă�������");
		    System.out.print("�p�X���[�h����͂��Ă�������");

		    //���͂��ꂽ���e���C���X�^���X����擾�@�����ɓ��͒l������
		    String input_ID = scanner.nextLine();
		    String input_password = scanner.nextLine();

		    String ID ="murakami";
		    String password ="taiki1201";
		    
		    if (ID==input_ID&&password==input_password)
		    System.out.print("�Ђ炪�Ȃ���͂��Ă�������");
		    
		    else�@if(ID==input_ID&&password==input_password)
		    System.out.print("���O�C��ID���Ԉ���Ă��܂�");
		    
		    else if�@(ID==input_ID&&password==input_password)
		    		
		    //���͂��ꂽ���e����ʂɕ\��
		    System.out.println(input_ID + "�����͂���܂���");
		    System.out.println(input_password + "�����͂���܂���");
		    
		    // Scanner�N���X�̃C���X�^���X���N���[�Y
		    scanner.close();

		  }

		
	}