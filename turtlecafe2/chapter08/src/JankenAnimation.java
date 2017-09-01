/**
 * ����񂯂�A�j���[�V�����v���O����
 * 
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class JankenAnimation extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new JankenAnimation());
	}
  
  //�^�[�g���𓮂�������
	public void start() {
    
    int i; //���[�v�p�̕ϐ�
    
    Goo g = new Goo();
    Choki c = new Choki();
    Paa p = new Paa();
    
    g.warp(100,100);
    c.warp(200,100);
    p.warp(300,100);
    
    i = 0;
    while (true) {
      
      sleep(0.5);
      
      //�J��Ԃ������ɉ����ăO�[�̌����ڂ�ς���
      if(i % 3 == 0){
        g.looks(g);
      }
      else if(i % 3 == 1){
        g.looks(c);
      }
      else{
        g.looks(p);
      }
      
      update();
      i++;
    }
  }
  
}