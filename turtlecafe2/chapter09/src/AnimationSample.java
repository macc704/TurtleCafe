/**
 * �A�j���[�V�����̃T���v��
 *
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class AnimationSample extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new AnimationSample());
	}
  
  //�^�[�g���𓮂�������
	public void start() {
    
    int i;
    
    TextTurtle text = new TextTurtle("����->");		
    
    TextTurtle number = new TextTurtle();
    number.warp(200, 100);
    
    ImageTurtle car = new ImageTurtle("car.gif");
    car.hide();
    
    i = 10;
    while (true) {
      //�҂�
      sleep(1);
      
      //����
      number.text(i);
      
      if (i == 3) {
        number.color(java.awt.Color.red);
      }
      
      if (i <= 0) {
        text.looks(car);
        number.text("�ڂ��[��!!");
      }
      
      i--;
      
      //�ĕ`��
      update();
    }
  }
  
}