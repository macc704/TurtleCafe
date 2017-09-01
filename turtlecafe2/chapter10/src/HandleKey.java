/**
 * �L�[�ɑΉ����ĎԂ������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleKey extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKey());
	}
  
  //�^�[�g���𓮂�������
	public void start() {

    hide();//�^�[�g��������
    
    int keycode;//�L�[�ԍ������Ă����ϐ�
    int x;//x���W�����Ă����ϐ�
    int y;//y���W�����Ă����ϐ�
		
    //�Ԃ𐶐�
    ImageTurtle car = new ImageTurtle("car.gif");
    
    while (true) {
      
      // --- �҂� ---
      sleep(0.1);
      
      // --- ���� ---
      
      //��������Ă���L�[���擾����
      keycode = key();
      
      //�Ԃ�������ʒu���擾����
      x = car.getX();
      y = car.getY();
      
      //�㉺���E�L�[��������Ă�����C�Ԃ𓮂���
      if (keycode == 37) { //��
        car.warp(x - 5, y);
      } else if (keycode == 38) { //��
        car.warp(x, y - 5);
      } else if (keycode == 39) { //�E
        car.warp(x + 5, y);
      } else if (keycode == 40) { //��
        car.warp(x, y + 5);
      }
      
      // --- �ĕ`�� ---
      update();
    }
  }
  
}