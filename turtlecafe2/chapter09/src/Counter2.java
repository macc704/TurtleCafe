/**
 * �J��Ԃ��𐔂���J�E���^�[
 * (�����ƂȂ����)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class Counter2 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Counter2());
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
      counter.text("���݂̌J��Ԃ�����" + i + "�ł��B");
      i++;

      //�ĕ`��
      update();
    }
  }
  
}