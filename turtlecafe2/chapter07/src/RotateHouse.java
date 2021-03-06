/**
 * タートルで書いた絵をまわすプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class RotateHouse extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateHouse());
	}

	//タートルを動かす処理
	public void start() {

		House house = new House(); //家を生成

		//アニメーションループ
		while (true) {

			//待つ
			sleep(0.1); //0.1秒

			//処理を行う
			house.rt(5);

			//再描画する
			update();
		}

	}

}