/*
 * �Ԃ������v���O����(���܂������Ȃ���)
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class InvalidFlower extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new InvalidFlower());
	}

	//�^�[�g���𓮂�������
	public void start(){
	
		int i;//���[�v�p
		int j;//���[�v�p

		int length = 1;
		int angle = 1;
		
		
		//6���̉Ԃт������
		i = 1;
		while(i <= 6){
			rt(angle);
			fd(length);
			i = i + angle;
		}
		
		//�~�ʂ�����
		j = 1;
		while(j <= 120){
			rt(angle);
			fd(length);
			j = j + angle;
		}
		
		//���̉~�ʂ̊p�x��
		rt(60);
		
		//�~�ʂ�����
		j = 1;
		while(j <= 120){
			rt(angle);
			fd(length);
			j = j + angle;
		}

	}
}