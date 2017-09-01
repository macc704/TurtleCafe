/**
 * プログラム名：挿入法（二重ループ） 
 * 作成者： MegumiAraki 
 * 作成日： Wed Dec 05 21:36:23 JST 2007
 */
public class InsertionSortWithButton extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new InsertionSortWithButton());
	}

	// カードの束
	HolderTurtle 未処理束;
	HolderTurtle ソート済束;

	// ボタン
	ButtonTurtle startButton;
	ButtonTurtle resetButton;
	ButtonTurtle stopButton;

	// プログラムの状態
	boolean チクタク = false;

	// タートルを動かす処理
	public void start() {
		初期化する();

		// アニメーションループ
		int counter = 0;
		while (true) {
			ボタン入力の処理をする();

			counter = (counter + 1) % 8;//8コマごとに実行する
			if (counter == 0) {
				挿入法();
			}
		}

	}

	// カードを並び替える（並び替えの様子をアニメーションで表示する）
	void 挿入法() {
		if (未処理束.入っているものの個数() <= 0) {
			チクタク = false;
			return;
		}
		if (未処理束.カーソル位置にあるものの数値() < ソート済束.カーソル位置にあるものの数値()) {
			ソート済束.カーソル位置に追加する(未処理束.カーソル位置にあるもの());
			ソート済束.カーソル位置を変える(1);
		} else {
			ソート済束.カーソルを進める();
		}
	}

	void リセットする() {
		未処理束.入っているものを全て捨てる();
		ソート済束.入っているものを全て捨てる();

		for (int i = 0; i < 12; i++) {
			未処理束.最後に追加する(new CardTurtle(random(100)));
		}
		ソート済束.最後に追加する(new CardTurtle(999));

		update();
	}

	void 初期化する() {
		hide();

		Turtle.window.size(550, 400);// ウインドウサイズを調節する

		// ボタンを作る
		startButton = new ButtonTurtle("スタート");
		startButton.warp(450, 20);

		resetButton = new ButtonTurtle("リセット");
		resetButton.warp(450, 50);

		stopButton = new ButtonTurtle("ストップ");
		stopButton.warp(450, 80);

		// カードの束を作る
		未処理束 = new HolderTurtle();
		未処理束.warp(50, 120);
		TextTurtle 未処理束タグ = new TextTurtle("未処理束");
		未処理束タグ.fontsize(12);
		未処理束タグ.warp(50, 100);

		ソート済束 = new HolderTurtle();
		ソート済束.warp(50, 260);
		TextTurtle ソート済束タグ = new TextTurtle("ソート済束");
		ソート済束タグ.warp(50, 240);
		ソート済束タグ.fontsize(12);

		リセットする();
	}

	void ボタン入力の処理をする() {
		do {
			// ボタンの入力を受け付ける
			if (stopButton.isClicked()) {
				チクタク = false;
			}
			if (resetButton.isClicked()) {
				リセットする();
			}
			if (startButton.isClicked()) {
				チクタク = true;
			}

			update();
			sleep(0.025);

		} while (!チクタク);
	}

}