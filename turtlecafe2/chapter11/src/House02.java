/*
* ���t���̉Ƃ�`���v���O�����i�P���x�������\�b�h���j
* �쐬�ҁFMegumiAraki
* �쐬���F2007/06/09
* ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
*/
public class House02 extends Turtle {
	
	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new House02());
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
		//�O�p�`��`��
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
	
	// �ǂ�`��
	void drawWall() {
		rt(90); // �����𒲐߂���
		//�l�p�`��`��
		for (int i = 0; i < 4; i++) {
			fd(80);
			rt(90);
		}
		lt(90);// ������������ɖ߂�
	}
	
	// ����`��
	void drawWindow() {
		// ����`���ʒu�܂ňړ�����
		// �O����
		up();
		
		// �E��
		rt(90);
		fd(22);
		
		// ����
		rt(90);
		fd(22);
		
		// �㏈��
		rt(180);
		down();
		
		// ����`��
		rt(90);//�����𒲐߂���
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				fd(16);
				rt(90);
			}
			fd(16 * 2 + 4);
			rt(90);
		}
		lt(90);//������������ɖ߂�
	}	
}