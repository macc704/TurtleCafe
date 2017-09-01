/**
 * プログラム名：タイピングゲームアプリケーション 
 * 作成者：MegumiAraki
 * バージョン： 1.0 （20071215）
 */
public class TypingApplication extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new TypingApplication());
	}

	InputTurtle input;// 入力ボックス
	TextTurtle result;// 検索結果表示用テキスト
	ImageTurtle question;// 検索結果表示用テキスト

	// 入れ物
	HolderTurtle answers;
	HolderTurtle questions;

	// タートルを動かす処理
	public void start() {

		初期化する();

		long startTime = System.currentTimeMillis();
		int inputCharacterCount = 0;//打ち込んだ文字数

		while (true) {
			sleep(0.025);// 待つ

			// エンターキーが押されたら、
			if (key() == 10) {

				String text = input.text();
				if (answers.カーソル位置にあるものの内容().equals(text)) {
					//打ち込んだ文字数を数える
					inputCharacterCount += text.length();

					//次の問題に進む
					questions.カーソルを進める();
					answers.カーソルを進める();
					question.looks(questions.カーソル位置にあるもの());
					input.clearText();

					//最後の場合，結果を表示する					
					if (answers.カーソル位置() == answers.入っているものの個数()) {
						long endTime = System.currentTimeMillis();
						long miliTime = endTime - startTime;//かかった時間（ミリ秒）
						double time = (double) miliTime / (double) 1000
								/ (double) 60;//かかった時間(分)
						int speed = (int) (inputCharacterCount / time);
						result.text("あなたのタイピング速度は" + speed + "文字/分です．");
					}
				}
			}

			update();// 再描画する			
		}
	}

	// 検索する
	ImageTurtle search(String searchKey) {
		for (int i = 1; i <= answers.入っているものの個数(); i++) {// １つずつ調べる
			answers.カーソル位置を変える(i);
			if (answers.カーソル位置にあるものの内容().equals(searchKey)) {// 見つかったら
				questions.カーソル位置を変える(i);
				return questions.カーソル位置にあるもの();// 検索結果を返す
			}
		}

		// 見つからなかったら
		return null;
	}

	void 初期化する() {
		hide();
		window.size(500, 220);

		// 入力ボックス
		input = new InputTurtle();
		input.warp(250, 100);
		input.toJapaneseMode();// 入力を日本語モードにする

		// 問題
		question = new ImageTurtle("start.gif");
		question.warp(100, 100);

		// 検索結果
		result = new TextTurtle("-----タイピングゲーム-----");
		result.fontsize(10);
		result.warp(100, 30);

		// 辞書の読みを入れておく入れ物
		answers = new HolderTurtle();
		answers.warp(50, 200);
		answers.最後に追加する(new CardTurtle(""));
		answers.最後に追加する(new CardTurtle("りんご"));
		answers.最後に追加する(new CardTurtle("いちご"));
		answers.最後に追加する(new CardTurtle("すいか"));
		answers.最後に追加する(new CardTurtle("みかん"));
		answers.最後に追加する(new CardTurtle("終了"));

		// 辞書の内容を入れておく入れ物
		questions = new HolderTurtle();
		questions.warp(50, 250);
		questions.最後に追加する(new ImageTurtle("start.gif"));
		questions.最後に追加する(new ImageTurtle("apple.gif"));
		questions.最後に追加する(new ImageTurtle("strawberry.gif"));
		questions.最後に追加する(new ImageTurtle("wm.gif"));
		questions.最後に追加する(new ImageTurtle("orange.gif"));
		questions.最後に追加する(new ImageTurtle("terminater.gif"));

		update();// 再描画する
	}

}
