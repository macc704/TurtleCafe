/**
 * �v���O���~���OI ���ьv�Z�v���O����
 */
public class CalcScore extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new CalcScore());
	}
  
  //�^�[�g���𓮂�������
	public void start() {
    
    //�ϐ�
    int �o�ȓ_;//10�_
    int �ۑ�_;//50�_���_
    int �ŏI��i�_;//25�_���_
    int �ŏI���|�[�g�_;//25�_���_
    
    int ��������;
    
    //�e�_������͂���
    print("�o�ȓ_����͂��Ă�������");
		�o�ȓ_ = input();
    print("�ۑ�_����͂��Ă�������");
    �ۑ�_ = input();
    print("�ŏI��i�_����͂��Ă�������");
    �ŏI��i�_ = input();
    print("�ŏI���|�[�g�_����͂��Ă�������");
    �ŏI���|�[�g�_ = input();
    
    //�������т��v�Z����
    �������� = �ۑ�_ + �ŏI��i�_ + �ŏI���|�[�g�_;
    
    //���т�\������
    if(�������� > 80){
      print("���Ȃ��̐��т�A�ł�");
    }
    else if(�������� > 60){
      print("���Ȃ��̐��т�B�ł�");
    }
    else if(�������� > 40){
      print("���Ȃ��̐��т�C�ł�");
    }
    else{
      if(�o�ȓ_ >= 7){
        print("���Ȃ��̐��т�C�ł�");
      }
      else{
        print("���Ȃ��̐��т�D�ł�");
      }
    }
  }
  
}