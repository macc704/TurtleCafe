/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * �����肢�v���O����
 */
public class AiShow01 {

	public static void main(String[] args) {
		AiShow01 main = new AiShow01();
		main.run();
	}

	void run() {
		int aishow = judge("�ؑ����", "�H���Í�");
		System.out.println("������" + aishow + "�ł�");
	}

	int judge(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		return x;
	}
}
