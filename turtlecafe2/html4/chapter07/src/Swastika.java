/**
 * プログラム名： 作成者： 作成日： Mon Oct 29 15:53:04 JST 2012
 */
public class Swastika extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Swastika());
	}

	// タートルを動かす処理
	public void start() {
		hide();

		Turtle kame1 = new Turtle();
		Turtle kame2 = new Turtle();
		Turtle kame3 = new Turtle();
		Turtle kame4 = new Turtle();

		// カメの向きを変える
		kame2.rt(90);
		kame3.rt(180);
		kame4.rt(-90);

		int length = 80;
		int i = 0;
		while (i < length * 2) {
			kame1.fd(1);
			kame2.fd(1);
			kame3.fd(1);
			kame4.fd(1);

			if (i == length) {
				kame1.lt(90);
				kame2.lt(90);
				kame3.lt(90);
				kame4.lt(90);
			}
			i++;
		}
	}

}