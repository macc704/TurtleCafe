/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * ‘Š«è‚¢ƒvƒƒOƒ‰ƒ€
 */
public class AiShow01Applet extends Turtle {

	public static void main(String[] args) {
		AiShow01Applet.startTurtle(new AiShow01Applet());
	}

	public void start() {
		System.setOut(window.console.out);
		System.out.println(window.console.out);
		new AiShow01().run();
	}

}
