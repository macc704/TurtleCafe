/**
 * プログラム名：２つの入力ボックスを切り替えるプログラム 
 * 作成者：MegumiAraki 
 * バージョン： 1.0 （20071215）
 */
public class TwoInputBoxes extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new TwoInputBoxes());
	}

	// タートルを動かす処理
	public void start() {

		hide();

		// 入力ボックス1
		InputTurtle input1 = new InputTurtle();
		input1.warp(30, 30);

		// 入力ボックス2
		InputTurtle input2 = new InputTurtle();
		input2.warp(30, 60);
		input2.setActive(false);

		// 表示用テキスト
		TextTurtle text = new TextTurtle("ここに文字が表示されます");
		text.fontsize(10);

		while (true) {

			sleep(0.025);// 待つ			

			// エンターキーが押されたら
			if (key() == 10) {
				if (input1.isActive()) {
					text.text(input1.text());
					input1.clearText();
				} else if (input2.isActive()) {
					text.text(input2.text());
					input2.clearText();
				}
			}

			// スペースキーが押されたら
			if (key() == 32) {
				if (input1.isActive()) {
					input1.setActive(false);
					input2.setActive(true);
				} else if (input2.isActive()) {
					input1.setActive(true);
					input2.setActive(false);
				}
			}

			update();// 再描画する			
		}
	}
}