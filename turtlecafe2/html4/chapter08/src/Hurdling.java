/**
 * �v���O�������F
 * �쐬�ҁF 
 * �쐬���F Mon Oct 29 16:54:59 JST 2012
 */
public class Hurdling extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Hurdling());
	}

	//�^�[�g���𓮂�������
	public void start() {
		hide();
		
		// �n�[�h�����쐬
		Hurdle hurdle = new Hurdle();
		hurdle.warp(200,230);
		
		// �l�Ԃ��쐬
		Person person = new Person();	
		person.warp(50,200);
		int x = 50;
		int y = 200;
		
		// �n�[�h�������[�v
		while(true){
			sleep(0.1);
			
			x = person.getX();
			y = person.getY();
			
			x += 5;
			if(140<=x && x<200){
				y = y-10;
				//person.rt(15);
			}else if(200<=x && x<260){
				y = y+10;
				//person.rt(15);
			}
			person.warp(x,y);

			if(person.getX()>350){
				person.warp(50,y);
			}
			
			update();
		}
	}

}																																																