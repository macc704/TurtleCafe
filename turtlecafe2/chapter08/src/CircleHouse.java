/**
 * 家で円を描くプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class CircleHouse extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new CircleHouse());
	}

	//タートルを動かす処理
	public void start() {

		House house = new House(); //家を生成

		//赤い軌跡を描く準備
		house.color(java.awt.Color.red);
		house.down();

		//アニメーションループ
		while (true) {

			//待つ
			sleep(0.1); //0.1秒

			//処理を行う
			house.rt(5);
			house.fd(5);

			//再描画する
			update();
		}

	}

}