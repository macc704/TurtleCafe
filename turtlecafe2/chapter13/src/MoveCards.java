/**
 * プログラム名：カードを入れ物１から入れ物２に移動するプログラム
 * 作成者： MegumiAraki 
 * 作成日： Wed Dec 05 13:24:46 JST 2007
 */
public class MoveCards extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveCards());
	}

	// 入れ物
	HolderTurtle holder1;
	HolderTurtle holder2;

	// タートルを動かす処理
	public void start() {

		初期化する();
		print("アニメーションループを開始します");

		// アニメションループ
		while (true) {

			// 待つ
			sleep(0.5);

			// 処理を行う
			if (holder1.入っているものの個数() != 0) {
				holder2.最後に追加する(holder1.カーソル位置にあるもの());// 入れ物１から入れ物２にカードを移動する
			} else if (holder1.入っているものの個数() == 0) {
				print("カード移動を終了します");
				break;// アニメーションループを抜ける
			} else {
				print("エラー");
			}

			// 再描画する
			update();

		}
		print("アニメーションループを終了しました");
	}

	void 初期化する() {
		Turtle.window.size(550, 300);// ウインドウサイズを調節する
		hide();

		// 入れ物を作る
		holder1 = new HolderTurtle();
		holder2 = new HolderTurtle();

		// 入れ物を見やすい位置に置く
		holder1.warp(50, 50);
		holder2.warp(50, 100);

		// 入れ物に１０枚のカードを入れる
		for (int i = 0; i < 10; i++) {
			holder1.最後に追加する(new CardTurtle(i * 10));
		}

		update();
	}

}