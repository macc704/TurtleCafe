/*
 * じゃんけんの絵を登場させるプログラム
 * 
 * 2003/05/08 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class JankenCharacters extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new JankenCharacters());
	}

	// タートルを動かす処理
	public void start() {
		Goo g = new Goo();
		Choki c = new Choki();
		Paa p = new Paa();

		g.warp(100, 100);
		c.warp(200, 100);
		p.warp(300, 100);
	}

}