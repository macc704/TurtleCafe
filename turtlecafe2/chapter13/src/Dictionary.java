/**
 * プログラム名：辞書アプリケーション 
 * 作成者：MegumiAraki
 * バージョン： 1.0 （20071215）
 */
public class Dictionary extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Dictionary());
	}

	InputTurtle input;// 入力ボックス
	TextTurtle result;// 検索結果表示用テキスト

	// 入れ物
	HolderTurtle keys;
	HolderTurtle values;

	// タートルを動かす処理
	public void start() {

		初期化する();

		while (true) {
			sleep(0.025);// 待つ

			// エンターキーが押されたら、
			if (key() == 10) {
				//検索を行い，結果を表示する
				String key = input.text();
				String value = 検索する(key);
				result.text(value);
				input.clearText();
			}

			update();// 再描画する			
		}
	}

	// 検索する
	String 検索する(String searchKey) {

		for (int i = 1; i <= keys.入っているものの個数(); i++) {// １つずつ調べる
			keys.カーソル位置を変える(i);
			if (keys.カーソル位置にあるものの内容().equals(searchKey)) {// 見つかったら
				values.カーソル位置を変える(i);
				return values.カーソル位置にあるものの内容();// 検索結果を返す
			}
		}

		// 見つからなかったら
		return "見つかりませんでした";
	}

	void 初期化する() {

		hide();

		// 入力ボックス
		input = new InputTurtle();
		input.warp(30, 30);

		// 検索結果
		result = new TextTurtle("ここに文章が表示されます");
		result.fontsize(14);

		// 辞書の読みを入れておく入れ物
		keys = new HolderTurtle();
		keys.warp(50, 200);
		keys.最後に追加する(new CardTurtle("りんご"));
		keys.最後に追加する(new CardTurtle("いちご"));
		keys.最後に追加する(new CardTurtle("めろん"));
		keys.最後に追加する(new CardTurtle("ばなな"));

		// 辞書の内容を入れておく入れ物
		values = new HolderTurtle();
		values.warp(50, 250);
		values.最後に追加する(new CardTurtle("apple"));
		values.最後に追加する(new CardTurtle("strawberry"));
		values.最後に追加する(new CardTurtle("melon"));
		values.最後に追加する(new CardTurtle("banana"));

		input.toJapaneseMode();// 入力を日本語モードにする

		update();// 再描画する
	}

}
