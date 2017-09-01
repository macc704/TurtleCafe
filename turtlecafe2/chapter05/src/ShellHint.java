/*
 * 貝殻を書くプログラムのヒント
 * 2011/10/25
 * Yoshiaki Matsuzawa
 */
public class ShellHint extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ShellHint());
	}

	// タートルを動かす処理
	public void start() {
		int i;// ループ用
		int j;// ループ用

		// 貝殻を書く
		i = 1;
		while (i <= 10) {
			rt(20);

			// 四角を書く
			j = 1;
			while (j <= 4) {
				fd(50);
				rt(90);
				j++;
			}

			i++;
		}
	}
}