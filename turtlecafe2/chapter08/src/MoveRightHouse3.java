/**
 * 家を右に動かすプログラム
 * 其の3 : 上に向いたまま右に動かす(ワープを使う)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class MoveRightHouse3 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse3());
	}

	//タートルを動かす処理
	public void start() {

		House house = new House(); //家を生成

		int x; //x座標を入れる変数
		int y; //y座標を入れる変数

		//アニメーションループ
		while (true) {

			//待つ
			sleep(0.1); //0.1秒

			//処理を行う
			x = house.getX(); //家のx座標を取得する
			y = house.getY(); //家のy座標を取得する
			house.warp(x + 5, y); //右に移動

			//再描画する
			update();
		}

	}

}