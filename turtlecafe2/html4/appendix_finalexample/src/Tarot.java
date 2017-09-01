/**
* �v���O�������F�^���b�g�肢�v���W�F�N�g
* �쐬�ҁF ���V�F����
* �쐬���F Sun Dec 30 23:49:26 JST 2007
*/
public class Tarot extends Turtle {
	
	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Tarot());
	}
	
	
	//�^�[�g���𓮂�������
	public void start() {
		window.size(1100,700);
		int i;
		int mx;
		int my;
		
		
		hide();
		
		
		ImageTurtle card1 = new ImageTurtle("Card.png");
		ImageTurtle card2 = new ImageTurtle("Card.png");
		ImageTurtle card3 = new ImageTurtle("Card.png");
		ImageTurtle card4 = new ImageTurtle("Card.png");
		ImageTurtle card5 = new ImageTurtle("Card.png");
		ImageTurtle card6 = new ImageTurtle("Card.png");
		ImageTurtle card7 = new ImageTurtle("Card.png");
		ImageTurtle card8 = new ImageTurtle("Card.png");
		ImageTurtle card9 = new ImageTurtle("Card.png");
		ImageTurtle card10 = new ImageTurtle("Card.png");
		ImageTurtle card11 = new ImageTurtle("Card.png");
		ImageTurtle card12 = new ImageTurtle("Card.png");
		
		Star star = new Star();
		
		ImageTurtle tower = new ImageTurtle("Tower.png");
		ImageTurtle queen = new ImageTurtle("Queen.png");
		ImageTurtle ring = new ImageTurtle("Ring.png");
		ImageTurtle death = new ImageTurtle("Death.png");
		ImageTurtle moon = new ImageTurtle("Moon.png");
		ImageTurtle force = new ImageTurtle("Force.png");
		ImageTurtle sun = new ImageTurtle("Taiyou.png");
		ImageTurtle koibito = new ImageTurtle("Koibito.png");
		ImageTurtle sensya = new ImageTurtle("Sensya.png");
		ImageTurtle hoshi = new ImageTurtle("Hoshi.png");
		ImageTurtle koutei = new ImageTurtle("Koutei.png");
		ImageTurtle inzya = new ImageTurtle("Inzya.png");
		
		ImageTurtle tarot = new ImageTurtle("Tarotcard.png");
		
		card1.warp(330,300);
		card2.warp(320,350);
		card3.warp(300,325);
		card4.warp(330,375);
		card5.warp(300,350);
		card6.warp(350,290);
		card7.warp(290,300);
		card8.warp(315,400);		
		card9.warp(325,335);
		card10.warp(340,315);
		card11.warp(355,360);
		card12.warp(400,370);		
		
		
		
		i=0;
		while ( i <= random(15)+2){
			
			sleep(0.5);
			card1.rt(300);
			card1.fd(160);
			
			card2.rt(50);
			card2.fd(150);
			
			card3.rt(130);
			card3.fd(150);
			
			card4.rt(70);
			card4.fd(130);
			
			card5.rt(170);
			card5.fd(170);
			
			card6.rt(250);
			card6.fd(175);
			
			card7.rt(190);
			card7.fd(150);
			
			card8.rt(70);
			card8.fd(190);
			
			card9.rt(115);
			card9.fd(160);
			
			card10.rt(123);
			card10.fd(165);
			
			card11.rt(185);
			card11.fd(185);
			
			card12.rt(220);
			card12.fd(180);
			
			TextTurtle text = new TextTurtle("�S�𗎂��������A�����ŃJ�[�h��1���I��ł�������");
			text.warp(500,570);
			tarot.warp(160,100);
			i++;
			
			
			update();
		}
		
		while(true){
			sleep(0.3);
			mx = mouseX();
			my = mouseY();
			star.warp(mx,my);
			if(star.intersects(card1)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u���v�ł�");
				TextTurtle text2 = new TextTurtle("�����͎v��ʕs�K�����邩������܂���");	
				TextTurtle text3 = new TextTurtle("�\�����ʎ��Ԃ��N���Ă��ł�Ȃ��悤��");		
				text.warp(700,70);
				text2.warp(700,170);
				text3.warp(700,270);
				tower.warp(700,400);
				card1.looks(tower);
				
			}
			else if(star.intersects(card2)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u����v�ł�");
				TextTurtle text2 = new TextTurtle("�����̂��Ȃ��͑n���͂ɒ����Ă��܂�");
				TextTurtle text3 = new TextTurtle("�����V�������Ƃ��n�߂Ă݂�Ƃ����ł��傤");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				queen.warp(700,400);
				card2.looks(queen);
				
			}	
			
			else if(star.intersects(card3)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u�^���̗ցv�ł�");
				TextTurtle text2 = new TextTurtle("�g�̎���ɂ����ω����N�������ł�");
				TextTurtle text3 = new TextTurtle("�`�����X�𓦂����Ȃ��悤�ɂ��܂��傤");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				ring.warp(700,400);				
				card3.looks(ring);
			}
			
			else if(star.intersects(card4)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u���_�v�ł�");
				TextTurtle text2 = new TextTurtle("�Ȃɂ��Ǝ��s�̑�������ɂȂ肻���ł�");
				TextTurtle text3 = new TextTurtle("�l�Ƃ̐ڂ����ɂ͓��ɒ��ӂ��Ă�������");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				death.warp(700,400);				
				card4.looks(death);
			}
			
			else if(star.intersects(card5)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u���v�ł�");
				TextTurtle text2 = new TextTurtle("��l�ŐS�ׂ��s���ɂȂ肪���Ȉ���ł�");
				TextTurtle text3 = new TextTurtle("�F�B�������ɗU���Ă݂�Ƃ����ł��傤");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				moon.warp(700,400);				
				card5.looks(moon);
			}
			
			else if(star.intersects(card6)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u�́v�ł�");
				TextTurtle text2 = new TextTurtle("���݂͂̂Ȃ������ƂȂ肻���ł�");
				TextTurtle text3 = new TextTurtle("�����ɂ��ϋɓI�Ƀg���C���Ă݂܂��傤�I");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				force.warp(700,400);				
				card6.looks(force);
			}
			
			else if(star.intersects(card7)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u���z�v�ł�");
				TextTurtle text2 = new TextTurtle("���ׂẲ^�����Ȃ��ɖ���������ł�");
				TextTurtle text3 = new TextTurtle("���M�����Ă΂��̂��Ɠ����J����ł��傤");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				sun.warp(700,400);				
				card7.looks(sun);
			}
			else if(star.intersects(card8)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u���l�v�ł�");
				TextTurtle text2 = new TextTurtle("�����^���}�㏸������ł�");
				TextTurtle text3 = new TextTurtle("�f�G�ȃ��u�n�v�j���O�����邩������܂���I");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				koibito.warp(700,400);
				card8.looks(koibito);
			}
			else if(star.intersects(card9)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u��ԁv�ł�");
				TextTurtle text2 = new TextTurtle("�O�ɏo��Ɖ����������Ƃ����肻���ł�");
				TextTurtle text3 = new TextTurtle("�^���◷�s�ȂǑ̂𓮂����Ɨǂ��ł��傤");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				sensya.warp(700,400);				
				card9.looks(sensya);
			}
			else if(star.intersects(card10)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u���v�ł�");
				TextTurtle text2 = new TextTurtle("�F���𗬂��͂����Ȃ��ɂӂ肻�����܂�");
				TextTurtle text3 = new TextTurtle("�Y�݉����̎����������肻���ł��I");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				hoshi.warp(700,400);				
				card10.looks(hoshi);
			}
			else if(star.intersects(card11)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u�c��v�ł�");
				TextTurtle text2 = new TextTurtle("�����̓��[�_�[�V�b�v�����߂�ꂻ���ł�");
				TextTurtle text3 = new TextTurtle("�����I�Ȏv�l�ň�ڒu�����ł��傤");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				koutei.warp(700,400);				
				card11.looks(koutei);
			}
			else if(star.intersects(card12)){
				TextTurtle text = new TextTurtle("���Ȃ��̃J�[�h�́u�B�ҁv�ł�");
				TextTurtle text2 = new TextTurtle("�����̖{����l�̓��ʂɋC�Â�����ł�");
				TextTurtle text3 = new TextTurtle("��l�̎��Ԃ��؂ɂ��܂��傤");
				text2.warp(700,170);
				text3.warp(700,270);
				text.warp(700,70);
				inzya.warp(700,400);				
				card12.looks(inzya);
			}			
			
			update();
			
		}		
		
		
	}
	
	
	
}