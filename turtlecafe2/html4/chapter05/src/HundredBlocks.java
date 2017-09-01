/*
 * 四角を並べていくプログラム
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class HundredBlocks extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HundredBlocks());
	}

	// タートルを動かす処理
	public void start() {

		int length = 10;// 四角の大きさ
		int margin = 5;// 隣の四角との間隔

		{// 縦に10回繰り返すためのループ
			int i = 1;
			while (i <= 10) {

				{// 横に10回繰り返すためのループ
					int j = 1;
					while (j <= 10) {

						{// 四角形を書くためのループ
							int k = 1;
							while (k <= 4) {
								fd(length);
								rt(90);

								k++;
							}
						}

						{// 四角形を書いたら隣に移動
							up();
							rt(90);
							fd(length);
							fd(margin);
							lt(90);
							down();
						}

						j++;
					}
				}

				{// 横一列が終ったら左下に移動
					up();
					lt(90);
					fd((length + margin) * 10);
					lt(90);
					fd(length + margin);
					rt(180);
					down();
				}

				i++;
			}
		}

	}

}