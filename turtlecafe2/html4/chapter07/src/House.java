/*
 * �Ƃ������v���O����
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class House extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new House());
	}

	//�^�[�g���𓮂�������
	public void start() {

		//����������
		rt(30); //30�x�E������
		fd(50); //50���O�ɐi��
		rt(120);
		fd(50);
		rt(120);
		fd(50);

		//�{�̂�����
		lt(90);
		fd(50);
		lt(90);
		fd(50);
		lt(90);
		fd(50);
		lt(90);
		fd(50);

	}

}