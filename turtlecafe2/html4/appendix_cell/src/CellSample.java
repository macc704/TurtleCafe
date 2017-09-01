/*
 * CellTest.java
 * Created on 2011/12/16
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/**
 * @author macchan
 */
public class CellSample extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new CellSample());
	}

	void start() {
		window.setSize(800, 600);
		hide();

		// �Z���^�[�g��, �Ԃ��^�[�g���@�����ʒu(10, 10) �E����
		CellTurtle taro = new CellTurtle(10);// �傫��10

		// ��̍s������
		taro.fd(10);
		taro.mark();
		taro.fd(10);
		taro.bk(20);
		taro.right();

		// �܍s�̏������s��
		for (int j = 0; j < 5; j++) {
			// ��s�̏������s��
			for (int i = 0; i < 20; i++) {
				if (taro.isMarked(1) && !taro.isMarked(4) && !taro.isMarked(7)) {
					taro.mark();
				}
				taro.fd(1);
			}
			taro.bk(20);
			taro.right();
		}
	}
}
