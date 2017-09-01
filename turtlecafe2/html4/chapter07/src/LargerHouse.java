/**
 * �Ƃ�傫������v���O����
 * ����1 : �傫���𑪂�
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class LargerHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LargerHouse());
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

			// --- �ĕ`�悷�� ---
			update();
		}

	}

}