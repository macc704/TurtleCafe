/*
 * プログラム名：タイピングゲームアプリケーション 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class TypingApplication extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new TypingApplication(), args);
	}

	// タートルを動かす処理
	public void start() {

		hide();
		window.size(500, 220);

		// 入力ボックス
		InputTurtle input = new InputTurtle();
		input.warp(250, 100);
		input.toJapaneseMode();// 入力を日本語モードにする

		// 問題
		ImageTurtle question = new ImageTurtle("start.gif");
		question.warp(100, 100);

		// 検索結果
		TextTurtle result = new TextTurtle("-----タイピングゲーム-----");
		result.fontsize(10);
		result.warp(100, 30);

		// 辞書の読みを入れておく入れ物
		ListTurtle<CardTurtle> answers = new ListTurtle<CardTurtle>(true);
		answers.warp(50, 200);
		answers.addLast(new CardTurtle(""));
		answers.addLast(new CardTurtle("りんご"));
		answers.addLast(new CardTurtle("いちご"));
		answers.addLast(new CardTurtle("すいか"));
		answers.addLast(new CardTurtle("みかん"));
		answers.addLast(new CardTurtle("終了"));

		// 辞書の内容を入れておく入れ物
		ListTurtle<ImageTurtle> questions = new ListTurtle<ImageTurtle>(true);
		questions.warp(50, 250);
		questions.addLast(new ImageTurtle("start.gif"));
		questions.addLast(new ImageTurtle("apple.gif"));
		questions.addLast(new ImageTurtle("strawberry.gif"));
		questions.addLast(new ImageTurtle("wm.gif"));
		questions.addLast(new ImageTurtle("orange.gif"));
		questions.addLast(new ImageTurtle("terminater.gif"));

		long startTime = System.currentTimeMillis();
		int inputCharacterCount = 0;// 打ち込んだ文字数

		while (true) {
			sleep(0.025);// 待つ

			// エンターキーが押されたら、
			if (key() == 10) {

				String text = input.text();
				if (answers.getObjectAtCursor().getText().equals(text)) {
					// 打ち込んだ文字数を数える
					inputCharacterCount += text.length();

					// 次の問題に進む
					questions.moveCursorToNext();
					answers.moveCursorToNext();
					question.looks(questions.getObjectAtCursor());
					input.clearText();

					// 最後の場合，結果を表示する
					if (answers.getCursor() == answers.getSize() - 1) {
						long endTime = System.currentTimeMillis();
						long miliTime = endTime - startTime;// かかった時間（ミリ秒）
						double time = (double) miliTime / (double) 1000
								/ (double) 60;// かかった時間(分)
						int speed = (int) (inputCharacterCount / time);
						result.text("あなたのタイピング速度は" + speed + "文字/分です．");
					}
				}
			}

			update();// 再描画する
		}
	}

}
