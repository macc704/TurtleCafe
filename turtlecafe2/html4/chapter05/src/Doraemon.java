/*
 * ドラえもんを書くプログラム
 * 2003/06/08 Yoshiaki Matsuzawa
 */
public class Doraemon extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Doraemon());
	}

	// タートルを動かす処理
	public void start() {

		int i;// ループ用1
		int j;// ループ用2

		int length = 10;
		int margin = 24;
		int angle = 0;

		// 目を書く
		i = 1;
		while (i <= 2) {

			// 目を書く
			length = 1;
			angle = 5;
			j = 1;
			while (j <= 360) {
				fd(length);
				rt(angle);
				j = j + angle;
			}

			// 移動
			up();
			rt(90);
			fd(margin);
			lt(90);
			down();

			i++;
		}

		// 鼻を書く位置まで移動
		up();
		lt(90);
		fd(margin);
		fd(margin / 2);
		lt(90);
		fd(margin);
		lt(180);
		down();

		// 鼻を書く
		color(java.awt.Color.red);
		length = 1;
		angle = 5;
		i = 1;
		while (i <= 360) {
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// 輪郭を書く位置まで移動
		up();
		rt(90);
		fd(margin / 2);
		rt(90);
		fd(margin * 2 + 15);
		rt(90);
		down();

		// 輪郭を書く
		color(java.awt.Color.blue);
		length = 1;
		angle = 1;
		i = 1;
		while (i <= 360) {
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// 中の輪郭
		color(java.awt.Color.blue);
		length = 4;
		angle = 5;
		i = 0;
		while (i < 360) {
			if (i <= 150 || i > 210) {
				down();
			} else {
				up();
			}
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// 口を書く位置まで移動
		up();
		bk(length / 2);
		rt(90);
		fd(20);
		lt(90);
		down();

		// 口を書く
		color(java.awt.Color.black);
		length = 4;
		angle = 5;
		fd(length / 2);
		i = 1;
		while (i <= 360) {
			if (i <= 60 || i >= 300) {
				down();
			} else {
				up();
			}
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// 左側のひげを書く
		length = 35;
		lt(15);
		up();
		i = 1;
		while (i <= 3) {
			// 移動
			rt(15);
			fd(30);

			// ひげ
			down();
			fd(length);
			up();

			// 戻る
			rt(180);
			fd(length);
			fd(30);
			rt(180);
			i++;
		}
		lt(45);
		rt(15);

		// 右のひげを書くために回転
		rt(180);

		// 右側のひげを書く
		length = 35;
		rt(15);
		up();
		i = 1;
		while (i <= 3) {
			// 移動
			lt(15);
			fd(30);

			// ひげを書く
			down();
			fd(length);
			up();

			// 戻る
			rt(180);
			fd(length);
			fd(30);
			rt(180);

			i++;
		}
		rt(45);
		lt(15);

		// 口の続き
		down();
		lt(90);
		fd(margin * 2 + 15 - 20 - margin / 2);

		// 目玉を書く位置に移動
		up();
		fd(margin + margin / 2);
		down();

		// 左目玉を書く
		i = 5;
		while (i <= 15) {

			// 円を書く
			length = 1;
			angle = i;
			j = 1;
			while (j <= 360) {
				fd(length);
				lt(angle);
				j = j + angle;
			}
			lt(360 - j);// 半端の調整

			i++;
		}

		// 調整
		lt(1);

		// 右目玉を書く
		i = 5;
		while (i <= 15) {
			// 円を書く
			length = 1;
			angle = i;
			j = 1;
			while (j <= 360) {
				fd(length);
				rt(angle);
				j = j + angle;
			}
			rt(360 - j);// 半端の調整

			i++;
		}

		// 移動して回って終了
		up();
		fd(100);
		rt(2000);

	}

}