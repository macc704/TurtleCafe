/*
 * �Ƃ������v���O����
 * �ϐ�����
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class VariableHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new VariableHouse());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int x;//�ϐ�x��錾����
		
		x = 50;//�ϐ�x�ɒl50��������
		
		//����������
		rt(30); //30�x�E�ɉ��
		fd(x); //x���O�ɐi��
		rt(120);
		fd(x);
		rt(120);
		fd(x);

		//�{�̂�����
		lt(90);
		fd(x);
		lt(90);
		fd(x);
		lt(90);
		fd(x);
		lt(90);
		fd(x);
	}

}