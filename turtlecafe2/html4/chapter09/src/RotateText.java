/*
 * �u����ɂ��́v�����v���O����
 * 
 * 2003/06/23�@Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class RotateText extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateText());
	}

	// �^�[�g���𓮂�������
	public void start() {
		TextTurtle hello = new TextTurtle("����ɂ���");
		while (true) {
			sleep(0.1);
			hello.rt(5);
			update();
		}
	}

}