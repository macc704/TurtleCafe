/*
 * DrawY.java
 * Y��`���v���O����
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawY extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawY());
	}

	// �^�[�g���𓮂�������
	public void start() {
		window.size(500, 500);
		warp(250, 400); // �؂�`���ʒu�܂ňړ�����

		drawY(50);
	}

	// Y��`��
	void drawY(int length) {
		fd(length);// ����`��

		// ���̎}��`��
		lt(30);
		fd(length / 2);
		bk(length / 2);
		rt(30);

		// �E�̎}��`��
		rt(30);
		fd(length / 2);
		bk(length / 2);
		lt(30);

		bk(length);// ���̍����ɖ߂�
	}

}