/*
 * �v���O�������F�앶����A�v���P�[�V���� 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class SakubunApplication extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SakubunApplication(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {
		hide();
		window.size(520, 270);

		ButtonTurtle makeButton = new ButtonTurtle("�����쐬");
		makeButton.warp(100, 30);

		TextTurtle sentence = new TextTurtle("");
		sentence.warp(300, 80);

		// ���̓{�b�N�X
		InputTurtle input = new InputTurtle();
		input.warp(30, 130);
		input.toJapaneseMode();// ���͂���{�ꃂ�[�h�ɂ���

		ButtonTurtle inputNounButton = new ButtonTurtle("�����Ƃ��Ēǉ�");
		inputNounButton.warp(300, 130);

		ButtonTurtle inputVerbButton = new ButtonTurtle("�����Ƃ��Ēǉ�");
		inputVerbButton.warp(300, 180);

		// ����
		ListTurtle<TextTurtle> nouns = new ListTurtle<TextTurtle>(true);
		nouns.warp(50, 250);
		nouns.addLast(new TextTurtle("��"));

		// ����
		ListTurtle<TextTurtle> verbs = new ListTurtle<TextTurtle>(true);
		verbs.warp(50, 300);
		verbs.addLast(new TextTurtle("�H�ׂ�"));

		while (true) {
			sleep(0.025);// �҂�

			// �����̒ǉ�
			if (inputNounButton.isClicked()) {
				if (!input.text().equals("")) {
					nouns.addLast(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			// �����̒ǉ�
			if (inputVerbButton.isClicked()) {
				if (!input.text().equals("")) {
					verbs.addLast(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			if (makeButton.isClicked()) {
				String text = "";
				nouns.setCursor(random(nouns.getSize()) + 1);
				text += nouns.getObjectAtCursor().getText() + "��";
				nouns.setCursor(random(nouns.getSize()) + 1);
				text += nouns.getObjectAtCursor().getText() + "��";
				verbs.setCursor(random(verbs.getSize()) + 1);
				text += verbs.getObjectAtCursor().getText() + "�B";
				sentence.text(text);
			}

			update();// �ĕ`�悷��
		}
	}

}
