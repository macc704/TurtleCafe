/**
 * �v���O�������F
 * �쐬�ҁF 
 * �쐬���F Sat Oct 20 14:26:39 JST 2007
 */
public class InputAndPrintApplet extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new InputAndPrintApplet());
	}

	//�^�[�g���𓮂�������
	void start() {
		Turtle.window.split.setDividerLocation(25);
		
		//���͂��󂯂Ƃ�
		print("�D���ȕ��������>>");
		String text = inputString();
		
		//�o�͂��s��
		String reply = "���Ȃ��̓��͂����̂�" + text + "�ł���";
		print(reply);

	}

}