package Java_study;
import java.util.Scanner;
public class Sample {

		public static void main(String[] args) {

		    // Scanner�N���X�̃C���X�^���X���쐬
		    // �����ŕW������System.in���w�肷��
		    Scanner scanner = new Scanner(System.in);

		    // ���͂𑣂����b�Z�[�W
		    System.out.print("���͂��Ă������� > ");

		    //���͂��ꂽ���e���C���X�^���X����擾
		    String input_text = scanner.nextLine();

		    //���͂��ꂽ���e����ʂɕ\��
		    System.out.println(input_text + "�����͂���܂���");

		    // Scanner�N���X�̃C���X�^���X���N���[�Y
		    scanner.close();

		  }

		
	}

