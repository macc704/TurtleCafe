/*
 * Cell2DSample.java
 * 2�����Z���I�[�g�}�g���̃T���v���v���O����
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Cell2DSample2 extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Cell2DSample2());
	}

	public void start() {
		window.setKameSpeed("no kame");
		window.setSize(800, 600);
		hide();

		int cellCount = 31;// �c���̃}�X�̐�

		CellTurtle ct = new CellTurtle(10);

		// ������
		ct.right(cellCount / 2);
		ct.fd(cellCount / 2);
		ct.mark();
		ct.bk(cellCount / 2);
		ct.left(cellCount / 2);

		// �J��Ԃ��čX�V����
		while (true) {
			// �P�X�e�b�v�̑O����
			sleep(1);
			ct.beginNextTurn();

			// �P�X�e�b�v�̏����i���ׂẴ}�X������������j
			for (int j = 0; j < cellCount; j++) {
				for (int i = 0; i < cellCount; i++) {
					int count = countBlack4Neibors(ct);
					if (count == 1 || count == 4) {
						ct.mark();
					}
					// if (count >= 1) {
					// ct.mark();
					// }
					ct.fd(1);
				}
				ct.bk(cellCount);
				ct.right();
			}
			ct.left(cellCount);
		}
	}

	private int countBlack4Neibors(CellTurtle ct) {
		int count = 0;
		if (ct.isMarked(2)) {
			count++;
		}
		if (ct.isMarked(4)) {
			count++;
		}
		if (ct.isMarked(6)) {
			count++;
		}
		if (ct.isMarked(8)) {
			count++;
		}
		return count;
	}

	@SuppressWarnings("unused")
	private int countBlackNeibors(CellTurtle ct) {
		int count = 0;
		for (int i = 1; i <= 9; i++) {
			if (i == 5) {
				continue;
			}
			if (ct.isMarked(i)) {
				count++;
			}
		}
		return count;
	}
}
