/*
 * CellSample.java
 * 1�����Z���I�[�g�}�g���̃T���v���v���O����
 * Created on 2011/12/16
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Cell1DSample2 extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Cell1DSample2());
	}

	public void start() {
		window.setSize(800, 600);
		hide();

		int len = 21;

		// �Z���^�[�g��, �Ԃ��^�[�g���@�����ʒu(10, 10) �E����
		CellTurtle ct = new CellTurtle(10);// �傫��10

		// ��̍s������
		ct.fd(len / 2);
		ct.mark();
		ct.bk(len / 2);
		ct.right(1);

		// �܍s�̏������s��
		for (int j = 0; j < len; j++) {
			// ��s�̏������s��
			for (int i = 0; i < len; i++) {
				if (ct.isMarked(7) && ct.isMarked(4) && ct.isMarked(1)) {// ������
					ct.mark();
				} else if (ct.isMarked(7) && ct.isMarked(4) && !ct.isMarked(1)) {// ������
					ct.mark();
				} else if (ct.isMarked(7) && !ct.isMarked(4) && ct.isMarked(1)) {// ������
					ct.mark();
				} else if (ct.isMarked(7) && !ct.isMarked(4) && !ct.isMarked(1)) {// ������
					ct.mark();
				} else if (!ct.isMarked(7) && ct.isMarked(4) && ct.isMarked(1)) {// ������
					ct.mark();
				} else if (!ct.isMarked(7) && ct.isMarked(4) && !ct.isMarked(1)) {// ������
				} else if (!ct.isMarked(7) && !ct.isMarked(4) && ct.isMarked(1)) {// ������
					ct.mark();
				} else if (!ct.isMarked(7) && !ct.isMarked(4)
						&& !ct.isMarked(1)) {// ������
				}
				ct.fd(1);
			}
			ct.bk(len);
			ct.right(1);
		}
	}
}
