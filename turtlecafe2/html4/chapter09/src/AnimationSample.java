/*
 * �A�j���[�V�����̃T���v��
 * 
 * 2003/05/08 Yoshiaki Matsuzawa 
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class AnimationSample extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new AnimationSample());
	}

	// �^�[�g���𓮂�������
	public void start() {
		TextTurtle text = new TextTurtle("����->");
		TextTurtle number = new TextTurtle("");
		ImageTurtle car = new ImageTurtle("car.gif");
		{ // ������
			number.warp(200, 100);
			car.hide();
		}
		{ // �A�j���[�V�������[�v
			int i = 10;
			while (true) {
				sleep(1);
				{ // ��R�}�̏���
					number.text(i);
					if (i == 3) {
						number.color(java.awt.Color.red);
					}
					if (i <= 0) {
						text.looks(car);
						number.text("�ڂ��[��!!");
					}
				}
				i--;
				update();
			}
		}
	}

}