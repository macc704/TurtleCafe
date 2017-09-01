/*
 * プログラム名：作文さんアプリケーション 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class SakubunApplication extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SakubunApplication(), args);
	}

	// タートルを動かす処理
	public void start() {
		hide();
		window.size(520, 270);

		ButtonTurtle makeButton = new ButtonTurtle("文を作成");
		makeButton.warp(100, 30);

		TextTurtle sentence = new TextTurtle("");
		sentence.warp(300, 80);

		// 入力ボックス
		InputTurtle input = new InputTurtle();
		input.warp(30, 130);
		input.toJapaneseMode();// 入力を日本語モードにする

		ButtonTurtle inputNounButton = new ButtonTurtle("名詞として追加");
		inputNounButton.warp(300, 130);

		ButtonTurtle inputVerbButton = new ButtonTurtle("動詞として追加");
		inputVerbButton.warp(300, 180);

		// 名詞
		ListTurtle<TextTurtle> nouns = new ListTurtle<TextTurtle>(true);
		nouns.warp(50, 250);
		nouns.addLast(new TextTurtle("私"));

		// 動詞
		ListTurtle<TextTurtle> verbs = new ListTurtle<TextTurtle>(true);
		verbs.warp(50, 300);
		verbs.addLast(new TextTurtle("食べた"));

		while (true) {
			sleep(0.025);// 待つ

			// 名詞の追加
			if (inputNounButton.isClicked()) {
				if (!input.text().equals("")) {
					nouns.addLast(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			// 動詞の追加
			if (inputVerbButton.isClicked()) {
				if (!input.text().equals("")) {
					verbs.addLast(new TextTurtle(input.text()));
					input.clearText();
				}
			}

			if (makeButton.isClicked()) {
				String text = "";
				nouns.setCursor(random(nouns.getSize()) + 1);
				text += nouns.getObjectAtCursor().getText() + "が";
				nouns.setCursor(random(nouns.getSize()) + 1);
				text += nouns.getObjectAtCursor().getText() + "を";
				verbs.setCursor(random(verbs.getSize()) + 1);
				text += verbs.getObjectAtCursor().getText() + "。";
				sentence.text(text);
			}

			update();// 再描画する
		}
	}

}
