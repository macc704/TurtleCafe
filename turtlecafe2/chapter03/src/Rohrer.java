/*
 * ���N�Ǘ��v���O����
 * �i�g���Ƒ̏d���烍�[�����w�����v�Z���A�̌^�ɑ΂���R�����g��\������j
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class Rohrer extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Rohrer());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int height; //�g��
		int weight; //�̏d
		int rohrer; //���[�����w��
		
		print("�g������͂��Ă�������");
		height = input();
		print("�̏d����͂��Ă�������");
		weight = input();

		//���[�����w�������߂�
		rohrer = weight * 10000000 / height / height / height;

		//���[�����w����\������
		print("���[�����w����" + rohrer + "�ł��B");

		//�̌^�ɑ΂���R�����g��񎦂���
		if (rohrer < 100) {
			print("�₹�����ł��ˁB");
		}
		else if (rohrer < 115) {
			print("�₹�Ă��܂��ˁB");
		}
		else if (rohrer < 145) {
			print("���ʂł��ˁB");
		}
		else if (rohrer < 160) {
			print("�����Ă��܂��ˁB");
		}
		else {
			print("���肷���ł��ˁB");
		}
	}
}