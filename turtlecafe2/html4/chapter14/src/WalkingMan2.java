/*
* WalkingMan2.java
* �l�������A�j���[�V�����v���O���� (List�g�p��)
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class WalkingMan2 extends Turtle {
	
	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new WalkingMan2(), args);
	}
	
	// �^�[�g���𓮂�������
	public void start() {
		hide();
		window.setSize(1100,500);
		ListTurtle<ImageTurtle> holder = new ListTurtle<ImageTurtle>(true);
		holder.warpByTopLeft(50,200);
		{	//�A�j���[�V�����p�摜��p�ӂ���
			int i = 1;
			while(i <= 8){
				holder.addLast(new ImageTurtle((("man" + i) + ".gif")));
				i++;
			}
		}
		Turtle man = new Turtle();
		while(true){
			sleep(0.1);
			{	//1�R�}�̏���
				holder.moveCursorToNext();
				man.looks(holder.getObjectAtCursor());
			}
			update();
		}
	}
}