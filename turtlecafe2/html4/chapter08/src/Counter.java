/**
 * �J��Ԃ��𐔂���J�E���^�[
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class Counter extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Counter());
	}

  //�^�[�g���𓮂�������
	public void start() {

    int i;//���[�v���J�E���g����ϐ�
    
    //�J�E���^�[�𐶐�����
    TextTurtle counter = new TextTurtle("�J��Ԃ���");

    i = 0;
    //�A�j���[�V�������[�v
    while (true) {

      //�҂�
      sleep(0.1);

      //����
      counter.text(i);
      i++;

      //�ĕ`��
      update();
    }
  }
  
}