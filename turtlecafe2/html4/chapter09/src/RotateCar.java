/*
 * 車が回るプログラム
 * 
 * 2003/06/23　Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class RotateCar extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateCar());
	}

	// タートルを動かす処理
	public void start() {
		ImageTurtle car = new ImageTurtle("car.gif");
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // 処理
					car.rt(5);
				}
				update();
			}
		}
	}

}