/*
 * �v���O�������FGalaxy 
 * �쐬�ҁF ��Ԋ��W
 * �쐬���F Sun Dec 18 18:45:10 JST 2011
 */
public class Galaxy extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Galaxy());
	}

	// �^�[�g���𓮂�������
	public void start() {
		window.setKameSpeed("no kame"); // ������Ԃ��m�[�J����
		window.setSize(170, 220); // window�T�C�Y�̕ύX
		hide(); // �J�����B��

		int cellCount = 15;
		CellTurtle taro = new CellTurtle(10);
		int count = 0;

		drawstart(taro);

		Liferule(taro, cellCount, count);
	}

	void Liferule(CellTurtle taro, int cellCount, int count) { // �����K��

		while (true) {
			sleep(0.4);
			taro.beginNextTurn();
			for (int j = 0; j < cellCount; j++) {
				for (int i = 0; i < cellCount; i++) {
					count = cellcounter(taro);
					if (!taro.isMarked() && count == 3) {
						taro.flip(5);
					}
					if (taro.isMarked() && count <= 1) {
						taro.flip(5);
					}
					if (taro.isMarked() && count >= 4) {
						taro.flip(5);
					}
					taro.fd(1);
				}// for
				taro.bk(cellCount);
				taro.right();
			}// for
			taro.left(cellCount);
		}// while

	}

	void drawstart(CellTurtle taro) {
		// �����}�`��`��

		taro.right(3); // 1�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 2�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 3�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(4);

		taro.right(1); // 4�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 5�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 6�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 7�s��
		taro.fd(10);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 8�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 9�s��
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.left(11);

	}

	int cellcounter(CellTurtle taro) {// ���͂̍��Z���̐��𐔂���

		int count = 0;

		if (taro.isMarked(1)) {
			count++;
		}
		if (taro.isMarked(2)) {
			count++;
		}
		if (taro.isMarked(3)) {
			count++;
		}
		if (taro.isMarked(4)) {
			count++;
		}
		if (taro.isMarked(6)) {
			count++;
		}
		if (taro.isMarked(7)) {
			count++;
		}
		if (taro.isMarked(8)) {
			count++;
		}
		if (taro.isMarked(9)) {
			count++;
		}
		return count;
	}

}