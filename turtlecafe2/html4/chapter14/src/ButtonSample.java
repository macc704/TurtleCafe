/**
 * プログラム名：どのボタンが押されたか表示するプログラム 
 * 作成者： MegumiAraki 
 * 作成日： Wed Dec 05 13:24:46 JST
 * 2007
 */
public class ButtonSample extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ButtonSample());
	}

	// ボタン
	ButtonTurtle helloButton;
	ButtonTurtle byeButton;

	// タートルを動かす処理
	public void start() {

		初期化する();

		// アニメションループ
		while (true) {

			// 待つ
			sleep(0.25);

			// 処理を行う
			if (helloButton.isClicked()) {// helloButtonがクリックされたら
				print(helloButton.text());
			} else if (byeButton.isClicked()) {// byeButtonがクリックされたら
				print(byeButton.text());
			} else {//何もクリックされていなかったら
				//何もしない
			}

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