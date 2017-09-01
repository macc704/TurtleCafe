/*
 * 家を書くプログラム
 * 2003/05/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class House extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new House());
	}

	// タートルを動かす処理
	public void start() {

		{// 屋根を書く
			rt(30);
			fd(50);
			rt(120);
			fd(50);
			rt(120);
			fd(50);
			rt(120);
			lt(30);
		}

		{// 本体を書く
			rt(90);
			fd(50);
			rt(90);
			fd(50);
			rt(90);
			fd(50);
			rt(90);
			fd(50);
		}
	}

}