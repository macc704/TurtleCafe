/**
 * プログラム名：最小値選択法（二重ループ） 
 * 作成者： MegumiAraki 
 * 作成日： Wed Dec 05 21:36:23 JST 2007
 */
public class SelectionSort2WithButton extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort2WithButton());
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
		while (true) {
			ボタン入力の処理をする();
			最小値選択法();
			チクタク = false;
		}
	}

	// カードを並び替える（並び替えの様子をアニメーションで表示する）
	void 最小値選択法() {
		while (true) {
			最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
			ボタン入力の処理をする();

			do {
				if (未処理束.カーソル位置にあるものの数値() < 最小値候補.カーソル位置にあるものの数値()) {
					検索済束.最後に追加する(最小値候補.カーソル位置にあるもの());
					ボタン入力の処理をする();
					最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
					ボタン入力の処理をする();
				} else {
					検索済束.最後に追加する(未処理束.カーソル位置にあるもの());
					ボタン入力の処理をする();
				}

			} while (未処理束.入っているものの個数() != 0);

			ソート済束.最後に追加する(最小値候補.カーソル位置にあるもの());
			ボタン入力の処理をする();

			if (検索済束.入っているものの個数() == 1) {
				ソート済束.最後に追加する(検索済束.カーソル位置にあるもの());
				ボタン入力の処理をする();
				break;
			} else {
				検索済束.入っている全てのものを以下の入れ物に移動する(未処理束);
				ボタン入力の処理をする();
			}
		}

	}

	void リセットする() {
		最小値候補.入っている全てのものを以下の入れ物に移動する(未処理束);
		検索済束.入っている全てのものを以下の入れ物に移動する(未処理束);
		ソート済束.入っている全てのものを以下の入れ物に移動する(未処理束);

		未処理束.かきまぜる();
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

		// カードを20枚作り、未処理束に入れる
		for (int i = 0; i < 8; i++) {
			未処理束.最後に追加する(new CardTurtle(random(100)));
		}

		update();
	}

	void ボタン入力の処理をする() {
		do {
			sleep(0.1);

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

		} while (!チクタク);
	}

}