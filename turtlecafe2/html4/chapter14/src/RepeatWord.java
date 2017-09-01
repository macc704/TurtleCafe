/**
 * プログラム名：おうむ返しプログラム（入力タートルバージョン） 
 * 作成者：MegumiAraki 
 * バージョン： 1.0 （20071215）
 */
public class RepeatWord extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new RepeatWord());
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
