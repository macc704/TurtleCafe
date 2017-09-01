/**
 * プログラム名：最小値選択法
 * 作成者：MegumiAraki 
 * バージョン： 1.0 (日付)2007/12/8
 */
public class SelectionSort1WithButton extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort1WithButton());
	}

	// カードの束
	HolderTurtle 未処理束;
	HolderTurtle 最小値候補;
	HolderTurtle ソート済束;
	HolderTurtle 検索済束;

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
			sleep(0.025);

			// ボタンの入力を受け付ける
			if (startButton.isClicked()) {
				チクタク = true;
			}
			if (resetButton.isClicked()) {
				リセットする();
			}
			if (stopButton.isClicked()) {
				チクタク = false;
			}

			// 最小値選択法の１ステップの処理をする
			counter = (counter + 1) % 8;//8コマごとに実行する
			if (チクタク && counter == 0) {
				最小値選択法();
			}

			update();
		}
	}

	void 初期化する() {
		hide();
		Turtle.window.size(550, 400);// ウインドウサイズを調節する

		// ボタンを作る
		startButton = new ButtonTurtle("スタート");
		resetButton = new ButtonTurtle("リセット");
		stopButton = new ButtonTurtle("ストップ");

		startButton.warp(450, 20);
		resetButton.warp(450, 50);
		stopButton.warp(450, 80);

		// カードの束を作る
		未処理束 = new HolderTurtle();
		未処理束.warp(50, 120);
		TextTurtle 未処理束タグ = new TextTurtle("未処理束");
		未処理束タグ.fontsize(12);
		未処理束タグ.warp(50, 100);

		最小値候補 = new HolderTurtle();
		最小値候補.warp(50, 50);
		TextTurtle 最小値候補タグ = new TextTurtle("最小値候補");
		最小値候補タグ.fontsize(12);
		最小値候補タグ.warp(50, 30);

		ソート済束 = new HolderTurtle();
		ソート済束.warp(50, 260);
		TextTurtle ソート済束タグ = new TextTurtle("ソート済束");
		ソート済束タグ.warp(50, 240);
		ソート済束タグ.fontsize(12);

		検索済束 = new HolderTurtle();
		検索済束.warp(50, 190);
		TextTurtle 検索済束タグ = new TextTurtle("検索済束");
		検索済束タグ.fontsize(12);
		検索済束タグ.warp(50, 170);

		// カードを8枚作り、未処理束に入れる
		for (int i = 0; i < 8; i++) {
			未処理束.最後に追加する(new CardTurtle(random(100)));
		}

		// 未処理束の先頭からカードを1枚取り出し、最小値候補に置く
		最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());

		update();
	}

	void リセットする() {
		最小値候補.入っている全てのものを以下の入れ物に移動する(未処理束);
		検索済束.入っている全てのものを以下の入れ物に移動する(未処理束);
		ソート済束.入っている全てのものを以下の入れ物に移動する(未処理束);

		未処理束.かきまぜる();

		最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());

		update();
	}

	void 最小値選択法() {
		if (未処理束.入っているものの個数() != 0) {
			if (未処理束.カーソル位置にあるものの数値() < 最小値候補.カーソル位置にあるものの数値()) {
				検索済束.最後に追加する(最小値候補.カーソル位置にあるもの());
				最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
			} else {
				検索済束.最後に追加する(未処理束.カーソル位置にあるもの());
			}
			if (未処理束.入っているものの個数() != 0) {
			} else {
				ソート済束.最後に追加する(最小値候補.カーソル位置にあるもの());
				検索済束.入っている全てのものを以下の入れ物に移動する(未処理束);
				最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
			}
		} else {
			ソート済束.最後に追加する(最小値候補.カーソル位置にあるもの());
			チクタク = false;
		}
	}

}
