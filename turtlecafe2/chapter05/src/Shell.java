/*
 * �L�k�������v���O����
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class Shell extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Shell());
	}

	//�^�[�g���𓮂�������
	public void start(){
	
		int i;//���[�v�p
		int j;//���[�v�p
		
		//�L�k������
		i = 1;
		while(i <= 10){
			rt(20);
			
			//�l�p������
			j = 1;
			while(j <= 4){
				fd(i * 10);
				rt(90);
				j++;
			}
			
			i++;
		}

	}
}