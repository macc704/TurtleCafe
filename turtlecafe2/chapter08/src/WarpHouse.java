/**
 * 4つの家をワープを使って配置するプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class WarpHouse extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WarpHouse());
	}

	//タートルを動かす処理
	public void start() {

		House house1 = new House(); //家1を生成
		House house2 = new House(); //家2を生成
		House house3 = new House(); //家3を生成
		House house4 = new House(); //家4を生成

		//アニメーションループ
		while (true) {

			// --- 待つ ---
			sleep(0.1); //0.1秒

			// --- 処理を行う ---
			house1.warp(100, 100);
			house2.warp(100, 200);
			house3.warp(200, 100);
			house4.warp(200, 200);

			// --- 再描画する ---
			update();
		}

	}

}