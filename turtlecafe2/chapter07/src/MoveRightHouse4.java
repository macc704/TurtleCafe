/**
 * �Ƃ��E�ɓ������v���O����
 * ����4 : �E�[�ɍs�����獶�[�ɖ߂�(���[�v���g��)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class MoveRightHouse4 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse4());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		int x; //x���W������ϐ�
		int y; //y���W������ϐ�

		//�A�j���[�V�������[�v
		while (true) {

			// --- �҂� ---
			sleep(0.1); //0.1�b

			// --- �������s�� ---
			x = house.getX(); //�Ƃ�x���W���擾����
			y = house.getY(); //�Ƃ�y���W���擾����

			//�E�Ɉړ�
			house.warp(x + 5, y);

			//�E�[�������獶�[�Ƀ��[�v
			if (x >= 300) {
				house.warp(0, y);
			}

			// --- �ĕ`�悷�� ---
			update();
		}

	}

}