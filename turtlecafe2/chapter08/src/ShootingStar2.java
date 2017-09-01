/**
 * ���ꐯ�������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/17
 */
public class ShootingStar2 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingStar2());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int x; //x���W������ϐ�
		int y; //y���W������ϐ�

		Star star = new Star(); //���𐶐�
		Star star2 = new Star(); //���𐶐�
		star.scale(0.5);
		star2.fd(100);

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

			x = star2.getX(); //����x���W���擾����
			y = star2.getY(); //����y���W���擾����

			//��]
			star2.rt(30);

			//�E���Ɉړ�
			star2.warp(x + 10, y + 7);

			//�E�[�������獶�[�Ƀ��[�v
			if (x > 300) {
				star2.warp(0, y);
			}
			//���[���������[�Ƀ��[�v
			if (y > 300) {
				star2.warp(x, 0);
			}

			// --- �ĕ`�悷�� ---
			update();
		}

	}

}