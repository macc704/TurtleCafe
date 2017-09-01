/*
 * 「こんにちは」が回るプログラム
 * 
 * 2003/06/23　Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class RotateText extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateText());
	}

	// タートルを動かす処理
	public void start() {
		TextTurtle hello = new TextTurtle("こんにちは");
		while (true) {
			sleep(0.1);
			hello.rt(5);
			update();
		}
	}

}