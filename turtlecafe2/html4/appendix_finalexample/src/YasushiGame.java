/**
 * �v���O�������F�₷���̏o��
 * �쐬�ҁF���q����
 * �쐬���F Tue Jan 08 19:03:09 JST 2008
 */
public class YasushiGame extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new YasushiGame());
	}

	//�^�[�g���𓮂�������
	public void start() {
     hide(); //�^�[�g���������B

	//��ʂ̒���
	window.size(1000,550);

	//�ϐ��̒�`
	int lange= 2500; //�������܂ł̋���
	int keycode; //�L�[�ԍ�
	int x, y; //�₷���̍��W
	int x1, y1; //�ǂȂ�̍��W
	int x2, x3, x4; //�w�i�̍��W
	int a1, a2, a3, b1, b2, b3; //��Q���̍��W
	int life = 500; //�₷���̃��C�t
	int officex; //�������̍��W
	
	//�L�����N�^�[�̐���
	ImageTurtle road1 = new ImageTurtle ("road.jpg"); //�w�i�P
	ImageTurtle road2 = new ImageTurtle ("road.jpg"); //�w�i�Q
	ImageTurtle road3 = new ImageTurtle ("road.jpg"); //�w�i�R
	ImageTurtle office  = new ImageTurtle ("office.jpg"); //������
     ImageTurtle yasushi = new ImageTurtle ("yasushi.jpg"); //�₷��
	ImageTurtle bentz = new ImageTurtle ("bentz.jpg"); //�x���c
	ImageTurtle bus = new ImageTurtle ("bus.jpg"); //�o�X
	ImageTurtle dump = new ImageTurtle ("dump.jpg"); //�_���v
	
	ImageTurtle donari = new ImageTurtle ("donari.jpg"); //�ǂȂ�
	ImageTurtle vanishment = new ImageTurtle ("vanishment.jpg"); //����
     ImageTurtle explosion = new ImageTurtle ("explosion.jpg");//����
	
	//�ϐ�����ʂɕ\������
	
     TextTurtle langemeter=new TextTurtle();
	TextTurtle lifebar = new TextTurtle(); //lifebar�Ƃ������O��TextTurtle

	TextTurtle lifebartext = new TextTurtle();
	TextTurtle langetext1 = new TextTurtle();
	TextTurtle langetext2 = new TextTurtle();
	
	lifebartext.text("LIFE:"); 	
	langetext1.text("�������܂ł���");
	langetext2.text("m");
	
	//�Ԃ������ŕ\������
	langemeter.color(java.awt.Color.red);
	langetext1.color(java.awt.Color.red);
	langetext2.color(java.awt.Color.red);
	
	lifebartext.color(java.awt.Color.red);
	lifebar.color(java.awt.Color.red);

	//�����ʒu�Ɉړ�
	yasushi.warp(100,250);
	bentz.warp(2500,100);
	bus.warp(1500,200);
	dump.warp(3000,300);
	
	donari.warp(1200,1000);
	road1.warp(0,250);
	road2.warp(1000,250);
     road3.warp(2000,250);
	bentz.scale(0.5);
	bus.scale(0.5);
	dump.scale(0.5);
	
	yasushi.scale(0.4);
	langemeter.warp(840,25);
	lifebar.warp(950,420);
	lifebartext.warp(880,420);
	langetext1.warp(680,25); 
	langetext2.warp(920,25);
	office.warp(1300,250);
	
	vanishment.warp(2000,2000);
     explosion.warp(2000,2000);
	
	donari.rt(90);

	while (true) {
	//�҂�
	sleep(0.01);

	//����
	//��������Ă���L�[���擾����
	keycode = key();

	//�L�����N�^�[��������ʒu���擾����
	x = yasushi.getX(); //�₷��
	y = yasushi.getY(); //�₷��
	x1 = donari.getX(); //�ǂȂ�
 	y1 = donari.getY(); //�ǂȂ�
	x2 = road1.getX(); //�w�i1
	x3 = road2.getX(); //�w�i2
	x4 = road3.getX(); //�w�i3
	a1 = bentz.getX(); //��Q��1
	a2 = bus.getX(); //��Q��2
	a3 = dump.getX(); //��Q��3
	b1 = bentz.getY(); //��Q��1
	b2 = bus.getY(); //��Q��2
	b3 = dump.getY(); //��Q��3
	
	officex = office.getX(); //������

	//���[�^�[�̕����F��ω�������

	if (life <= 100) {
	lifebar.color(java.awt.Color.red);
	}

	
	//�N���A�ƃQ�[���I�[�o�[
	
	     if (life < 0) {
		life = 0;
		lifebar.text(life);
		donari.show(false);
		yasushi.looks(explosion);
		sleep(0.2);
		yasushi.looks(explosion);
		TextTurtle gameover = new TextTurtle("GAME OVER");
		gameover.color(java.awt.Color.red);
		lifebar.text(life);
		update();
		break;
	
	}

	if (lange < 0) {
		lange = 0;
		TextTurtle clear = new TextTurtle("�ړI�n�����I");
		clear.color(java.awt.Color.blue);	
		office.warp(800,250);
		update();
		break;
	} else if (lange <= 500) {
		langemeter.color(java.awt.Color.red);	
		office.warp(officex - 1,250);
	}

	//�A�j���[�V����
		//�w�i�𓮂���
		road1.warp(x2 - 11,250);
		road2.warp(x3 - 11,250);
		road3.warp(x4 - 11,250);
		if (x2 < -500) {
		    road1.warp (2000,250);
			}
		if (x3 < -500) {
		    road2.warp (2000,250);
			}
		if (x4 < -500) {
		    road3.warp (2000,250);
			}
	
		//�₷���𑀍삷��
			//�X�y�[�X�L�[�������ꂽ��ǂȂ�𔭎�
			if (keycode == 32) { //�X�y�[�X�L�[
	    		donari.warp(x + 100,y);
						}
	
			//�㉺���E�L�[�������ꂽ��₷���𓮂���
		       if (keycode == 37) { //��
			yasushi.warp(x - 18, y);
			
		
			} else if (keycode == 38) { //��
			yasushi.warp(x, y - 18);
			
		
			} else if (keycode == 39) { //�E
			yasushi.warp(x + 18, y);
			
			} else if (keycode == 40) { //��
			yasushi.warp(x, y + 18);
			
			}

			
			//�㉺�̓����𐧌�����
			if (y < 30) {
			yasushi.warp(x,30);
			}
			if (y > 410) {
			yasushi.warp(x,410);
			}

			//���E�̓����𐧌�����
			if (x < 60) {
			yasushi.warp(60,y);
			}
			if (x > 930) {
			yasushi.warp(930,y);
			}


		//�ǂȂ�̃A�j���[�V����
           donari.fd(30);
          if(x1>1500){
          donari.warp(0,1000);
		}

		//��Q���̃A�j���[�V����
			//��Q�����������Ă���
			bentz.warp(a1 - 10, b1);
			bus.warp(a2 - 10, b2);
			dump.warp(a3 - 10, b3);
			
			//��Q�������x���������Ă���悤�ɂ���
			if (a1 < -500) {
			bentz.warp(1300 , 100);
			bentz.looks(bentz);
			}
			if (a2 < -150) {
			    bus.warp(2280 + life, 200);
			    bus.looks(bus);
			}
			if (a3 < -20) {
			    dump.warp(1600 + life, 300);
			    dump.looks(dump);
			}
		
	
	//�����蔻��
		//�₷���Ə�Q��
		if (yasushi.intersects(bentz)){
		life--;
		life--;
		bentz.looks(explosion);
		}
		if (yasushi.intersects(bus)){
		life--;
		life--;
		bus.looks(explosion);
		}
		if (yasushi.intersects(dump)){
		life--;
		life--;
		dump.looks(explosion);
		}
	

		//�ǂȂ�Ə�Q��
		if (donari.intersects(bentz)){
		bentz.looks(vanishment);
		sleep(0.05);
		bentz.warp(2500 ,100);
		bentz.looks(bentz);
		}
		if (donari.intersects(bus)){
		bus.looks(vanishment);
		sleep(0.05);
		bus.warp(1300+y + life,200);
		bus.looks(bus);
		}
		if (donari.intersects(dump)){
		dump.looks(vanishment);
		sleep(0.05);
		dump.warp(x+y+2000 ,300);
		dump.looks(dump);
		}
		
	//�ĕ`��
	update();

	//���_�A���C�t�̍X�V
	langemeter.text(lange);
	lifebar.text(life);
	

	//�X�R�A���Z
	lange--;


	}	



}

}