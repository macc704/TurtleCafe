/*
 * キー番号を調べるプログラム
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class CheckKeycode extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new CheckKeycode());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す
		TextTurtle taro = new TextTurtle("");// 文字(太郎)を生成

		{// アニメーションループ
			while (true) {
				// --- 待つ ---
				sleep(0.1);

				{ // 一コマの処理をする
					int keycode = key(); // 今押されているキーを取得する
					taro.text(keycode); // 押されているキー番号を文字にして表示する
				}

				// --- 再描画 ---
				update();
			}
		}
	}

}