/*
 * Cell2DSample.java
 * 2�����Z���I�[�g�}�g���̃T���v���v���O����
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Cell2DSample extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Cell2DSample());
	}

	public void start() {
		window.setKameSpeed("very fast");
		window.setSize(800, 600);
		hide();

		int cellCount = 11;// �c���̃}�X�̐�

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
			sleep(0.1);
			ct.beginNextTurn();

			// �P�X�e�b�v�̏����i���ׂẴ}�X������������j
			for (int j = 0; j < cellCount; j++) {
				for (int i = 0; i < cellCount; i++) {
					if (ct.isMarked()) {
						ct.flip(2);// �����𔽓]����
						ct.flip(4);
						ct.flip(6);
						ct.flip(8);
					}
					ct.fd(1);
				}
				ct.bk(cellCount);
				ct.right();
			}
			ct.left(cellCount);
		}
	}
}
