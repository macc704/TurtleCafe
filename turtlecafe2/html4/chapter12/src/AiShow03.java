/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * �����肢�v���O����
 * boolean�ŁC�r����return�������ĒE�o
 */
public class AiShow03 {

	public static void main(String[] args) {
		AiShow03 main = new AiShow03();
		main.run();
	}

	void run() {
		boolean aishow = judge("�ؑ����", "�H���Í�");
		if (aishow == true) {
			System.out.println("�����΂�����I");
		} else {
			System.out.println("�w�͎���D�D�D");
		}
	}

	boolean judge(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		if (x > 80) {
			return true;
		} else {
			return false;
		}
	}

}
