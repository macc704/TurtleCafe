import java.util.LinkedList;

/*
 * FourTurtles3.java
 * �S�C�̋T�𓮂����v���O�����R�iLinkedList�ŊǗ�����j
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FourTurtles3 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles3(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {
		// �E�C���h�E�̏���
		hide();
		window.setSize(1100, 500);

		// ���X�g�i���ꕨ�j�����@- Java���C�u������LinkedList
		LinkedList<Turtle> turtles = new LinkedList<Turtle>();

		// 4�C�̃J���𐶐�
		for (int i = 0; i < 4; i++) {
			turtles.add(new Turtle());
		}

		// �����ʒu�ֈړ�
		turtles.get(0).warp(100, 100);
		turtles.get(1).warp(100, 200);
		turtles.get(2).warp(200, 100);
		turtles.get(3).warp(200, 200);

		// �J���𓮂���
		for (int i = 0; i < 360; i++) {
			for (int j = 0; j < 4; j++) {
				turtles.get(j).fd(1);
				turtles.get(j).rt(1);
			}
		}
	}
}
