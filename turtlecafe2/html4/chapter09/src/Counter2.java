/*
 * �J��Ԃ��𐔂���J�E���^�[ (�����ƂȂ����)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class Counter2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Counter2());
	}

	// �^�[�g���𓮂�������
	public void start() {
		TextTurtle counter = new TextTurtle("�J��Ԃ���");
		{ //
			int i = 0;
			while (true) {
				sleep(0.1);
				{ // ����
					counter.text("���݂̌J��Ԃ�����" + i);
				}
				i++;
				update();
			}
		}
	}

}