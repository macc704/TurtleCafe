/*
 * �Ԃ������v���O����
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class Flower extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Flower());
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
			
			i++;
		}
	}
}