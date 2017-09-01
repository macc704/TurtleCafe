/**
 * プログラム名：作文さんアプリケーション 
 * 作成者：MegumiAraki
 * バージョン： 1.0 （20071215）
 */
public class SakubunApplication extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SakubunApplication());
	}

	ButtonTurtle inputNounButton;
	ButtonTurtle inputVerbButton;
	ButtonTurtle makeButton;
	InputTurtle input;
	TextTurtle sentence;

	// 入れ物
	HolderTurtle nouns;
	HolderTurtle verbs;

	// タートルを動かす処理
	public void start() {

		初期化する();

		while (true) {
			sleep(0.025);// 待つ

			//名詞の追加
			if (inputNounButton.isClicked()) {
				if (!input.text().equals("")) {
					nouns.最後に追加する(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			//動詞の追加
			if (inputVerbButton.isClicked()) {
				if (!input.text().equals("")) {
					verbs.最後に追加する(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			if (makeButton.isClicked()) {
				String text = "";
				nouns.カーソル位置を変える(random(nouns.入っているものの個数()) + 1);
				text += nouns.カーソル位置にあるものの内容() + "が，";
				nouns.カーソル位置を変える(random(nouns.入っているものの個数()) + 1);
				text += nouns.カーソル位置にあるものの内容() + "を，";
				verbs.カーソル位置を変える(random(verbs.入っているものの個数()) + 1);
				text += verbs.カーソル位置にあるものの内容() + "．";
				sentence.text(text);
			}

			update();// 再描画する
		}
	}

	void 初期化する() {
		hide();
		window.size(520, 270);

		makeButton = new ButtonTurtle("文を作成");
		makeButton.warp(100, 30);

		sentence = new TextTurtle("");
		sentence.warp(300, 80);

		// 入力ボックス
		input = new InputTurtle();
		input.warp(30, 130);
		input.toJapaneseMode();// 入力を日本語モードにする

		inputNounButton = new ButtonTurtle("名詞として追加");
		inputNounButton.warp(300, 130);

		inputVerbButton = new ButtonTurtle("動詞として追加");
		inputVerbButton.warp(300, 180);

		// 名詞
		nouns = new HolderTurtle();
		nouns.warp(50, 250);
		nouns.最後に追加する(new TextTurtle("私"));

		// 動詞
		verbs = new HolderTurtle();
		verbs.warp(50, 300);
		verbs.最後に追加する(new TextTurtle("食べる"));

		update();// 再描画する
	}

}
