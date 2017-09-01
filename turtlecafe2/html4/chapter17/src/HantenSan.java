/*
 * ���]����@���]�������
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class HantenSan extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HantenSan());
	}

	// �^�[�g���𓮂�������
	public void start() {
		print(makeHantenbun("����ɂ���"));
		print(makeHantenbun("����������"));
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
