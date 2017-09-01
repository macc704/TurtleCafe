/*
 * プログラム名：ボタンのサンプルプログラム
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class ButtonSample extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ButtonSample());
	}

	// タートルを動かす処理
	public void start() {

		hide();

		// ボタンを作る
		ButtonTurtle helloButton = new ButtonTurtle("押してください！");

		// アニメションループ
		while (true) {
			sleep(0.025);

			if (helloButton.isClicked()) {// helloButtonがクリックされたら
				print("押されました");
			} else {// 何もクリックされていなかったら
				// 何もしない
			}

			update();
		}
	}

}