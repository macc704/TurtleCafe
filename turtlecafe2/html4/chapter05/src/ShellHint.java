/*
 * �L�k�������v���O�����̃q���g
 * 2011/10/25 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class ShellHint extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ShellHint());
	}

	// �^�[�g���𓮂�������
	public void start() {
		{// �L�k������
			int i = 1;
			while (i <= 10) {
				rt(20);

				{// �l�p������
					int j = 1;
					while (j <= 4) {
						fd(50);
						rt(90);
						j++;
					}
				}

				i++;
			}
		}
	}
}