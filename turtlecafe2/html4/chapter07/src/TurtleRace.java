import java.util.ArrayList;

/*
 * TurtleRace.java
 * Created on 2011/11/15
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/**
 * @author macchan
 */
public class TurtleRace extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new TurtleRace());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();
		int numOfTurtles = 3;

		ArrayList<Turtle> turtles = new ArrayList<Turtle>();

		// �^�[�g���B���쐬����
		for (int i = 0; i < numOfTurtles; i++) {
			Turtle turtle = new Turtle();
			turtles.add(turtle);
		}

		// �^�[�g���B�������ǂ����ׂ�
		int size = turtles.size();
		for (int i = 0; i < size; i++) {
			Turtle turtle = turtles.get(i);
			turtle.bk(30 * i);
		}

		// �^�[�g���B���E������
		for (int i = 0; i < size; i++) {
			turtles.get(i).rt(90);
		}

		// �^�[�g���������X�^�[�g�ʒu��
		for (Turtle turtle : turtles) {
			turtle.fd(20);
		}

		// �u�p�ӁI�X�^�[�g�I�v�����o����
		sleep(1);// 1�b�҂�

		// ���[�X������
		for (int i = 0; i < 100; i++) {
			for (Turtle turtle : turtles) {
				turtle.fd(random(5));
			}
		}
	}
}
