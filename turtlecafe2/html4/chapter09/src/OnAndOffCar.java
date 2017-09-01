/*
 * 車を点滅させるプログラム
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class OnAndOffCar extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new OnAndOffCar());
	}

	// タートルを動かす処理
	public void start() {
		ImageTurtle car = new ImageTurtle("car.gif");
		{ // アニメーションループ
			int i = 0;
			while (true) {
				sleep(0.2);
				{ // 1コマの処理
					if ((i % 2) == 0) {
						car.show();
					} else {
						car.hide();
					}
				}
				i++;
				update();
			}
		}
	}

}