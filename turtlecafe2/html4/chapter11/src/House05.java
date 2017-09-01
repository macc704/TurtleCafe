/*
 * ���t���̉Ƃ�`���v���O�����i�����ɂ�鑽�p�`��`�����\�b�h�̒��ۉ��j
 * �쐬�ҁFMegumiAraki
 * �쐬���F2007/06/09
 * ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
 */

public class House05 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new House05());
	}

	// �Ƃ�`��
	 //�^�[�g���𓮂�������
	public void start() {
		drawRoof(); // ������`��
		drawWall(); // �ǂ�`��
		drawWindow(); // ����`��
	}

	// ������`��
	void drawRoof() {
		drawRegularPolygon(3, 80); // �O�p�`��`��
	}

	// �ǂ�`��
	void drawWall() {
		rt(90); // �����𒲐߂���
		drawRegularPolygon(4, 80);// �l�p�`��`��
		lt(90);// ������������ɖ߂�
	}

	// ����`��
	void drawWindow() {
		// ����`���ʒu�܂ňړ�����
		moveToWindowLocation(22);

		// ����`��
		rt(90);
		for (int i = 0; i < 4; i++) {
			drawRegularPolygon(4, 16);
			fd(16 * 2 + 4);
			rt(90);
		}
		lt(90);
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

	// ����`���ʒu�܂ňړ�����
	void moveToWindowLocation(int length) {
		moveTurtle(90, 22);// �E��
		moveTurtle(180, 22);// ����
	}

	// �w�肳�ꂽ�����Ɂi�y�����グ�āj�ړ�����
	void moveTurtle(double direction, int distance) {
		up();
		rt(direction);
		fd(distance);
		lt(direction);
		down();
	}

}