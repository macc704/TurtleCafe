/*
 * キーに対応して車が動くプログラム2 
 * (押してるかどうか調べて，同時押しに対応できるバージョン)
 * 
 * 2011/11/22 Yoshiaki Matsuzawa 
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class HandleKeyDown extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKeyDown());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す
		ImageTurtle car = new ImageTurtle("car.gif"); // 車を生成

		{// アニメーションループ
			while (true) {
				// --- 待つ ---
				sleep(0.025);

				{ // 一コマの処理をする
					{// 左キーの処理
						if (keyDown(37)) { // 左
							int x = car.getX();
							int y = car.getY();
							car.warp(x - 5, y);
						}
					}
					{// 上キーの処理
						if (keyDown(38)) { // 上
							int x = car.getX();
							int y = car.getY();
							car.warp(x, y - 5);
						}
					}
				}
				// --- 再描画 ---
				update();
			}
		}
	}

}