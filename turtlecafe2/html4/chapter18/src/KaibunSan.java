/*
 * �񕶂���
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class KaibunSan extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new KaibunSan(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {
		// ������ǂݍ���
		String nountxt = loadFromFile("NounYomi.txt");
		String[] nouns = nountxt.split("\n");
		int nounSize = nouns.length;

		// ������ǂݍ���
		String verbtxt = loadFromFile("VerbYomi.txt");
		String[] verbs = verbtxt.split("\n");
		int verbSize = verbs.length;

		for (int i = 0; i < 1000000; i++) {
			// �앶���C�񕶂��ł�����\������
			String noun1 = nouns[random(nounSize)];
			String verb = verbs[random(verbSize)];
			String bun1 = noun1 + verb;
			if (check(bun1)) {
				print(noun1 + "-" + verb);
			}
		}

		print("finished");
	}

	boolean check(String bun) {
		String hantenbun = makeHantenbun(bun);
		boolean result = bun.equals(hantenbun);
		return result;
	}

	String makeHantenbun(String bun) {
		int len = bun.length();
		String hantenbun = "";
		for (int i = len - 1; i >= 0; i--) {
			char c = bun.charAt(i);
			hantenbun = hantenbun + c;
		}
		return hantenbun;
	}

}
