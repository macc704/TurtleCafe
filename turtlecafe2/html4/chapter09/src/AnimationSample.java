/*
 * アニメーションのサンプル
 * 
 * 2003/05/08 Yoshiaki Matsuzawa 
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class AnimationSample extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new AnimationSample());
	}

	// タートルを動かす処理
	public void start() {
		TextTurtle text = new TextTurtle("注目->");
		TextTurtle number = new TextTurtle("");
		ImageTurtle car = new ImageTurtle("car.gif");
		{ // 初期化
			number.warp(200, 100);
			car.hide();
		}
		{ // アニメーションループ
			int i = 10;
			while (true) {
				sleep(1);
				{ // 一コマの処理
					number.text(i);
					if (i == 3) {
						number.color(java.awt.Color.red);
					}
					if (i <= 0) {
						text.looks(car);
						number.text("ぼかーん!!");
					}
				}
				i--;
				update();
			}
		}
	}

}