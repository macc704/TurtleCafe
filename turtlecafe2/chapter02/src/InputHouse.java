/*
 * �Ƃ������v���O����
 * (1�ӂ̒�������͂���)
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class InputHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new InputHouse());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int length;//1�ӂ̒���
		int rightAngle;//���p
		
		length = input();//1�ӂ̒�������͒l�ɐݒ肷��
		rightAngle = 90;//���p��90�x�ɐݒ肷��
		
		//����������
		rt(30); //30�x�E�ɉ��
		fd(length); //x���O�ɐi��
		rt(120);
		fd(length);
		rt(120);
		fd(length);

		//�{�̂�����
		lt(rightAngle);
		fd(length);
		lt(rightAngle);
		fd(length);
		lt(rightAngle);
		fd(length);
		lt(rightAngle);
		fd(length);
	}

}