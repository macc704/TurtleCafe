/*
 * �v���O�������F�^�C�s���O�Q�[���A�v���P�[�V���� 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class TypingApplication extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new TypingApplication(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();
		window.size(500, 220);

		// ���̓{�b�N�X
		InputTurtle input = new InputTurtle();
		input.warp(250, 100);
		input.toJapaneseMode();// ���͂���{�ꃂ�[�h�ɂ���

		// ���
		ImageTurtle question = new ImageTurtle("start.gif");
		question.warp(100, 100);

		// ��������
		TextTurtle result = new TextTurtle("-----�^�C�s���O�Q�[��-----");
		result.fontsize(10);
		result.warp(100, 30);

		// �����̓ǂ݂����Ă������ꕨ
		ListTurtle<CardTurtle> answers = new ListTurtle<CardTurtle>(true);
		answers.warp(50, 200);
		answers.addLast(new CardTurtle(""));
		answers.addLast(new CardTurtle("���"));
		answers.addLast(new CardTurtle("������"));
		answers.addLast(new CardTurtle("������"));
		answers.addLast(new CardTurtle("�݂���"));
		answers.addLast(new CardTurtle("�I��"));

		// �����̓��e�����Ă������ꕨ
		ListTurtle<ImageTurtle> questions = new ListTurtle<ImageTurtle>(true);
		questions.warp(50, 250);
		questions.addLast(new ImageTurtle("start.gif"));
		questions.addLast(new ImageTurtle("apple.gif"));
		questions.addLast(new ImageTurtle("strawberry.gif"));
		questions.addLast(new ImageTurtle("wm.gif"));
		questions.addLast(new ImageTurtle("orange.gif"));
		questions.addLast(new ImageTurtle("terminater.gif"));

		long startTime = System.currentTimeMillis();
		int inputCharacterCount = 0;// �ł����񂾕�����

		while (true) {
			sleep(0.025);// �҂�

			// �G���^�[�L�[�������ꂽ��A
			if (key() == 10) {

				String text = input.text();
				if (answers.getObjectAtCursor().getText().equals(text)) {
					// �ł����񂾕������𐔂���
					inputCharacterCount += text.length();

					// ���̖��ɐi��
					questions.moveCursorToNext();
					answers.moveCursorToNext();
					question.looks(questions.getObjectAtCursor());
					input.clearText();

					// �Ō�̏ꍇ�C���ʂ�\������
					if (answers.getCursor() == answers.getSize() - 1) {
						long endTime = System.currentTimeMillis();
						long miliTime = endTime - startTime;// �����������ԁi�~���b�j
						double time = (double) miliTime / (double) 1000
								/ (double) 60;// ������������(��)
						int speed = (int) (inputCharacterCount / time);
						result.text("���Ȃ��̃^�C�s���O���x��" + speed + "����/���ł��D");
					}
				}
			}

			update();// �ĕ`�悷��
		}
	}

}
