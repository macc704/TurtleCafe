/*
 * シューティングゲーム
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class ShootingGame extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingGame());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す

		// 画面の調整
		window.size(640, 480);
		window.warp(100, 100);

		// キャラクターの生成
		Star enemy = new Star(); // enemyという名前の星を生成
		Doraemon player = new Doraemon(); // playerという名前のドラえもんを生成
		Circle bullet = new Circle(); // bullet(弾)という名前の円を作成

		// 得点板の生成
		TextTurtle scoreBoard = new TextTurtle(""); // scoreBoardという名前のTextTurtleを生成

		{// 初期化
			// 弾を適切な大きさに調整
			bullet.size(20, 20);

			// キャラクターの位置を調整
			enemy.warp(200, 100);
			player.warp(320, 350);
			bullet.warp(-100, -100);// 弾は最初見えない位置に置いておく

			// 得点板の位置を調整
			scoreBoard.warp(600, 50);
		}

		{// アニメーションループ
			// 得点を初期化
			int score = 0;

			while (true) {

				// --- 待つ ---
				sleep(0.025);

				{ // 一コマの処理をする

					{// 敵を動かす
						enemy.warp(enemy.getX() + 5, enemy.getY());
						enemy.rt(10);

						{ // 敵が右端だった場合の処理
							if (enemy.getX() > 640) {
								enemy.warp(0, enemy.getY());// 左端にワープ
							}
						}
					}

					{ // ドラえもんを左右に動かす
						if (key() == 37) { // 左
							player.warp(player.getX() - 5, player.getY());
						} else if (key() == 39) { // 右
							player.warp(player.getX() + 5, player.getY());
						}
					}

					{// 上が押されたら，弾を出す(弾をドラえもんと同じ位置にする)
						if (key() == 38) {
							//
							bullet.warp(player.getX(), player.getY());
						}
					}

					{ // 弾の処理
						// 上に動かす(見えなくても，上に動かしつづける)
						bullet.warp(bullet.getX(), bullet.getY() - 5);

						{ // 弾が敵に当たっていた場合の処理
							if (bullet.intersects(enemy)) {
								score++;// 得点を増やす
							}
						}
					}
					// 得点板の数字を更新
					scoreBoard.text(score);

				}

				// --- 再描画 ---
				update();
			}
		}

	}

}