/**
 * �^�[�g����4�C�g���āA4�̉~�������v���O����
 * (�����ɓ����o�[�W����)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class FourTurtles2 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles2());
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

		i = 0;
		while (i < 360) {

			//�T���Y�͉E���
			kameTaro.rt(1);
			kameTaro.fd(1);

			//�T���Y�͍����
			kameJiro.lt(1);
			kameJiro.fd(1);

			//�T�O�Y�͉E���
			kameSaburo.rt(1);
			kameSaburo.fd(1);

			//�T�l�Y�͍����
			kameShiro.lt(1);
			kameShiro.fd(1);

			i++;
		}

	}

}