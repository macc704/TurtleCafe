/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * ‘Š«è‚¢ƒvƒƒOƒ‰ƒ€
 * String”Å
 */
public class AiShow02 {

	public static void main(String[] args) {
		AiShow02 main = new AiShow02();
		main.run();
	}

	void run() {
		String aishow = judge("–Ø‘º‘ñÆ", "H“¡Ã");
		System.out.println("‘Š«‚Í" + aishow + "‚Å‚·");
	}

	String judge(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		String text = "";
		if (x > 80) {
			text = "‚Î‚Á‚¿‚è";
		} else {
			text = "‚»‚±‚»‚±";
		}
		return text;
	}
}
