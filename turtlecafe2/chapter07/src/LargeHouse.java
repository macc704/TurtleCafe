/**
 * 家を大きくするプログラム
 * 其の1 : 大きさを測る
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class LargeHouse extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new LargeHouse());
	}

	//タートルを動かす処理
	public void start() {

		House house = new House(); //家を生成

		//アニメーションループ
		while (true) {

			// --- 待つ ---
			sleep(0.1); //0.1秒

			// --- 処理を行う ---

			//家を大きくする
			house.size(200, 200);

			// --- 再描画する ---
			update();
		}

	}

}