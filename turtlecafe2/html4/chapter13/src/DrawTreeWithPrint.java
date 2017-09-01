/*
 * DrawTreeWithPrint.java
 * �ċA���g���Ė؂�`���v���O����(�v�����g�t��)
 * Created on 2011/12/18 macchan
 * Revised on 2012/12/18 macchan
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawTreeWithPrint extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTreeWithPrint());
	}

	// �^�[�g���𓮂�������
	public void start() {
		window.size(500, 500);
		warp(250, 400); // �؂�`���ʒu�܂ňړ�����

		drawY(50, 0);
	}

	// Y��`��
	void drawY(int length, int indentCount) {
		printStart(length, indentCount);

		if (length < 5) {// �ċA�̏I�_
			printEnd(indentCount);
			return;
		}

		fd(length);// ����`��

		// ���̎}��`��
		lt(30);
		fd(length / 2);
		drawY(length / 2, indentCount + 1);
		bk(length / 2);
		rt(30);

		// �E�̎}��`��
		rt(30);
		fd(length / 2);
		drawY(length / 2, indentCount + 1);
		bk(length / 2);
		lt(30);

		bk(length);// ���̍����ɖ߂�

		printEnd(indentCount);
	}

	void printStart(int length, int indentCount) {
		makeIndent(indentCount);
		System.out.print("drawY(" + length + ", " + indentCount + ")");
		System.out.println("");
	}

	void printEnd(int indentCount) {
		makeIndent(indentCount);
		System.out.print("//");
		System.out.println("");
	}

	void makeIndent(int indentCount) {
		for (int i = 0; i < indentCount; i++) {
			System.out.print("\t");
		}
	}

}