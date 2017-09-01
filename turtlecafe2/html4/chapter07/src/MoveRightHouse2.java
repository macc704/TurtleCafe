/**
 * 家を右に動かすプログラム
 * 其の2 : 上に向いたまま右に動かす
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class MoveRightHouse2 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse2());
	}

	//タートルを動かす処理
	public void start() {

		House house = new House(); //家を生成

		//アニメーションループ
		while (true) {

			//待つ
			sleep(0.1); //0.1秒

			//処理を行う
			house.rt(90);
			house.fd(5);
			house.lt(90);

			//再描画する
			update();
		}

	}

}