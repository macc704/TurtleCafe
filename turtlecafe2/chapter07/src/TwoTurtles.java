/**
 * �^�[�g����2�C�g���āA2�̉~�������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class TwoTurtles extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new TwoTurtles());
	}

	//�^�[�g���𓮂�������
	public void start() {

		Turtle kameTaro = new Turtle(); //�T���Y�𐶐�
		Turtle kameJiro = new Turtle(); //�T���Y�𐶐�

		int i = 0;
		while (i < 360) {

			//�T���Y�͉E���
			kameTaro.rt(1);
			kameTaro.fd(1);

			//�T���Y�͍����
			kameJiro.lt(1);
			kameJiro.fd(1);

			i++;
		}

	}

}