/**
 * �Ԃ�_�ł�����v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class OnAndOffCar extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new OnAndOffCar());
	}

  //�^�[�g���𓮂�������
	public void start() {

    int i;//���[�v�J�E���^
    
    //�Ԃ𐶐�����
    ImageTurtle car = new ImageTurtle("car.gif");

    //�A�j���[�V�������[�v
    i = 0;
    while (true) {

      //�҂�
      sleep(0.2);

      //����
      if(i % 2 == 0){//������������
        car.show();
      }else{//�����ł͂Ȃ�������(���������)
        car.hide();
      }
      i++;
      
      //�ĕ`��
      update();

    }
  }

}