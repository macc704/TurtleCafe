/**
 * �v���O�������F�ǂ̃{�^���������ꂽ���\������v���O���� 
 * �쐬�ҁF MegumiAraki 
 * �쐬���F Wed Dec 05 13:24:46 JST
 * 2007
 */
public class ButtonSample extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ButtonSample());
	}

	// �{�^��
	ButtonTurtle helloButton;
	ButtonTurtle byeButton;

	// �^�[�g���𓮂�������
	public void start() {

		����������();

		// �A�j���V�������[�v
		while (true) {

			// �҂�
			sleep(0.25);

			// �������s��
			if (helloButton.isClicked()) {// helloButton���N���b�N���ꂽ��
				print(helloButton.text());
			} else if (byeButton.isClicked()) {// byeButton���N���b�N���ꂽ��
				print(byeButton.text());
			} else {//�����N���b�N����Ă��Ȃ�������
				//�������Ȃ�
			}

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