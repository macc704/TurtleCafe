/**
 * �L�[�ԍ��𒲂ׂ�v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class CheckKeycode extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new CheckKeycode());
	}
  
  //�^�[�g���𓮂�������
	public void start() {

    hide();//�^�[�g��������
    
    int keycode;//�L�[�ԍ������Ă����ϐ�
    
    //����(���Y)�𐶐�
    TextTurtle taro = new TextTurtle();
    
    while (true) {
      
      // --- �҂� ---
      sleep(0.1);
      
      // --- ���� ---
      
      //��������Ă���L�[���擾����
      keycode = key();
      
      //������Ă���L�[�ԍ��𕶎��ɂ��ĕ\������
      taro.text(keycode);
      
      // --- �ĕ`�� ---
      update();
    }
  }
  
}