/**
 * �v���O�������F�����A�v���P�[�V���� 
 * �쐬�ҁFMegumiAraki
 * �o�[�W�����F 1.0 �i20071215�j
 */
public class Dictionary extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Dictionary());
	}

	InputTurtle input;// ���̓{�b�N�X
	TextTurtle result;// �������ʕ\���p�e�L�X�g

	// ���ꕨ
	HolderTurtle keys;
	HolderTurtle values;

	// �^�[�g���𓮂�������
	public void start() {

		����������();

		while (true) {
			sleep(0.025);// �҂�

			// �G���^�[�L�[�������ꂽ��A
			if (key() == 10) {
				//�������s���C���ʂ�\������
				String key = input.text();
				String value = ��������(key);
				result.text(value);
				input.clearText();
			}

			update();// �ĕ`�悷��			
		}
	}

	// ��������
	String ��������(String searchKey) {

		for (int i = 1; i <= keys.�����Ă�����̂̌�(); i++) {// �P�����ׂ�
			keys.�J�[�\���ʒu��ς���(i);
			if (keys.�J�[�\���ʒu�ɂ�����̂̓��e().equals(searchKey)) {// ����������
				values.�J�[�\���ʒu��ς���(i);
				return values.�J�[�\���ʒu�ɂ�����̂̓��e();// �������ʂ�Ԃ�
			}
		}

		// ������Ȃ�������
		return "������܂���ł���";
	}

	void ����������() {

		hide();

		// ���̓{�b�N�X
		input = new InputTurtle();
		input.warp(30, 30);

		// ��������
		result = new TextTurtle("�����ɕ��͂��\������܂�");
		result.fontsize(14);

		// �����̓ǂ݂����Ă������ꕨ
		keys = new HolderTurtle();
		keys.warp(50, 200);
		keys.�Ō�ɒǉ�����(new CardTurtle("���"));
		keys.�Ō�ɒǉ�����(new CardTurtle("������"));
		keys.�Ō�ɒǉ�����(new CardTurtle("�߂��"));
		keys.�Ō�ɒǉ�����(new CardTurtle("�΂Ȃ�"));

		// �����̓��e�����Ă������ꕨ
		values = new HolderTurtle();
		values.warp(50, 250);
		values.�Ō�ɒǉ�����(new CardTurtle("apple"));
		values.�Ō�ɒǉ�����(new CardTurtle("strawberry"));
		values.�Ō�ɒǉ�����(new CardTurtle("melon"));
		values.�Ō�ɒǉ�����(new CardTurtle("banana"));

		input.toJapaneseMode();// ���͂���{�ꃂ�[�h�ɂ���

		update();// �ĕ`�悷��
	}

}
