/*
 * �����蔻�������v���O����
 * (�Ԃ��h��������ɂ�����ƁC�h�������񂪏������Ȃ�)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class IntersectsJudge extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new IntersectsJudge());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������
		ImageTurtle car = new ImageTurtle("car.gif");// �Ԃ𐶐�
		Doraemon dora = new Doraemon();// dora�Ƃ������O�̃h��������𐶐�
		car.warp(200, 200);// �Ԃ��ړ�

		{// �A�j���[�V�������[�v
			while (true) {

				// --- �҂� ---
				sleep(0.1);

				{ // ��R�}�̏���������
					{// �}�E�X��������Ă������̏���
						if (mouseDown()) {
							car.warp(mouseX(), mouseY());// �Ԃ��}�E�X�̈ʒu�Ɉړ�
						}
					}
					{ // �ǂ炦���񂪎Ԃɓ������Ă������̏���
						if (dora.intersects(car)) {
							dora.small(5);// �h�������������������
						}
					}
				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}