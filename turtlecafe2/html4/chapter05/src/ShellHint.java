/*
 * 貝殻を書くプログラムのヒント
 * 2011/10/25 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class ShellHint extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ShellHint());
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
						fd(50);
						rt(90);
						j++;
					}
				}

				i++;
			}
		}
	}
}