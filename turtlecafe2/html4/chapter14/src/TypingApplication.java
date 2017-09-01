/**
 * �v���O�������F�^�C�s���O�Q�[���A�v���P�[�V���� 
 * �쐬�ҁFMegumiAraki
 * �o�[�W�����F 1.0 �i20071215�j
 */
public class TypingApplication extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new TypingApplication());
	}

	InputTurtle input;// ���̓{�b�N�X
	TextTurtle result;// �������ʕ\���p�e�L�X�g
	ImageTurtle question;// �������ʕ\���p�e�L�X�g

	// ���ꕨ
	HolderTurtle answers;
	HolderTurtle questions;

	// �^�[�g���𓮂�������
	public void start() {

		����������();

		long startTime = System.currentTimeMillis();
		int inputCharacterCount = 0;//�ł����񂾕�����

		while (true) {
			sleep(0.025);// �҂�

			// �G���^�[�L�[�������ꂽ��A
			if (key() == 10) {

				String text = input.text();
				if (answers.�J�[�\���ʒu�ɂ�����̂̓��e().equals(text)) {
					//�ł����񂾕������𐔂���
					inputCharacterCount += text.length();

					//���̖��ɐi��
					questions.�J�[�\����i�߂�();
					answers.�J�[�\����i�߂�();
					question.looks(questions.�J�[�\���ʒu�ɂ������());
					input.clearText();

					//�Ō�̏ꍇ�C���ʂ�\������					
					if (answers.�J�[�\���ʒu() == answers.�����Ă�����̂̌�()) {
						long endTime = System.currentTimeMillis();
						long miliTime = endTime - startTime;//�����������ԁi�~���b�j
						double time = (double) miliTime / (double) 1000
								/ (double) 60;//������������(��)
						int speed = (int) (inputCharacterCount / time);
						result.text("���Ȃ��̃^�C�s���O���x��" + speed + "����/���ł��D");
					}
				}
			}

			update();// �ĕ`�悷��			
		}
	}

	// ��������
	ImageTurtle search(String searchKey) {
		for (int i = 1; i <= answers.�����Ă�����̂̌�(); i++) {// �P�����ׂ�
			answers.�J�[�\���ʒu��ς���(i);
			if (answers.�J�[�\���ʒu�ɂ�����̂̓��e().equals(searchKey)) {// ����������
				questions.�J�[�\���ʒu��ς���(i);
				return questions.�J�[�\���ʒu�ɂ������();// �������ʂ�Ԃ�
			}
		}

		// ������Ȃ�������
		return null;
	}

	void ����������() {
		hide();
		window.size(500, 220);

		// ���̓{�b�N�X
		input = new InputTurtle();
		input.warp(250, 100);
		input.toJapaneseMode();// ���͂���{�ꃂ�[�h�ɂ���

		// ���
		question = new ImageTurtle("start.gif");
		question.warp(100, 100);

		// ��������
		result = new TextTurtle("-----�^�C�s���O�Q�[��-----");
		result.fontsize(10);
		result.warp(100, 30);

		// �����̓ǂ݂����Ă������ꕨ
		answers = new HolderTurtle();
		answers.warp(50, 200);
		answers.�Ō�ɒǉ�����(new CardTurtle(""));
		answers.�Ō�ɒǉ�����(new CardTurtle("���"));
		answers.�Ō�ɒǉ�����(new CardTurtle("������"));
		answers.�Ō�ɒǉ�����(new CardTurtle("������"));
		answers.�Ō�ɒǉ�����(new CardTurtle("�݂���"));
		answers.�Ō�ɒǉ�����(new CardTurtle("�I��"));

		// �����̓��e�����Ă������ꕨ
		questions = new HolderTurtle();
		questions.warp(50, 250);
		questions.�Ō�ɒǉ�����(new ImageTurtle("start.gif"));
		questions.�Ō�ɒǉ�����(new ImageTurtle("apple.gif"));
		questions.�Ō�ɒǉ�����(new ImageTurtle("strawberry.gif"));
		questions.�Ō�ɒǉ�����(new ImageTurtle("wm.gif"));
		questions.�Ō�ɒǉ�����(new ImageTurtle("orange.gif"));
		questions.�Ō�ɒǉ�����(new ImageTurtle("terminater.gif"));

		update();// �ĕ`�悷��
	}

}
