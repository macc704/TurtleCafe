import java.util.*;

/**
* �v���O�������F �����ޕԂ��̃v���O����
* �쐬�ҁF Yoshiaki Matsuzawa
* �쐬���F 2007/09/22
*/
public class InputAndPrint{
	
	//�N������
	public static void main(String[] args) {
		InputAndPrint main = new InputAndPrint();
		main.run();
	}
	
	//�����ޕԂ�������
	public void run() {
		//�O����
		Scanner scanner = new Scanner(System.in);//���͂��󂯎�邽�߂̃X�L���i
		
		//���͂��󂯂Ƃ�
		System.out.print("�D���ȕ��������>>");
		String text = scanner.nextLine();
		
		//�o�͂��s��
		String reply = "���Ȃ��̓��͂����̂�" + text + "�ł���";
		System.out.println(reply);
	}
	
}