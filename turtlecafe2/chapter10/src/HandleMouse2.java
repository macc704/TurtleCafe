/**
 * �}�E�X�̈ʒu�ɎԂ������v���O����
 * (�ϐ��ȗ���)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse2 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse2());
	}
  
  //�^�[�g���𓮂�������
	public void start() {
    
    hide();//�^�[�g��������
    
    //�Ԃ𐶐�
    ImageTurtle car = new ImageTurtle("car.gif");
    
    while (true) {
      
      // --- �҂� ---
      sleep(0.1);
      
      // --- ���� ---
      
      //�Ԃ��}�E�X�̈ʒu�Ɉړ�
      car.warp(mouseX(), mouseY());
      
      // --- �ĕ`�� ---
      update();
    }
    
  }
  
}