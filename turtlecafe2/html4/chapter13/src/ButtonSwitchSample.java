/**
 * プログラム名：どのボタンが押されたか表示するプログラム 作成者： MegumiAraki 作成日： Wed Dec 05 13:24:46 JST
 * 2007
 */
public class ButtonSwitchSample extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ButtonSwitchSample());
	}

	// ボタン
	ButtonTurtle helloButton;
	ButtonTurtle byeButton;

	// タートルを動かす処理
	public void start() {

		初期化する();

		// アニメションループ
		String text = "表示用テキスト";
		while (true) {
			// 待つ
			sleep(0.25);

			// 処理を行う
			// ボタンの入力を受け付ける
			if (helloButton.isClicked()) {// helloButtonがクリックされたら
				text = helloButton.text();
			}
			if (byeButton.isClicked()) {// byeButtonがクリックされたら
				text = byeButton.text();
			} else {
				//何もしない
			}
			print(text);//テキストを出力する

			// 再描画する
			update();
		}
	}

	void 初期化する() {
		hide();

		// ボタンを作る
		helloButton = new ButtonTurtle("こんにちは");
		byeButton = new ButtonTurtle("さようなら");

		// ボタンを見やすい位置に置く
		helloButton.warp(100, 50);
		byeButton.warp(100, 100);

		// 再描画する
		update();
	}

}