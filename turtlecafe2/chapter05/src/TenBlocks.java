/*
 * 四角を並べていくプログラム
 * 2011/10/25
 * Yoshiaki Matsuzawa
 */
public class TenBlocks extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new TenBlocks());
	}

	// タートルを動かす処理
	public void start() {

		int length = 10;// 四角の大きさ
		int margin = 5;// 隣の四角との間隔

		// 横に10回繰り返すためのループ
		int i;
		i = 1;
		while (i <= 10) {

			// 四角形を書くためのループ
			int j;
			j = 1;
			while (j <= 4) {
				fd(length);
				rt(90);

				j++;
			}

			// 四角形を書いたら隣に移動
			up();
			rt(90);
			fd(length);
			fd(margin);
			lt(90);
			down();

			i++;
		}

	}

}