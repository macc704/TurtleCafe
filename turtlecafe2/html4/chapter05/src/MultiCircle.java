/*
 * �����̉~�������v���O����
 * (�p�x�𑝂₵�Ă�����)
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class MultiCircle extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MultiCircle());
	}

	// �^�[�g���𓮂�������
	public void start() {

		{ // �i�~���j10�`��
			int j = 1;
			while (j <= 10) {
				{ // �~��`��
					int i = 1;
					while (i <= 360) {
						fd(1);
						rt(j);
						i = i + j;
					}
				}
				j = j + 1;
			}
		}

	}

}