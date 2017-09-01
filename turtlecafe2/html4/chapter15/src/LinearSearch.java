import java.awt.Color;

/*
* �v���O�������F�ŏ��l�̌��� 
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class LinearSearch extends Turtle {
	
	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LinearSearch(), args);
	}
	
	// �^�[�g���𓮂�������
	public void start() {
		hide();
		Turtle.window.size(400,400);
		ListTurtle<CardTurtle> �ŏ��l��� = new ListTurtle<CardTurtle>(true,"�ŏ��l���");
		ListTurtle<CardTurtle> �������� = new ListTurtle<CardTurtle>(true,"��������");
		ListTurtle<CardTurtle> �����ϑ� = new ListTurtle<CardTurtle>(true,"�����ϑ�");
		{	//c//�����ʒu�Ɉړ�����
			�ŏ��l���.warpByTopLeft(50,20);
			�ŏ��l���.setBgColor(new Color(255,153,204));
			��������.warpByTopLeft(50,90);
			��������.setBgColor(new Color(51,102,255));
			�����ϑ�.warpByTopLeft(50,160);
			�����ϑ�.setBgColor(new Color(0,204,153));
			update();
		}
		{	//�J�[�h��ǉ�����
			int i = 0;
			while(i < 8){
				��������.addLast(new CardTurtle(random(100)));
				update();
				i++;
			}
		}
		{	//����������
			�ŏ��l���.addLast(��������.getObjectAtCursor());
			while(��������.getSize() > 0){
				if(��������.getObjectAtCursor().getNumber() < �ŏ��l���.getObjectAtCursor().getNumber()){
					�����ϑ�.addLast(�ŏ��l���.getObjectAtCursor());
					update();
					�ŏ��l���.addLast(��������.getObjectAtCursor());
					update();
				}else {
					�����ϑ�.addLast(��������.getObjectAtCursor());
					update();
				}
				
			}
			�����ϑ�.moveAllTo(��������);
			update();
		}
	}
	
}