/*
 * ���t���̉Ƃ�`���v���O�����i�Q���x�������\�b�h���j
 * �쐬�ҁFMegumiAraki
 * �쐬���F2007/06/09
 * ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
 */

public class House03 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new House03());
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
		drawTriangle(); // �O�p�`��`��
	}

	// �ǂ�`��
	void drawWall() {
		rt(90); // �����𒲐߂���
		drawRectangle();// �l�p�`��`��
		lt(90);// ������������ɖ߂�
	}

	// ����`��
	void drawWindow() {
		// ����`���ʒu�܂ňړ�����
		moveToWindowLocation();

		// ����`��
		rt(90);
		for (int i = 0; i < 4; i++) {
			drawSmallRectangle();
			fd(16 * 2 + 4);
			rt(90);
		}
		lt(90);
	}

	// �O�p�`��`��
	void drawTriangle() {
		// �����𒲐߂���
		rt(30);

		// �O�p�`��`��
		for (int i = 0; i < 3; i++) {
			fd(80);
			rt(120);
		}

		// ������������ɖ߂�
		lt(30);
	}

	// �l�p�`��`��
	void drawRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(80);
			rt(90);
		}
	}

	// �������l�p�`��`��
	void drawSmallRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(16);
			rt(90);
		}
	}

	// ����`���ʒu�܂ňړ�����
	void moveToWindowLocation() {
		// �O����
		up();

		// �E��22
		rt(90);
		fd(22);

		// ����22
		rt(90);
		fd(22);

		// �㏈��
		rt(180);
		down();
	}

}