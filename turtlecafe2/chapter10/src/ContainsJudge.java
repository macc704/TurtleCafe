/**
 * �}�E�X�̂����蔻�������v���O����
 * (�}�E�X���Ԃɂ�����ƁC�Ԃ��������Ȃ�)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class ContainsJudge extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ContainsJudge());
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

      //�����C�Ԃ��}�E�X�̈ʒu�Ɋ܂܂�Ă�����
      if (car.contains(mouseX(), mouseY())){
        car.small(5);//�Ԃ�����������
      }
      
      // --- �ĕ`�� ---
      update();
    }
    
  }
  
}