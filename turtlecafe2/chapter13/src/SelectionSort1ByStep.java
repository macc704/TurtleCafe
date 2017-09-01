/**
 * プログラム名：最小値選択法（Squeakと同じ） 
 * 作成者： MegumiAraki 
 * 作成日： Wed Dec 05 21:36:23 JST 2007
 */
public class SelectionSort1ByStep extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort1ByStep());
	}

	// カードの束
	HolderTurtle 未処理束;
	HolderTurtle 最小値候補;
	HolderTurtle ソート済束;
	HolderTurtle 検索済束;

	// ボタン
	ButtonTurtle stepButton;

	// タートルを動かす処理
	public void start() {

		初期化する();
		ボタンが押されるまで待つ();

		// カードを並び替える（並び替えの様子をアニメーションで表示する）
		while (true) {
			if (未処理束.入っているものの個数() != 0) {
				if (未処理束.カーソル位置にあるものの数値() < 最小値候補.カーソル位置にあるものの数値()) {
					検索済束.最後に追加する(最小値候補.カーソル位置にあるもの());
					ボタンが押されるまで待つ();
					最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
					ボタンが押されるまで待つ();
				} else {
					検索済束.最後に追加する(未処理束.カーソル位置にあるもの());
					ボタンが押されるまで待つ();
				}
				if (未処理束.入っているものの個数() != 0) {
				} else {
					ソート済束.最後に追加する(最小値候補.カーソル位置にあるもの());
					ボタンが押されるまで待つ();
					検索済束.入っている全てのものを以下の入れ物に移動する(未処理束);
					ボタンが押されるまで待つ();
					最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
					ボタンが押されるまで待つ();
				}
			} else {
				ソート済束.最後に追加する(最小値候補.カーソル位置にあるもの());
				ボタンが押されるまで待つ();
				break;
			}
		}
	}

	void 初期化する() {
		hide();
		Turtle.window.size(550, 400);// ウインドウサイズを調節する

		// ボタンを作る
		stepButton = new ButtonTurtle("ステップ");
		stepButton.warp(450, 20);

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
		ソート済束タグ.fontsize(12);
		ソート済束タグ.warp(50, 240);

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

	// 描画する
	void ボタンが押されるまで待つ() {
		do {// ステップボタンが押されるまで待つ
			update();
			sleep(0.025);
		} while (!(stepButton.isClicked()));
	}

}