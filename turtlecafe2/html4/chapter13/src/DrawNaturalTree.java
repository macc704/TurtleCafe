/*
 * DrawNaturalTree.java
 * ���R�Ȗ؂�`���v���O����
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawNaturalTree extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawNaturalTree());
	}

	// �^�[�g���𓮂�������
	public void start() {
		window.size(500, 500);
		warp(250, 400); // �؂�`���ʒu�܂ňړ�����

		drawY(50);
	}

	// Y��`��
	void drawY(int length) {

		if (length < 2) {// �ċA�̏I�_
			return;
		}

		fd(length);// ����`��

		for (int i = 0; i < 3; i++) {
			int angle = random(90) - 45;
			double len = length * ((random(3) + 6d) / 10d);
			lt(angle);
			fd(len);
			drawY((int) len);
			bk(len);
			rt(angle);
		}

		bk(length);// ���̍����ɖ߂�
	}

}