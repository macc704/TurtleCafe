/**
 * ���������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/17
 */
public class Star extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Star());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int i;

		rt(18);
		i = 0;
		while (i < 5) {
			fd(100);
			rt(144);
			i++;
		}

	}

}