/*
 * マウスのあたり判定をするプログラム
 * (マウスが車にあたると，車が小さくなる)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class ContainsJudge extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ContainsJudge());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す
		ImageTurtle car = new ImageTurtle("car.gif");// 車を生成

		{// アニメーションループ
			while (true) {
				// --- 待つ ---
				sleep(0.1);

				{// 一コマの処理をする
					// 車がマウスの位置に含まれている場合の処理
					if (car.contains(mouseX(), mouseY())) {
						car.small(5);// 車を小さくする
					}
				}

				// --- 再描画 ---
				update();
			}
		}

	}

}