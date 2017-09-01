/**
 * �v���O�������F�앶����A�v���P�[�V���� 
 * �쐬�ҁFMegumiAraki
 * �o�[�W�����F 1.0 �i20071215�j
 */
public class SakubunApplication extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SakubunApplication());
	}

	ButtonTurtle inputNounButton;
	ButtonTurtle inputVerbButton;
	ButtonTurtle makeButton;
	InputTurtle input;
	TextTurtle sentence;

	// ���ꕨ
	HolderTurtle nouns;
	HolderTurtle verbs;

	// �^�[�g���𓮂�������
	public void start() {

		����������();

		while (true) {
			sleep(0.025);// �҂�

			//�����̒ǉ�
			if (inputNounButton.isClicked()) {
				if (!input.text().equals("")) {
					nouns.�Ō�ɒǉ�����(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			//�����̒ǉ�
			if (inputVerbButton.isClicked()) {
				if (!input.text().equals("")) {
					verbs.�Ō�ɒǉ�����(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			if (makeButton.isClicked()) {
				String text = "";
				nouns.�J�[�\���ʒu��ς���(random(nouns.�����Ă�����̂̌�()) + 1);
				text += nouns.�J�[�\���ʒu�ɂ�����̂̓��e() + "���C";
				nouns.�J�[�\���ʒu��ς���(random(nouns.�����Ă�����̂̌�()) + 1);
				text += nouns.�J�[�\���ʒu�ɂ�����̂̓��e() + "���C";
				verbs.�J�[�\���ʒu��ς���(random(verbs.�����Ă�����̂̌�()) + 1);
				text += verbs.�J�[�\���ʒu�ɂ�����̂̓��e() + "�D";
				sentence.text(text);
			}

			update();// �ĕ`�悷��
		}
	}

	void ����������() {
		hide();
		window.size(520, 270);

		makeButton = new ButtonTurtle("�����쐬");
		makeButton.warp(100, 30);

		sentence = new TextTurtle("");
		sentence.warp(300, 80);

		// ���̓{�b�N�X
		input = new InputTurtle();
		input.warp(30, 130);
		input.toJapaneseMode();// ���͂���{�ꃂ�[�h�ɂ���

		inputNounButton = new ButtonTurtle("�����Ƃ��Ēǉ�");
		inputNounButton.warp(300, 130);

		inputVerbButton = new ButtonTurtle("�����Ƃ��Ēǉ�");
		inputVerbButton.warp(300, 180);

		// ����
		nouns = new HolderTurtle();
		nouns.warp(50, 250);
		nouns.�Ō�ɒǉ�����(new TextTurtle("��"));

		// ����
		verbs = new HolderTurtle();
		verbs.warp(50, 300);
		verbs.�Ō�ɒǉ�����(new TextTurtle("�H�ׂ�"));

		update();// �ĕ`�悷��
	}

}
