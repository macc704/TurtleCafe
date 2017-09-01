/*
 * �앶����
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class SakubunSan extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SakubunSan(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {
		// ������ǂݍ���
		String nountxt = loadFromFile("Noun.txt");
		String[] nouns = nountxt.split("\n");
		int nounSize = nouns.length;

		// ������ǂݍ���
		String verbtxt = loadFromFile("Verb.txt");
		String[] verbs = verbtxt.split("\n");
		int verbSize = verbs.length;

		for (int i = 0; i < 10; i++) {
			// �앶����
			String noun1 = nouns[random(nounSize)];// ����1��I��
			String noun2 = nouns[random(nounSize)];// ����2��I��
			String verb = verbs[random(verbSize)];// ������I��
			print(noun1 + "��" + noun2 + "��" + verb);
		}
	}
}
