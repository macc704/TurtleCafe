/*
 * 貝殻を書くプログラム
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class Shell extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Shell());
	}

	// タートルを動かす処理
	public void start() {
		{// 貝殻を書く
			int i = 1;
			while (i <= 10) {
				rt(20);

				{// 四角を書く
					int j = 1;
					while (j <= 4) {
						fd(i * 10);
						rt(90);
						j++;
					}
				}

				i++;
			}
		}

	}
}