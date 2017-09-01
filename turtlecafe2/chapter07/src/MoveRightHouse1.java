/**
 * 家を右に動かすプログラム
 * 其の1 : 右に向けて動かす方法
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class MoveRightHouse1 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse1());
	}

	//タートルを動かす処理
	public void start() {

		House house = new House(); //家を生成

		house.rt(90); //右に向ける

		//アニメーションループ
		while (true) {

			//待つ
			sleep(0.1); //0.1秒

			//処理を行う
			house.fd(5);

			//再描画する
			update();
		}
		
	}

}