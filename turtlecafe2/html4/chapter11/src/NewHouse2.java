/*
 * �Ƃ�`���v���O�����i�l�p�`�ƎO�p�`���������́j
 * �쐬�ҁFYoshiaki Matsuzawa
 * �쐬���F2011/12/06
 */
public class NewHouse2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new NewHouse2());
	}

	// �^�[�g���𓮂�������
	public void start() {
		drawRegularPolygon(3, 100);
		rt(90);
		drawRegularPolygon(4, 100);
	}

	// �w�肳�ꂽ�p���̐����p�`��`��
	void drawRegularPolygon(int n, int size) {
		// �����𒲐߂���
		double angle = 360d / (double) n;
		rt(angle - 90);

		// ���p�`��`��
		for (int i = 0; i < n; i++) {
			fd(size);
			rt(angle);
		}

		// ������������ɖ߂�
		lt(angle - 90);
	}

}