
/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * �����肢�v���O����
 * ���i�Ăяo���@�{�@if���̒��ɖ���
 */
public class AiShow03d {

	public static void main(String[] args) {
		AiShow03d main = new AiShow03d();
		main.run();
	}

	void run() {
		if (judge("�ؑ����", "�H���Í�")) {
			System.out.println("�����΂�����I");
		} else {
			System.out.println("�w�͎���D�D�D");
		}
	}

	boolean judge(String name1, String name2) {
		if (countAishow(name1, name2) > 80) {
			return true;
		} else {
			return false;
		}
	}

	int countAishow(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		return x;
	}
}
