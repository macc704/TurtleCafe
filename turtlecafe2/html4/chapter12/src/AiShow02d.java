/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * �����肢�v���O����
 * String�ŁC�r����return�������ĒE�o
 */
public class AiShow02d {

	public static void main(String[] args) {
		AiShow02d main = new AiShow02d();
		main.run();
	}

	void run() {
		String aishow = judge("�ؑ����", "�H���Í�");
		System.out.println("������" + aishow + "�ł�");
	}

	String judge(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		if (x > 80) {
			return "�΂�����";
		} else {
			return "��������";
		}
	}
}
