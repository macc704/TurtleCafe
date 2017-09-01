/**
 * プログラム名：最小値選択法（２重ループ） 
 * 作成者： MegumiAraki 
 * 作成日： Wed Dec 05 21:36:23 JST 2007
 */
public class SelectionSort2 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort2());
	}

	// カードの束
	HolderTurtle 未処理束;
	HolderTurtle 最小値候補;
	HolderTurtle ソート済束;
	HolderTurtle 検索済束;

	// タートルを動かす処理
	public void start() {
		初期化する();

		while (true) {
			最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
			描画する();

			do {
				// めくる
				if (未処理束.カーソル位置にあるものの数値() < 最小値候補.カーソル位置にあるものの数値()) {// (小さくなければ）
					検索済束.最後に追加する(最小値候補.カーソル位置にあるもの());
					描画する();
					最小値候補.最後に追加する(未処理束.カーソル位置にあるもの());
					描画する();
				} else {
					検索済束.最後に追加する(未処理束.カーソル位置にあるもの());
					描画する();
				}
			} while (未処理束.入っているものの個数() != 0);
			ソート済束.最後に追加する(最小値候補.カーソル位置にあるもの());
			描画する();
			if (検索済束.入っているものの個数() == 1) {
				break;
			}
			検索済束.入っている全てのものを以下の入れ物に移動する(未処理束);
			描画する();
		}

		ソート済束.最後に追加する(検索済束.カーソル位置にあるもの());// 最小値候補をソート済み束に置く
		描画する();
	}

	void 初期化する() {
		hide();
		Turtle.window.size(550, 400);// ウインドウサイズを調節する

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
		TextTurtle ソート済み束タグ = new TextTurtle("ソート済束");
		ソート済み束タグ.fontsize(12);
		ソート済み束タグ.warp(50, 240);

		検索済束 = new HolderTurtle();
		検索済束.warp(50, 190);
		TextTurtle 検索済み束タグ = new TextTurtle("検索済束");
		検索済み束タグ.fontsize(12);
		検索済み束タグ.warp(50, 170);

		// カードを8枚作り、未処理束に入れる
		for (int i = 0; i < 8; i++) {
			未処理束.最後に追加する(new CardTurtle(random(100)));
		}

		update();
	}

	void 描画する() {
		update();
		sleep(0.1);
	}

}