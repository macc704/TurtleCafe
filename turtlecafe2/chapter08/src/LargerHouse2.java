/**
 * �Ƃ�傫������v���O����
 * ����2 : �傫���Ȃ肷�����珬��������
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class LargerHouse2 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LargerHouse2());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		int width; //width���W������ϐ�
		int height; //height���W������ϐ�

		//�A�j���[�V�������[�v
		while (true) {

			// --- �҂� ---
			sleep(0.1); //0.1�b

			// --- �������s�� ---

			width = house.getWidth(); //�Ƃ̉��̒������擾����
			height = house.getHeight(); //�Ƃ̏c�̒������擾����

			//�Ƃ�傫������
			house.size(width + 2, height + 2);

			//�������傫���Ȃ肷�����珬��������
			if (width >= 300) {
				house.scale(0.25); //0.25�{�̑傫���ɂ���
			}
			//�c�����傫���Ȃ肷�����珬��������
			if (height >= 300) {
				house.scale(0.25); //0.25�{�̑傫���ɂ���
			}

			// --- �ĕ`�悷�� ---
			update();
		}

	}

}