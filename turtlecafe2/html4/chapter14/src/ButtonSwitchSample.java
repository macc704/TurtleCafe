/**
 * �v���O�������F�ǂ̃{�^���������ꂽ���\������v���O���� �쐬�ҁF MegumiAraki �쐬���F Wed Dec 05 13:24:46 JST
 * 2007
 */
public class ButtonSwitchSample extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ButtonSwitchSample());
	}

	// �{�^��
	ButtonTurtle helloButton;
	ButtonTurtle byeButton;

	// �^�[�g���𓮂�������
	public void start() {

		����������();

		// �A�j���V�������[�v
		String text = "�\���p�e�L�X�g";
		while (true) {
			// �҂�
			sleep(0.25);

			// �������s��
			// �{�^���̓��͂��󂯕t����
			if (helloButton.isClicked()) {// helloButton���N���b�N���ꂽ��
				text = helloButton.text();
			}
			if (byeButton.isClicked()) {// byeButton���N���b�N���ꂽ��
				text = byeButton.text();
			} else {
				//�������Ȃ�
			}
			print(text);//�e�L�X�g���o�͂���

			// �ĕ`�悷��
			update();
		}
	}

	void ����������() {
		hide();

		// �{�^�������
		helloButton = new ButtonTurtle("����ɂ���");
		byeButton = new ButtonTurtle("���悤�Ȃ�");

		// �{�^�������₷���ʒu�ɒu��
		helloButton.warp(100, 50);
		byeButton.warp(100, 100);

		// �ĕ`�悷��
		update();
	}

}