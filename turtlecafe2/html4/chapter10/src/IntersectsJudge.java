/*
 * あたり判定をするプログラム
 * (車がドラえもんにあたると，ドラえもんが小さくなる)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class IntersectsJudge extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new IntersectsJudge());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す
		ImageTurtle car = new ImageTurtle("car.gif");// 車を生成
		Doraemon dora = new Doraemon();// doraという名前のドラえもんを生成
		car.warp(200, 200);// 車を移動

		{// アニメーションループ
			while (true) {

				// --- 待つ ---
				sleep(0.1);

				{ // 一コマの処理をする
					{// マウスが押されていた時の処理
						if (mouseDown()) {
							car.warp(mouseX(), mouseY());// 車をマウスの位置に移動
						}
					}
					{ // どらえもんが車に当たっていた時の処理
						if (dora.intersects(car)) {
							dora.small(5);// ドラえもんを小さくする
						}
					}
				}

				// --- 再描画 ---
				update();
			}
		}

	}

}