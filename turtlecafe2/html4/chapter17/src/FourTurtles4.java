/*
 * FourTurtles4.java
 * �S�C�̋T�𓮂����v���O�����S�i�z��ŊǗ�����j
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FourTurtles4 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles4(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {
		// �E�C���h�E�̏���
		hide();
		window.setSize(1100, 500);

		// ���X�g�i���ꕨ�j�����@- Java�̔z��@�\���g���č��
		Turtle[] turtles = new Turtle[4];

		// 4�C�̃J���𐶐�
		for (int i = 0; i < 4; i++) {
			turtles[i] = new Turtle();
		}

		// �����ʒu�ֈړ�
		turtles[0].warp(100, 100);
		turtles[1].warp(100, 200);
		turtles[2].warp(200, 100);
		turtles[3].warp(200, 200);

		// �J���𓮂���
		for (int i = 0; i < 360; i++) {
			for (int j = 0; j < 4; j++) {
				turtles[j].fd(1);
				turtles[j].rt(1);
			}
		}
	}
}
