/*
 * �񕶔��肳��
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class HanteiSan extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HanteiSan());
	}

	// �^�[�g���𓮂�������
	public void start() {
		print(check("����ɂ���"));
		print(check("����������"));
		print(check("�Ƃ܂�"));
		print(check("������Ԃ₯��"));
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
