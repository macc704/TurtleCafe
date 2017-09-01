/*
 * ���N�Ǘ��v���O����
 * �i�g���Ƒ̏d���烍�[�����w�����v�Z���A�̌^�ɑ΂���R�����g��\������j
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class Rohrer2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Rohrer2());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int height; // �g��
		int weight; // �̏d
		int rohrer; // ���[�����w��

		{// ���[�U�̓��͂��󂯎��
			print("�g������͂��Ă�������");
			height = input();
			print("�̏d����͂��Ă�������");
			weight = input();
		}

		{// ���[�����w�������߂�
			rohrer = weight * 10000000 / height / height / height;
			print("���[�����w����" + rohrer + "�ł��B");
		}

		{// �̌^�ɑ΂���R�����g��񎦂���
			if (rohrer < 100) {
				print("�₹�����ł��ˁB");
			}
			if (rohrer >= 100 && rohrer < 115) {
				print("�₹�Ă��܂��ˁB");
			}
			if (rohrer >= 115 && rohrer < 145) {
				print("���ʂł��ˁB");
			}
			if (rohrer >= 145 && rohrer < 160) {
				print("�����Ă��܂��ˁB");
			}
			if (rohrer >= 160) {
				print("���肷���ł��ˁB");
			}
		}
	}
}