/*
 * �Ƃ������v���O����(�J��Ԃ�)
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class WhileHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new WhileHouse());
	}

	//�^�[�g���𓮂�������
	public void start(){
	
		int i;//���[�v�p�ϐ�
		
		//����������
		rt(30);
		i = 1;
		while(i <= 3){
			fd(50);
			rt(120);
			i = i + 1;
		}
		lt(30);//������ɖ߂�
		
		//�{�̂�����
		i = 1;
		while(i <= 4){
			rt(90);
			fd(50);
			i = i + 1;
		}
		
	}
	
}