import java.util.Random;

/*
 * �t�@�C���ǂݏ����̃e�X�g
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class KadaiDataMaker extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new KadaiDataMaker());
	}

	String[] names = new String[] { "����", "���", "�c��", "���{", "����", "�n��", "�ɓ�",
			"�R�{" };

	// �^�[�g���𓮂�������
	public void start() {
		Random r = new Random();
		String text = "���O,���w,�p��\n";
		for (int i = 0; i < names.length; i++) {
			int score1 = (int) ((r.nextGaussian() + 1d) * 20d) + 20;
			if (score1 > 100) {
				score1 = 100;
			}
			int score2 = (int) ((r.nextGaussian() + 1d) * 15d) + 40;
			if (score2 > 100) {
				score2 = 100;
			}
			text += names[i] + "," + score1 + "," + score2;
			text += "\n";
		}
		saveToFile("score.txt", text);
		// print(loadFromFile("a.txt"));
	}
}
