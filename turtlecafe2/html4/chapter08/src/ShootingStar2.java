/**
 * 流れ星を書くプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/17
 */
public class ShootingStar2 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingStar2());
	}

	//タートルを動かす処理
	public void start() {

		int x; //x座標を入れる変数
		int y; //y座標を入れる変数

		Star star = new Star(); //星を生成
		Star star2 = new Star(); //星を生成
		star.scale(0.5);
		star2.fd(100);

		//アニメーションループ
		while (true) {

			// --- 待つ ---
			sleep(0.1); //0.1秒

			// --- 処理を行う ---
			x = star.getX(); //星のx座標を取得する
			y = star.getY(); //星のy座標を取得する

			//回転
			star.rt(30);

			//右下に移動
			star.warp(x + 10, y + 7);

			//右端だったら左端にワープ
			if (x > 300) {
				star.warp(0, y);
			}
			//下端だったら上端にワープ
			if (y > 300) {
				star.warp(x, 0);
			}

			x = star2.getX(); //星のx座標を取得する
			y = star2.getY(); //星のy座標を取得する

			//回転
			star2.rt(30);

			//右下に移動
			star2.warp(x + 10, y + 7);

			//右端だったら左端にワープ
			if (x > 300) {
				star2.warp(0, y);
			}
			//下端だったら上端にワープ
			if (y > 300) {
				star2.warp(x, 0);
			}

			// --- 再描画する ---
			update();
		}

	}

}