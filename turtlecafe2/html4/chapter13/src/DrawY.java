/*
 * DrawY.java
 * Y‚ğ•`‚­ƒvƒƒOƒ‰ƒ€
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawY extends Turtle {

	// ‹N“®ˆ—
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawY());
	}

	// ƒ^[ƒgƒ‹‚ğ“®‚©‚·ˆ—
	public void start() {
		window.size(500, 500);
		warp(250, 400); // –Ø‚ğ•`‚­ˆÊ’u‚Ü‚ÅˆÚ“®‚·‚é

		drawY(50);
	}

	// Y‚ğ•`‚­
	void drawY(int length) {
		fd(length);// Š²‚ğ•`‚­

		// ¶‚Ì}‚ğ•`‚­
		lt(30);
		fd(length / 2);
		bk(length / 2);
		rt(30);

		// ‰E‚Ì}‚ğ•`‚­
		rt(30);
		fd(length / 2);
		bk(length / 2);
		lt(30);

		bk(length);// Š²‚ÌªŒ³‚É–ß‚é
	}

}