/*
 * �Ԃт�������v���O����
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class Petal extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Petal());
	}

	//�^�[�g���𓮂�������
	public void start(){
	
		int i;//���[�v�p

		int length = 1;
		int angle = 1;
		
		//�~�ʂ�����
		i = 1;
		while(i <= 120){
			rt(angle);
			fd(length);
			i = i + angle;
		}
		
		//���̉~�ʂ̊p�x��
		rt(60);
		
		//�~�ʂ�����
		i = 1;
		while(i <= 120){
			rt(angle);
			fd(length);
			i = i + angle;
		}

	}
}