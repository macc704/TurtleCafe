/**
 * �Ƃ��E�ɓ������v���O����
 * ����1 : �E�Ɍ����ē��������@
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class MoveRightHouse1 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse1());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		house.rt(90); //�E�Ɍ�����

		//�A�j���[�V�������[�v
		while (true) {

			//�҂�
			sleep(0.1); //0.1�b

			//�������s��
			house.fd(5);

			//�ĕ`�悷��
			update();
		}
		
	}

}