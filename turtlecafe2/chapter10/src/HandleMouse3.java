/**
 * �}�E�X�̉������ʒu�ɎԂ������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse3 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse3());
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
      
      //�����C�}�E�X��������Ă�����C
      if (mouseDown()) {
        car.warp(mouseX(), mouseY());//�Ԃ��}�E�X�̈ʒu�Ɉړ�
      }
      
      // --- �ĕ`�� ---
      update();
    }
    
  }
  
}