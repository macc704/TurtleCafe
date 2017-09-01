/**
 * シューティングゲーム（音付き）
 * 
 * Yoshiaki Matsuzawa (2011/09/28)
 */
public class ShootingGameWithSound extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingGameWithSound());
	}

	// タートルを動かす処理
	public void start() {
		System.out.println("ShootingGameWithSound: Version 8");

		hide();// タートルを消す

		// 画面の調整
		window.size(640, 480);
		window.warp(100, 100);

		int score; // 得点を入れる変数

		// キャラクターの生成
		Star enemy = new Star(); // enemyという名前の星を生成
		Doraemon player = new Doraemon(); // playerという名前のドラえもんを生成
		Circle bullet = new Circle(); // bullet(弾)という名前の円を作成

		// 得点板の生成
		TextTurtle scoreBoard = new TextTurtle(); // scoreBoardという名前のTextTurtleを生成

		// 音楽の生成
		SoundTurtle hit = new SoundTurtle("hit.mp3");
		hit.loadOnMemory();
		SoundTurtle fire = new SoundTurtle("fire.mp3");
		fire.loadOnMemory();

		SoundTurtle bgm = new SoundTurtle("bgm.mp3");
		// BSound bgm = new BSound("bgm.mp3");
		bgm.play();

		// 弾を適切な大きさに調整
		bullet.size(20, 20);

		// キャラクターの位置を調整
		enemy.warp(200, 100);
		player.warp(320, 350);
		bullet.warp(-100, -100);// 弾は最初見えない位置に置いておく

		// 得点板の位置を調整
		scoreBoard.warp(600, 50);

		// 得点を初期化
		score = 0;

		while (true) {

			// --- 待つ ---
			sleep(0.025);

			// --- 処理 ---

			// 敵を動かす(流れ星と一緒)
			enemy.warp(enemy.x() + 5, enemy.y());
			enemy.rt(10);

			// もし，敵が右端だったら
			if (enemy.x() > 640) {
				enemy.warp(0, enemy.y());// 左端にワープ
			}

			// ドラえもんを左右に動かす
			if (key() == 37) { // 左
				player.warp(player.x() - 5, player.y());
			} else if (key() == 39) { // 右
				player.warp(player.x() + 5, player.y());
			}

			// 上が押されたら，
			if (key() == 38) {
				// 弾を出す(弾をドラえもんと同じ位置にする)
				bullet.warp(player.x(), player.y());
				fire.play();
			}

			// 弾を上に動かす
			// (見えなくても，上に動かしつづける)
			bullet.warp(bullet.x(), bullet.y() - 5);

			// もし，弾が敵に当たっていたら
			if (bullet.intersects(enemy)) {
				score++;// 得点を増やす

				// 衝突音を鳴らす
				hit.play();
			}

			// 得点板の数字を更新
			scoreBoard.text(score);

			// --- 再描画 ---
			update();
		}

	}

}