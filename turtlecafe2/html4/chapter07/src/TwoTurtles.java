/*
 * �^�[�g����2�C�g���āA2�̉~�������v���O����
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class TwoTurtles extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new TwoTurtles());
	}

	// �^�[�g���𓮂�������
	public void start() {
		Turtle kameTaro = new Turtle();
		Turtle kameJiro = new Turtle();
		{ // �A�j���[�V����������
			int i = 0;
			while (i < 360) {
				{ // �T���Y�͉E���
					kameTaro.rt(1);
					kameTaro.fd(1);
				}
				{ // �T���Y�͍����
					kameJiro.lt(1);
					kameJiro.fd(1);
				}
				i++;
			}
		}
	}

}