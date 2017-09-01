/**
 * �^�[�g����4�C�g���āA4�̉~�������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class FourTurtles extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int i; //���[�v�p

		//4�C�̃J���𐶐�
		Turtle kameTaro = new Turtle();
		Turtle kameJiro = new Turtle();
		Turtle kameSaburo = new Turtle();
		Turtle kameShiro = new Turtle();

		//�T�O�Y�ƋT�l�Y�͌��ɉ�����
		kameSaburo.bk(100);
		kameShiro.bk(100);

		//�T���Y�͉E���
		i = 0;
		while (i < 360) {
			kameTaro.rt(1);
			kameTaro.fd(1);
			i++;
		}

		//�T���Y�͍����
		i = 0;
		while (i < 360) {
			kameJiro.lt(1);
			kameJiro.fd(1);
			i++;
		}

		//�T�O�Y�͉E���
		i = 0;
		while (i < 360) {
			kameSaburo.rt(1);
			kameSaburo.fd(1);
			i++;
		}

		//�T�l�Y�͍����
		i = 0;
		while (i < 360) {
			kameShiro.lt(1);
			kameShiro.fd(1);
			i++;
		}

	}

}