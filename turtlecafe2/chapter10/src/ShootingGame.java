/**
 * �V���[�e�B���O�Q�[��
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class ShootingGame extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingGame());
	}
  
  //�^�[�g���𓮂�������
	public void start() {
    
    hide();//�^�[�g��������
    
    //��ʂ̒���
    window.size(640, 480);
    window.warp(100, 100);

    int score; //���_������ϐ�
    
    //�L�����N�^�[�̐���
    Star enemy = new Star();    //enemy�Ƃ������O�̐��𐶐�
    Doraemon player = new Doraemon();    //player�Ƃ������O�̃h��������𐶐�
    Circle bullet = new Circle();    //bullet(�e)�Ƃ������O�̉~���쐬

    //���_�̐���
    TextTurtle scoreBoard = new TextTurtle(); //scoreBoard�Ƃ������O��TextTurtle�𐶐�

    //�e��K�؂ȑ傫���ɒ���
    bullet.size(20, 20);

    //�L�����N�^�[�̈ʒu�𒲐�
    enemy.warp(200, 100);
    player.warp(320, 350);
    bullet.warp(-100, -100);//�e�͍ŏ������Ȃ��ʒu�ɒu���Ă���

    //���_�̈ʒu�𒲐�
    scoreBoard.warp(600, 50);

    //���_��������
    score = 0;
    
    while (true) {
      
      // --- �҂� ---
      sleep(0.025);
      
      // --- ���� ---

      //�G�𓮂���(���ꐯ�ƈꏏ)
      enemy.warp(enemy.x() + 5, enemy.y());
      enemy.rt(10);

      //�����C�G���E�[��������
      if(enemy.x() > 640){
        enemy.warp(0, enemy.y());//���[�Ƀ��[�v
      }
      
      //�h������������E�ɓ�����
      if (key() == 37) { //��
        player.warp(player.x() - 5, player.y());
      } else if (key() == 39) { //�E
        player.warp(player.x() + 5, player.y());
      }

      //�オ�����ꂽ��C
      if (key() == 38){
        //�e���o��(�e���h��������Ɠ����ʒu�ɂ���)
        bullet.warp(player.x(), player.y());
      }

      //�e����ɓ�����
      //(�����Ȃ��Ă��C��ɓ������Â���)
      bullet.warp(bullet.x(), bullet.y() - 5);

      //�����C�e���G�ɓ������Ă�����
      if (bullet.intersects(enemy)){
        score++;//���_�𑝂₷
      }

      //���_�̐������X�V
      scoreBoard.text(score);      
      
      // --- �ĕ`�� ---
      update();
    }
    
  }
  
}