/**
 * 4�̉Ƃ����[�v���g���Ĕz�u����v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class WarpHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new WarpHouse());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house1 = new House(); //��1�𐶐�
		House house2 = new House(); //��2�𐶐�
		House house3 = new House(); //��3�𐶐�
		House house4 = new House(); //��4�𐶐�

		//�A�j���[�V�������[�v
		while (true) {

			// --- �҂� ---
			sleep(0.1); //0.1�b

			// --- �������s�� ---
			house1.warp(100, 100);
			house2.warp(100, 200);
			house3.warp(200, 100);
			house4.warp(200, 200);

			// --- �ĕ`�悷�� ---
			update();
		}

	}

}