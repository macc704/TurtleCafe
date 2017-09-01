import java.awt.Color;

/*
 * �v���O�������F�}���@�̃e���v���[�g 
 * �쐬�ҁF Yoshiaki Matsuzawa
 * �쐬���F 2012/01/17
 */
public class InsertionSortAnswer extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new InsertionSortAnswer(), args);
	}

	public void start() {
		hide();
		window.size(550, 400);

		// �J�[�h�̑������
		ListTurtle<CardTurtle> �������� = new ListTurtle<CardTurtle>(true, "��������");
		ListTurtle<CardTurtle> ���֍ϑ� = new ListTurtle<CardTurtle>(true, "���֍ϑ�");
		��������.warpByTopLeft(50, 90);
		��������.setBgColor(new Color(51, 102, 255));
		���֍ϑ�.warpByTopLeft(50, 230);
		���֍ϑ�.setBgColor(new Color(255, 255, 0));

		// �{�^�������
		ButtonTurtle stepButton = new ButtonTurtle("�X�e�b�v");
		stepButton.warpByTopLeft(400, 20);

		// �J�[�h��8�����A���������ɓ����
		for (int i = 0; i < 8; i++) {
			��������.addLast(new CardTurtle(random(100)));
		}
		���֍ϑ�.addLast(new CardTurtle(999));// ���@�̃X�p�C�X
		waitForPushButton(stepButton);

		// �ȉ��C�}���@�̃v���O����������
		while (��������.getSize() > 0) {
			���֍ϑ�.setCursor(0);
			while (���֍ϑ�.getObjectAtCursor().getNumber() < ��������
					.getObjectAtCursor().getNumber()) {
				���֍ϑ�.moveCursorToNext();
				waitForPushButton(stepButton);
			}
			���֍ϑ�.addToCursor(��������.getObjectAtCursor());
			waitForPushButton(stepButton);
		}

		waitForPushButton(stepButton);
	}

	// �X�e�b�v�{�^�����������܂ő҂�
	void waitForPushButton(ButtonTurtle button) {
		do {
			update();
			sleep(0.025);
		} while (!(button.isClicked()));
	}

}