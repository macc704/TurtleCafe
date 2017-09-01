/*
 * �^�[�g����4�C�g���āA4�̉~�������v���O����
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class FourTurtles extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles());
	}

	// �^�[�g���𓮂�������
	public void start() {
		Turtle kameTaro = new Turtle();
		Turtle kameJiro = new Turtle();
		Turtle kameSaburo = new Turtle();
		Turtle kameShiro = new Turtle();
		{ // �T�O�Y�ƋT�l�Y�͌��ɉ�����
			kameSaburo.bk(100);
			kameShiro.bk(100);
		}
		{ // �T���Y�͉E���
			int i = 0;
			while (i < 360) {
				kameTaro.rt(1);
				kameTaro.fd(1);
				i++;
			}
		}
		{ // c//�T���Y�͍����
			int i = 0;
			while (i < 360) {
				kameJiro.lt(1);
				kameJiro.fd(1);
				i++;
			}
		}
		{ // c//�T�O�Y�͉E���
			int i = 0;
			while (i < 360) {
				kameSaburo.rt(1);
				kameSaburo.fd(1);
				i++;
			}
		}
		{ // c//�T�l�Y�͍����
			int i = 0;
			while (i < 360) {
				kameShiro.lt(1);
				kameShiro.fd(1);
				i++;
			}
		}
	}

}