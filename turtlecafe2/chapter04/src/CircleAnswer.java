/*
 * �~�������v���O����
 * 2003/06/01
 * Yoshiaki Matsuzawa
 */
public class CircleAnswer extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new CircleAnswer());
	}

	//�^�[�g���𓮂�������
	public void start(){
	
		int i;//���[�v�p
		
		//�~������
		i = 1;
		while(i <= 360){
			fd(1);
			rt(1);
			i = i + 1;
		}
		
	}
	
}