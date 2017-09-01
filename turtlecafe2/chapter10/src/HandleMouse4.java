/**
 * �}�E�X�̉������ʒu�ɎԂ������v���O����
 * (�E�N���b�N�C���N���b�N�����)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse4 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse4());
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
      
      //�����C���}�E�X�{�^����������Ă�����C
      if (leftMouseDown()) {
        car.warp(mouseX(), mouseY());//�Ԃ��}�E�X�̈ʒu�Ɉړ�
      }
      //�����C�E�}�E�X�{�^�����_�u���N���b�N���ꂽ��C
      if (rightMouseDown() && doubleClick()) {
        car.show(!car.isShow());//�Ԃ�(����/�B��)
      }
      
      // --- �ĕ`�� ---
      update();
    }
    
  }
  
}