/*
* �v���O�������F�J�[�h�����X�g�P���烊�X�g�Q�Ɉړ�����v���O����
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class MoveCards extends Turtle {
	
	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveCards(), args);
	}
	
	// �^�[�g���𓮂�������
	public void start() {
		hide();
		Turtle.window.size(550,300);
		ListTurtle<CardTurtle> list1 = new ListTurtle<CardTurtle>(true,"���X�g1");
		ListTurtle<CardTurtle> list2 = new ListTurtle<CardTurtle>(true,"���X�g2");
		{	//�ʒu���ړ�����
			list1.warp(50,40);
			list2.warp(50,110);
		}
		{	//�J�[�h������
			int i = 0;
			while(i < 10){
				list1.addLast(new CardTurtle(i * 10));
				i++;
			}
		}
		do{
			sleep(0.5);
			{	//�ړ�����
				if(list1.getSize() != 0){
					list2.addLast(list1.getObjectAtCursor());
				}else if(list1.getSize() == 0){
					break;
				}
				
			}
			update();
		}while(true);
		print("�A�j���[�V�������[�v���I�����܂����D");
	}
	
}