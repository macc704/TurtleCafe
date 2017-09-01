
/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * 相性占いプログラム
 * 多段呼び出し　＋　if文の中に命令
 */
public class AiShow03d {

	public static void main(String[] args) {
		AiShow03d main = new AiShow03d();
		main.run();
	}

	void run() {
		if (judge("木村拓哉", "工藤静香")) {
			System.out.println("相性ばっちり！");
		} else {
			System.out.println("努力次第．．．");
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
