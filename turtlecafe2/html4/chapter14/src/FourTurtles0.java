/*
* FourTurtles0.java
* �S�C�̋T�𓮂����v���O����
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class FourTurtles0 extends Turtle {
	
	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles0(), args);
	}
	
	// �^�[�g���𓮂�������
	public void start() {
		hide();
		window.setSize(1100,500);
		Turtle turtle0 = new Turtle();
		Turtle turtle1 = new Turtle();
		Turtle turtle2 = new Turtle();
		Turtle turtle3 = new Turtle();
		{	//c//�����ʒu�Ɉړ�����
			turtle0.warp(100,100);
			turtle1.warp(100,200);
			turtle2.warp(200,100);
			turtle3.warp(200,200);
		}
		{	//for
			int i = 0;
			while(i < 360){
				{	//��R�}�̏���������
					turtle0.fd(1);
					turtle0.rt(1);
					turtle1.fd(1);
					turtle1.rt(1);
					turtle2.fd(1);
					turtle2.rt(1);
					turtle3.fd(1);
					turtle3.rt(1);
					i++;
				}
			}
		}
	}
}