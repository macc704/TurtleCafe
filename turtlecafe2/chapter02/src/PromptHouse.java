/*
 * �Ƃ������v���O����
 * (�v�����v�g�t��)
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class PromptHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new PromptHouse());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int length;//1�ӂ̒���
		int rightAngle;//���p

		print("1�ӂ̒�������͂��Ă�������");
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