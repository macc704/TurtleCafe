

/*
 * 発展例題１：再帰を使って木を描くプログラム
 * （メソッドの再帰呼び出し）
 * 作成者：MegumiAraki
 * 作成日：2007/06/09
 * メールアドレス：garnet@sfc.keio.ac.jp
 */
public class DrawTree extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTree());
	}

	// タートルを動かす処理
	public void start() {
		bk(100);// 木を描く位置まで移動する
		drawTree(1, 100);// 枝分かれの数を１とし、幹の長さを１００として、木を描く。

	}

	// 木を描く
	void drawTree(int branchNumber, int length) {
		// メソッド開始のデバッグ出力をする
		debugStart(branchNumber, length);

		if (branchNumber == 6) {

			fd(length);
			bk(length);

		} else {

			fd(length);

			// 右の枝を描く
			rt(30);
			drawTree(branchNumber + 1, length / 2);
			lt(30);

			// 左の枝を描く
			lt(30);
			drawTree(branchNumber + 1, length / 2);
			rt(30);

			bk(length);

		}

		// メソッド終了のデバッグ出力をする
		debugEnd(branchNumber);
	}

	// メソッド開始のデバッグ出力をする
	void debugStart(int outputBranchNum, int outputLength) {
		for (int i = 0; i < outputBranchNum; i++) {
			System.out.print("\t");// タブで空白を空ける
		}

		print("木を描く（枝分かれの数：" + outputBranchNum + "、幹の長さ：" + outputLength + "）。");

	}

	// メソッド開始のデバッグ出力をする
	void debugEnd(int drawnBranchNum) {
		for (int i = 0; i < drawnBranchNum; i++) {
			System.out.print("\t");// タブで空白を空ける
		}

		print("／／");

	}

}