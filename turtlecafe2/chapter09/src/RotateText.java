/**
 * �u����ɂ��́v�����v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class RotateText extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateText());
	}

  //�^�[�g���𓮂�������
	public void start() {

    //����ɂ��͂𐶐�����
    TextTurtle hello = new TextTurtle("����ɂ���");

    //�A�j���[�V�������[�v
    while (true) {

      //�҂�
      sleep(0.1);

      //����
      hello.rt(5);

      //�ĕ`��
      update();
    }
  }
  
}