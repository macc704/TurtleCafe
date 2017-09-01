/*
 * ドラえもんを書くプログラム
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class Doraemon extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Doraemon());
	}

	//タートルを動かす処理
	public void start() {

		int i; //ループ用1
		int j; //ループ用2
		int k; //ループ用3

		int length = 10; //大きさ
		int margin = 24; //隣の目との間隔
		int angle = 0;

		//目を書く
		i = 1;
		while (i <= 2) {
			//目を書く
			j = 1;
			angle = 5;
			while (j <= 360) {
				rt(angle);
				fd(1);
				j = j + angle;
			}
			//移動
			up();
			rt(90);
			fd(margin);
			lt(90);
			down();

			i = i + 1;
		}

		//鼻を書く位置まで移動
		up();
		lt(90);
		fd(margin);
		fd(margin / 2);
		lt(90);
		fd(margin);
		lt(180);
		down();

		//鼻を書く
		color(java.awt.Color.red);
		j = 1;
		angle = 5;
		while (j <= 360) {
			rt(angle);
			fd(1);
			j = j + angle;
		}

		//輪郭を書く位置まで移動
		up();
		rt(90);
		fd(margin / 2);
		rt(90);
		fd(margin * 2 + 15);
		rt(90);
		down();

		//輪郭を書く
		color(java.awt.Color.blue);
		j = 1;
		angle = 1;
		while (j <= 360) {
			rt(angle);
			fd(1);
			j = j + angle;
		}

		//輪郭２つめ
		color(java.awt.Color.blue);
		j = 1;
		length = 4;
		fd(length / 2);
		angle = 5;
		while (j <= 360) {
			if (j <= 150 || j >= 210) {
				down();
			} else {
				up();
			}
			rt(angle);
			fd(length);
			j = j + angle;
		}

		//口を書く位置まで移動
		up();
		bk(length / 2);
		rt(90);
		fd(20);
		lt(90);
		down();

		//口を書く
		color(java.awt.Color.black);
		j = 1;
		length = 4;
		fd(length / 2);
		angle = 5;
		while (j <= 360) {
			if (j <= 60 || j >= 300) {
				down();
			} else {
				up();
			}
			rt(angle);
			fd(length);
			j = j + angle;
		}

		//ひげを書く
		length = 35;
		lt(15);

		i = 1;
		while (i <= 3) {
			rt(15);
			up();
			fd(30);
			down();
			fd(length);
			up();
			rt(180);
			fd(length);
			fd(30);
			rt(180);
			i = i + 1;
		}
		lt(30);

		rt(180);

		//右のひげを書く
		rt(15);
		i = 1;
		while (i <= 3) {
			lt(15);
			up();
			fd(30);
			down();
			fd(length);
			up();
			rt(180);
			fd(length);
			fd(30);
			rt(180);
			i = i + 1;
		}
		rt(30);

		//口の続き
		down();
		lt(90);
		fd(margin * 2 + 15 - 20 - margin / 2);

		//移動
		up();
		fd(margin + margin / 2);
		down();

		//最後
		//左目玉を書く
		i = 5;
		while (i <= 15) {
			angle = i;
			j = 1;
			while (j <= 360) {
				lt(angle);
				fd(1);
				j = j + angle;
			}
			lt(360 - j);

			i = i + 1;
		}

		lt(1);

		//右目玉を書く
		i = 5;
		while (i <= 15) {
			angle = i;
			j = 1;
			while (j <= 360) {
				rt(angle);
				fd(1);
				j = j + angle;
			}
			rt(360 - j);
			i = i + 1;
		}

		up();
		fd(100);
		//勝利のおたけび
		i = 0;
		while (i < 100) {
			rt(5);
			i = i + 1;
		}
	}

}