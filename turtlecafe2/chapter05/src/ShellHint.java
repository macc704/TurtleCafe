/*
 * �L�k�������v���O�����̃q���g
 * 2011/10/25
 * Yoshiaki Matsuzawa
 */
public class ShellHint extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ShellHint());
	}

	// �^�[�g���𓮂�������
	public void start() {
		int i;// ���[�v�p
		int j;// ���[�v�p

		// �L�k������
		i = 1;
		while (i <= 10) {
			rt(20);

			// �l�p������
			j = 1;
			while (j <= 4) {
				fd(50);
				rt(90);
				j++;
			}

			i++;
		}
	}
}