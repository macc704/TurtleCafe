/*
 * プログラム名：おうむ返しプログラム（入力タートルバージョン） 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class InputTurtleSample1 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new InputTurtleSample1(), args);
	}

	// タートルを動かす処理
	public void start() {

		hide();
		// 入力ボックス
		InputTurtle input = new InputTurtle();
		input.warp(30, 30);
		// 表示用テキスト
		TextTurtle text = new TextTurtle("ここに文字が表示されます");
		text.fontsize(14);

		while (true) {
			sleep(0.025);// 待つ

			// エンターキーが押されたら
			if (key() == 10) {
				text.text(input.text());// 表示用テキストの内容を入力ボックスの内容に変える
				input.clearText();// 表示用テキストの内容をリセットする
			}

			update();// 再描画する
		}
	}
}
