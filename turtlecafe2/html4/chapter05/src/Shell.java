/*
 * �L�k�������v���O����
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class Shell extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Shell());
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
						fd(i * 10);
						rt(90);
						j++;
					}
				}

				i++;
			}
		}

	}
}