/**
 * �v���O�������F�l��`���v���O����
 * �쐬�ҁF �匴�N�F
 * �쐬���F Mon Oct 29 16:53:16 JST 2012
 */
public class Person extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Person());
	}

	//�^�[�g���𓮂�������
	public void start() {
		
		// ����`��
		int i=0;
		while(i<360){
			fd(1);
			rt(3);
			i = i+3;
		}
		
		// ���̈ʒu�܂ňړ�
		up();
		rt(90);
		fd(20);
		lt(90);
		bk(20);
		down();
		
		// ����`��
		bk(20);
		
		// �E�r��`��
		rt(90);
		fd(15);
		lt(60);
		fd(10);
		bk(10);
		rt(60);
		bk(30);
		
		// ���r��`��
		rt(120);
		fd(10);
		bk(10);
		lt(120);
		fd(15);
		lt(90);
		
		// ����`��
		bk(30);
		rt(120);
		fd(20);
		bk(20);
		rt(120);
		fd(20);
		
	}

}														