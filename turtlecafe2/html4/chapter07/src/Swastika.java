/**
 * �v���O�������F �쐬�ҁF �쐬���F Mon Oct 29 15:53:04 JST 2012
 */
public class Swastika extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Swastika());
	}

	// �^�[�g���𓮂�������
	public void start() {
		hide();

		Turtle kame1 = new Turtle();
		Turtle kame2 = new Turtle();
		Turtle kame3 = new Turtle();
		Turtle kame4 = new Turtle();

		// �J���̌�����ς���
		kame2.rt(90);
		kame3.rt(180);
		kame4.rt(-90);

		int length = 80;
		int i = 0;
		while (i < length * 2) {
			kame1.fd(1);
			kame2.fd(1);
			kame3.fd(1);
			kame4.fd(1);

			if (i == length) {
				kame1.lt(90);
				kame2.lt(90);
				kame3.lt(90);
				kame4.lt(90);
			}
			i++;
		}
	}

}