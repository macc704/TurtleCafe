/**
 * �����蔻�������v���O����
 * (�Ԃ��h��������ɂ�����ƁC�h�������񂪏������Ȃ�)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class IntersectsJudge extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new IntersectsJudge());
	}
  
  //�^�[�g���𓮂�������
	public void start() {
    
    hide();//�^�[�g��������
    
    //�Ԃ𐶐�
    ImageTurtle car = new ImageTurtle("car.gif");
    //dora�Ƃ������O�̃h��������𐶐�
    Doraemon dora = new Doraemon();

    car.warp(200, 200);//�Ԃ��ړ�
    
    while (true) {
      
      // --- �҂� ---
      sleep(0.1);
      
      // --- ���� ---
      
      //�����C�}�E�X��������Ă�����C
      if (mouseDown()) {
        car.warp(mouseX(), mouseY());//�Ԃ��}�E�X�̈ʒu�Ɉړ�
      }

      //�����C�ǂ炦���񂪎Ԃɓ������Ă�����
      if (dora.intersects(car)){
        dora.small(5);//�h�������������������
      }
      
      // --- �ĕ`�� ---
      update();
    }
    
  }
  
}