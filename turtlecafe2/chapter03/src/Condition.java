/*
 * ���͂��ꂽ�ԍ��̊G�������v���O����
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class Condition extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Condition());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int pictureNumber;//�G�̔ԍ�
		
		print("���������G�̔ԍ�����͂��Ă��������B(1.��, 2.��)");
		pictureNumber = input();

		if(pictureNumber == 1){//���͂��ꂽ�ԍ���1�Ȃ�ΉƂ�����
						
			int length;//1�ӂ̒���
			int rightAngle;//���p
		
			length = 50;//1�ӂ̒�����50�ɐݒ肷��
			rightAngle = 90;//���p��90�x�ɐݒ肷��
		
			//����������
			rt(30); //30�x�E�ɉ��
			fd(length); //x���O�ɐi��
			rt(120);
			fd(length);
			rt(120);
			fd(length);

			//�{�̂�����
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			
		} else {//���͂��ꂽ�ԍ���1�ȊO�Ȃ�ΐ�������

			int length;//1�ӂ̒���
			int angle;//���������Ƃ��ɋȂ���p�x
			
			length = 100;//1�ӂ̒�����100�ɐݒ肷��
			angle = 144;//�Ȃ���p�x��144�x�ɐݒ肷��
			
			//��������
			rt(18);
			fd(length);
			rt(angle);
			fd(length);
			rt(angle);
			fd(length);
			rt(angle);
			fd(length);
			rt(angle);
			fd(length);
			
		}
		
	}

}