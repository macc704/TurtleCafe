/**
 * �}�E�X�̈ʒu�ɎԂ������v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse());
	}
  
  //�^�[�g���𓮂�������
	public void start() {
    
    hide();//�^�[�g��������
    
    int mx;//�}�E�X��x���W�����Ă����ϐ�
    int my;//�}�E�X��y���W�����Ă����ϐ�
    
    //�Ԃ𐶐�
    ImageTurtle car = new ImageTurtle("car.gif");
    
    while (true) {
      
      // --- �҂� ---
      sleep(0.1);
      
      // --- ���� ---
      
      //�Ԃ��}�E�X�̈ʒu�Ɉړ�
      mx = mouseX();//�}�E�X��x���W���擾����
      my = mouseY();//�}�E�X��y���W���擾����
      car.warp(mx, my);
      
      // --- �ĕ`�� ---
      update();
    }
    
  }
  
}