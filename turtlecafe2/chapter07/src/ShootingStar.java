/**
 * ���ꐯ�������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/17
 */
public class ShootingStar extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingStar());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int x; //x���W������ϐ�
		int y; //y���W������ϐ�

		Star star = new Star(); //���𐶐�
		star.scale(0.5);

		//�A�j���[�V�������[�v
		while (true) {

			// --- �҂� ---
			sleep(0.1); //0.1�b

			// --- �������s�� ---
			x = star.getX(); //����x���W���擾����
			y = star.getY(); //����y���W���擾����

			//��]
			star.rt(30);

			//�E���Ɉړ�
			star.warp(x + 10, y + 7);

			//�E�[�������獶�[�Ƀ��[�v
			if (x > 300) {
				star.warp(0, y);
			}
			//���[���������[�Ƀ��[�v
			if (y > 300) {
				star.warp(x, 0);
			}

			// --- �ĕ`�悷�� ---
			update();
		}

	}

}