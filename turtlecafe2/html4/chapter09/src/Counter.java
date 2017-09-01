/*
 * 繰り返しを数えるカウンター
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class Counter extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Counter());
	}

	// タートルを動かす処理
	public void start() {
		TextTurtle counter = new TextTurtle("繰り返し数");
		{ // アニメーションループ
			int i = 0;
			while (true) {
				sleep(0.1);
				{ // 処理
					counter.text(i);
				}
				i++;
				update();
			}
		}
	}

}