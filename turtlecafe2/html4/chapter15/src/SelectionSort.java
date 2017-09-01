import java.awt.Color;

/*
* �v���O�������F�ŏ��l�I��@�ɂ����ёւ� 
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class SelectionSort extends Turtle {
	
	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort(), args);
	}
	
	// �^�[�g���𓮂�������
	public void start() {
		hide();
		window.size(400,400);
		ListTurtle<CardTurtle> �ŏ��l��� = new ListTurtle<CardTurtle>(true,"�ŏ��l���");
		ListTurtle<CardTurtle> �������� = new ListTurtle<CardTurtle>(true,"��������");
		ListTurtle<CardTurtle> �����ϑ� = new ListTurtle<CardTurtle>(true,"�����ϑ�");
		ListTurtle<CardTurtle> ���֍ϑ� = new ListTurtle<CardTurtle>(true,"���֍ϑ�");
		{	//c//�����ʒu�ɐݒ肷��
			�ŏ��l���.warpByTopLeft(50,20);
			�ŏ��l���.setBgColor(new Color(255,153,204));
			��������.warpByTopLeft(50,90);
			��������.setBgColor(new Color(51,102,255));
			�����ϑ�.warpByTopLeft(50,160);
			�����ϑ�.setBgColor(new Color(0,204,153));
			���֍ϑ�.warpByTopLeft(50,230);
			���֍ϑ�.setBgColor(new Color(255,255,0));
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
		{	//���ёւ���
			while(��������.getSize() > 0){
				{	//�ŏ��l����������
					{	//���������̈�ԏ���ŏ��l����
						�ŏ��l���.addLast(��������.getObjectAtCursor());
						update();
					}
					while(��������.getSize() > 0){
						if(��������.getObjectAtCursor().getNumber() < �ŏ��l���.getObjectAtCursor().getNumber()){
							{	//�ŏ��l�����������J�[�h�Ɠ���ւ��C�Â��ŏ��l���͌����ςݑ���
								�����ϑ�.addLast(�ŏ��l���.getObjectAtCursor());
								update();
								�ŏ��l���.addLast(��������.getObjectAtCursor());
								update();
							}
						}else {
							{	//�������J�[�h�������ςݑ���
								�����ϑ�.addLast(��������.getObjectAtCursor());
								update();
							}
						}
						
					}
					{	//�����ςݑ������ɖ߂�
						�����ϑ�.moveAllTo(��������);
						update();
					}
				}
				{	//�������ŏ��l����֍ςݑ��ֈړ�����
					���֍ϑ�.addLast(�ŏ��l���.getObjectAtCursor());
					update();
				}
			}
		}
	}
	
}