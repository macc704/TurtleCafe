/*
 * �J��Ԃ��𐔂���J�E���^�[
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class Counter extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Counter());
	}

	// �^�[�g���𓮂�������
	public void start() {
		TextTurtle counter = new TextTurtle("�J��Ԃ���");
		{ // �A�j���[�V�������[�v
			int i = 0;
			while (true) {
				sleep(0.1);
				{ // ����
					counter.text(i);
				}
				i++;
				update();
			}
		}
	}

}