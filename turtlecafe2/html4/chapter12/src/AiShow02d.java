/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * 相性占いプログラム
 * String版，途中でreturnを書いて脱出
 */
public class AiShow02d {

	public static void main(String[] args) {
		AiShow02d main = new AiShow02d();
		main.run();
	}

	void run() {
		String aishow = judge("木村拓哉", "工藤静香");
		System.out.println("相性は" + aishow + "です");
	}

	String judge(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		if (x > 80) {
			return "ばっちり";
		} else {
			return "そこそこ";
		}
	}
}
