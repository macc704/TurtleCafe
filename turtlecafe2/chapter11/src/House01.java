/*
* ���t���̉Ƃ�`���v���O�����i���\�b�h�Ȃ��j
* �쐬�ҁFMegumiAraki
* �쐬���F2007/06/09
* ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
*/

public class House01 extends Turtle {
	
	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new House01());
	}
	
	// �Ƃ�`��
	//�^�[�g���𓮂�������
	public void start() {
		
		// ������`��
		// �����𒲐߂���
		rt(30);
		// �O�p�`��`��
		for (int i = 0; i < 3; i++) {
			fd(80);
			rt(120);
		}
		// ������������ɖ߂�
		lt(30);
		
		// �ǂ�`��
		rt(90); // �����𒲐߂���
		// �l�p�`��`��
		for (int j= 0; j < 4; j++) {
			fd(80);
			rt(90);
		}
		lt(90);// ������������ɖ߂�
		
		// ����`���ʒu�܂ňړ�����
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
		
		// ����`��
		rt(90);//�����𒲐߂���
		for (int i = 0; i < 4; i++) {
			//�����Ȏl�p�`��`��
			for (int j= 0; j < 4; j++) {
				fd(16);
				rt(90);
			}
			fd(16 * 2 + 4);
			rt(90);
		}
		lt(90);//������������ɖ߂�
	}
}