/*
 * �����̉~�������v���O����
 * (�p�x�𑝂₵�Ă�����)
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class MultiCircle extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MultiCircle());
	}

	//�^�[�g���𓮂�������
	public void start(){
	
		int i;//���[�v�p1
		int j;//���[�v�p2
		
		int length;//1��ɐi�ދ���
		int angle;//1��ɋȂ���p�x

		//�~��10�������߂̃��[�v		
		i = 1;
		while(i <= 10){
			angle = i;
			length = 1;

			//�~���������߂̃��[�v
			j = 1;
			while(j <= 360){
				fd(length);
				rt(angle);
				j = j + angle;
			}
			
			i = i + 1;
		}
		
	}
	
}