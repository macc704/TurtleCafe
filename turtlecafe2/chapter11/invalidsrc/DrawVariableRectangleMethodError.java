/*
 * �l�p�`��`���v���O�����i�R���p�C���G���[�j
 * �i�������胁�\�b�h�̗��K�j
 * �쐬�ҁFMegumiAraki
 * �쐬���F2007/06/09
 * ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
 */

public class DrawVariableRectangleMethodError extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawVariableRectangleMethodError());
	}
	
	//�^�[�g���𓮂�������
	void start() {

		// ��ӂ̒����̓��͂��󂯎��
		int length = 0;
		print("��ӂ̒�������͂��Ă�������");
		length = input();
		
		drawRectangle();// ��ӂ̒������w�肵�Ďl�p�`��`��

	}

	//�l�p�`��`��
	void drawRectangle(){
		for (int i = 0; i < 4; i++) {
			fd(length);
			rt(90);
		}
	}
}
