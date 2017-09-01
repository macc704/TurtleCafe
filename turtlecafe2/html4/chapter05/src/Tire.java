/*
 * タイヤを書くプログラム
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class Tire extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Tire());
	}

	// タートルを動かす処理
	public void start() {

		int length = 1;
		int angle = 1;

		lt(90);

		{// タイヤを書く
			{// タイヤのデコボコを描く
				int i = 1;
				while (i < 360) {

					{// 1つの凸を書く
						int j = 1;
						while (j <= 3) {
							fd(10);
							rt(90);
							j++;
						}
					}

					{// 次の凸を書く向きに移動
						rt(180);
						lt(82);
					}

					i = i + 8;
				}
			}

			{// タイヤの中の円を書く位置に移動
				up();
				lt(4);
				lt(180);
				fd(15);
				lt(90);
				down();
			}

			{// タイヤの中の円を書く
				int i = 1;
				while (i <= 360) {
					rt(angle);
					fd(length);
					i = i + angle;
				}
			}
		}

	}

}