/*
 * �v���O�������F�G�����A�v���P�[�V���� 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DictionaryApplication extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DictionaryApplication(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();
		window.setSize(700, 500);

		// ���̓{�b�N�X
		InputTurtle input = new InputTurtle();
		input.toJapaneseMode();
		input.warpByTopLeft(30, 30);

		// �o�͌���
		ImageTurtle result = new ImageTurtle("notfound.gif");
		result.size(100, 100);
		result.warpByTopLeft(30, 60);

		// �����̓ǂ݂����Ă������ꕨ
		ListTurtle<CardTurtle> keys = new ListTurtle<CardTurtle>(true);
		keys.warpByTopLeft(30, 200);
		keys.addLast(new CardTurtle("���"));
		keys.addLast(new CardTurtle("������"));
		keys.addLast(new CardTurtle("������"));
		keys.addLast(new CardTurtle("�݂���"));

		// �����̓��e�i�G�j�����Ă������ꕨ
		ListTurtle<ImageTurtle> values = new ListTurtle<ImageTurtle>(true);
		values.warpByTopLeft(30, 250);
		values.addLast(new ImageTurtle("apple.gif"));
		values.addLast(new ImageTurtle("strawberry.gif"));
		values.addLast(new ImageTurtle("wm.gif"));
		values.addLast(new ImageTurtle("orange.gif"));
		values.addLast(new ImageTurtle("notfound.gif"));

		//�����{�^��
		ButtonTurtle button = new ButtonTurtle("�����I");
		button.warpByTopLeft(200, 30);

		while (true) {
			sleep(0.025);// �҂�

			if(button.isClicked()){
				//��������
				String key = input.text();		
				for (int i = 0; i < keys.getSize(); i++) {// �P�����ׂ�
					keys.setCursor(i);
					if (keys.getObjectAtCursor().getText().equals(key)) {// ��������
						values.setCursor(i);
						result.looks(values.getObjectAtCursor());
						input.clearText();
					}
				}
			}

			update();// �ĕ`�悷��
		}
	}

}