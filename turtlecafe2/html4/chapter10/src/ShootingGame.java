/*
 * �V���[�e�B���O�Q�[��
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class ShootingGame extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingGame());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������

		// ��ʂ̒���
		window.size(640, 480);
		window.warp(100, 100);

		// �L�����N�^�[�̐���
		Star enemy = new Star(); // enemy�Ƃ������O�̐��𐶐�
		Doraemon player = new Doraemon(); // player�Ƃ������O�̃h��������𐶐�
		Circle bullet = new Circle(); // bullet(�e)�Ƃ������O�̉~���쐬

		// ���_�̐���
		TextTurtle scoreBoard = new TextTurtle(""); // scoreBoard�Ƃ������O��TextTurtle�𐶐�

		{// ������
			// �e��K�؂ȑ傫���ɒ���
			bullet.size(20, 20);

			// �L�����N�^�[�̈ʒu�𒲐�
			enemy.warp(200, 100);
			player.warp(320, 350);
			bullet.warp(-100, -100);// �e�͍ŏ������Ȃ��ʒu�ɒu���Ă���

			// ���_�̈ʒu�𒲐�
			scoreBoard.warp(600, 50);
		}

		{// �A�j���[�V�������[�v
			// ���_��������
			int score = 0;

			while (true) {

				// --- �҂� ---
				sleep(0.025);

				{ // ��R�}�̏���������

					{// �G�𓮂���
						enemy.warp(enemy.getX() + 5, enemy.getY());
						enemy.rt(10);

						{ // �G���E�[�������ꍇ�̏���
							if (enemy.getX() > 640) {
								enemy.warp(0, enemy.getY());// ���[�Ƀ��[�v
							}
						}
					}

					{ // �h������������E�ɓ�����
						if (key() == 37) { // ��
							player.warp(player.getX() - 5, player.getY());
						} else if (key() == 39) { // �E
							player.warp(player.getX() + 5, player.getY());
						}
					}

					{// �オ�����ꂽ��C�e���o��(�e���h��������Ɠ����ʒu�ɂ���)
						if (key() == 38) {
							//
							bullet.warp(player.getX(), player.getY());
						}
					}

					{ // �e�̏���
						// ��ɓ�����(�����Ȃ��Ă��C��ɓ������Â���)
						bullet.warp(bullet.getX(), bullet.getY() - 5);

						{ // �e���G�ɓ������Ă����ꍇ�̏���
							if (bullet.intersects(enemy)) {
								score++;// ���_�𑝂₷
							}
						}
					}
					// ���_�̐������X�V
					scoreBoard.text(score);

				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}