/**
 * プログラム名： 作成者： 作成日： Fri Oct 26 19:18:37 JST 2012
 */
public class TurtleRelay extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new TurtleRelay());
	}

	// タートルを動かす処理
	public void start() {
		hide();
		Turtle kame1 = new Turtle();
		Turtle kame2 = new Turtle();
		Turtle kame3 = new Turtle();
		Turtle kame4 = new Turtle();

		// カメを初期位置に移動
		kame1.warp(70, 30);
		kame2.warp(170, 30);
		kame3.warp(170, 144);
		kame4.warp(70, 144);

		// カメの向きを変える
		kame1.rt(90);
		kame2.rt(90);
		kame3.lt(90);
		kame4.lt(90);

		// カメを走らせる
		kame1.fd(100);

		int i = 0;
		while (i < 180) {
			kame2.rt(1);
			kame2.fd(1);
			i++;
		}

		kame3.fd(100);

		i = 0;
		while (i < 180) {
			kame4.rt(1);
			kame4.fd(1);
			i++;
		}
	}

}