/**
 * �Ԃ����v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class RotateCar extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateCar());
	}

  //�^�[�g���𓮂�������
	public void start() {

    //�Ԃ𐶐�����
    ImageTurtle car = new ImageTurtle("car.gif");

    //�A�j���[�V�������[�v
    while (true) {

      //�҂�
      sleep(0.1);

      //����
      car.rt(5);

      //�ĕ`��
      update();
    }
  }
  
}