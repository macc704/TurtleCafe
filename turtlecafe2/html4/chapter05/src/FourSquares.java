/*
 * �l�̎l�p��`���v���O����
 * 2012/10/21 Yoshiaki Matsuzawa
 */
public class FourSquares extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FourSquares());
	}

	// �^�[�g���𓮂�������
	public void start() {
		{ // ����`��
			int j = 1;
			while (j <= 4) {
				{ // �l�p�`��`��
					int i = 1;
					while (i <= 4) {
						fd(50);
						rt(90);
						i++;
					}
				}
				rt(90);
				j++;
			}
		}
	}

}
