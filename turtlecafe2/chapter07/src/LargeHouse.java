/**
 * �Ƃ�傫������v���O����
 * ����1 : �傫���𑪂�
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class LargeHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LargeHouse());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		//�A�j���[�V�������[�v
		while (true) {

			// --- �҂� ---
			sleep(0.1); //0.1�b

			// --- �������s�� ---

			//�Ƃ�傫������
			house.size(200, 200);

			// --- �ĕ`�悷�� ---
			update();
		}

	}

}