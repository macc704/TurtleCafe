/**
* �v���O�������F
* �쐬�ҁF 
* �쐬���F Mon Jan 07 02:13:20 JST 2008
*/
public class Shiritori2 extends Turtle {
	
	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Shiritori2());
	}
	
	//�^�[�g���𓮂�������
	public void start() {
		window.size(800,350);
		
		//����Ƃ�Q�[���J�n���}
		TextTurtle text = new TextTurtle("�R��������Ƃ�ł��B�P��̍Ō�Ɂu��v���������畉���ł��B");
		TextTurtle text2 = new TextTurtle("���_�┼���_�̂����̂����Ō�ɂȂ�P������͂��Ȃ��ł��������B");
		TextTurtle text3 = new TextTurtle("�P�̘g�ɂP����������͂��Ă��������B�g��؂�ւ���ɂ̓X�y�[�X�������Ă�������");
		text.warp(500,180);
		text2.warp(500,210);
		text3.warp(500,240);
		text.fontsize(14);
		text2.fontsize(14);
		text3.fontsize(14);
		
		//���̓{�b�N�X
		InputTurtle input = new InputTurtle();
		input.warp(30, 30);
		
		InputTurtle input2 = new InputTurtle();
		input2.warp(30, 50);
		input2.setActive(false);
		
		InputTurtle input3 = new InputTurtle();
		input3.warp(30, 70);
		input3.setActive(false);
		
		input.toJapaneseMode();
		input2.toJapaneseMode();
		input3.toJapaneseMode();
		
		while(true){
			
			sleep(0.025);
			
			
			
			//���肩��
			if (key() == 32) {//�X�y�[�X����������
				if (input.isActive()) {
					input.setActive(false);
					input2.setActive(true);
					input3.setActive(false);
					
					
				} else if (input2.isActive()) {
					input.setActive(false);
					input2.setActive(false);
					input3.setActive(true);
					
					
				}else if(input3.isActive()){
					input.setActive(true);
					input2.setActive(false);
					input3.setActive(false);
					
					
				}
			}
			
			//���̓^�[�g������\��	
			if (key() == 10){	
				text.text(input3.text());
			}	
			

			
			
			//����̒P��̍Ō�̕����ɂ��ꍇ����
			if (input3.text().equals("��")){
				text.text("������");	

			}else if(input3.text().equals("��")){
				
				text.text("����");
			}else if(input3.text().equals("��")){
				
				text.text("������");
			}else if(input3.text().equals("��")){
			
				text.text("���̂�");
			}else if(input3.text().equals("��")){
				
				text.text("������");		
			}else if(input3.text().equals("��")){
				
				text.text("������");
			}else if(input3.text().equals("��")){
				
				text.text("���̂�");
			}else if(input3.text().equals("��")){
				
				text.text("�����");
			}else if(input3.text().equals("��")){
				
				text.text("������");
			}else if(input3.text().equals("��")){
				
				text.text("������");
			}else if(input3.text().equals("��")){
			
				text.text("������");
			}else if(input3.text().equals("��")){
				
				text.text("���͂�");
			}else if(input3.text().equals("��")){
				
				text.text("������");
			}else if(input3.text().equals("��")){
				
				text.text("���Ȃ�");
			}else if(input3.text().equals("��")){
				
				text.text("������");
			}else if(input3.text().equals("��")){
				
				text.text("���΂�");
			}else if(input3.text().equals("��")){
				
				text.text("������");
			}else if(input3.text().equals("��")){
				
				text.text("�݂�");
			}else if(input3.text().equals("��")){
				
				text.text("�Ă���");
			}else if(input3.text().equals("��")){
				
				text.text("�Ƃ���");
			}else if(input3.text().equals("��")){
				
				text.text("�Ȃ݂�");
			}else if(input3.text().equals("��")){
			
				text.text("�ɂ���");
			}else if(input3.text().equals("��")){
				
				text.text("�ʂ܂�");
			}else if(input3.text().equals("��")){
				
				text.text("�˂���");
			}else if(input3.text().equals("��")){
			
				text.text("�̂��");
			}else if(input3.text().equals("��")){
				
				text.text("�͂���");
			}else if(input3.text().equals("��")){
				
				text.text("�Ђ��");
			}else if(input3.text().equals("��")){
			
				text.text("�ӂ��");
			}else if(input3.text().equals("��")){
				text.text("�ւ���");
			}else if(input3.text().equals("��")){
				
				text.text("�قĂ�");		
			}else if(input3.text().equals("��")){
				
				text.text("�܂��");
			}else if(input3.text().equals("��")){
				
				text.text("�݂��");
			}else if(input3.text().equals("��")){
				
				text.text("�ނ���");
			}else if(input3.text().equals("��")){
				
				text.text("�߂���");
			}else if(input3.text().equals("��")){
				
				text.text("���Â�");
			}else if(input3.text().equals("��")){
				text.text("�₽��");
			}else if(input3.text().equals("��")){
				text.text("�䂤��");
			}else if(input3.text().equals("��")){
				text.text("��₭");
			}else if(input3.text().equals("��")){
				text.text("�炶��");
			}else if(input3.text().equals("��")){
				text.text("�肸��");
			}else if(input3.text().equals("��")){
				text.text("��݂�");
			}else if(input3.text().equals("��")){
				text.text("�ꂫ��");
			}else if(input3.text().equals("��")){
				text.text("�낵��");
			}else if(input3.text().equals("��")){
				text.text("���");
			}else if(input3.text().equals("��")){
				text.text(	"�c�O�I���Ȃ��̕����ł��B");
				//�I���̍��}
				
			}


			update();
		}
}}