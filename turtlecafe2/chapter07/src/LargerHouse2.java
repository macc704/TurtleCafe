/**
 * 家を大きくするプログラム
 * 其の2 : 大きくなりすぎたら小さくする
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class LargerHouse2 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new LargerHouse2());
	}

	//タートルを動かす処理
	public void start() {

		House house = new House(); //家を生成

		int width; //width座標を入れる変数
		int height; //height座標を入れる変数

		//アニメーションループ
		while (true) {

			// --- 待つ ---
			sleep(0.1); //0.1秒

			// --- 処理を行う ---

			width = house.getWidth(); //家の横の長さを取得する
			height = house.getHeight(); //家の縦の長さを取得する

			//家を大きくする
			house.size(width + 2, height + 2);

			//横幅が大きくなりすぎたら小さくする
			if (width >= 300) {
				house.scale(0.25); //0.25倍の大きさにする
			}
			//縦幅が大きくなりすぎたら小さくする
			if (height >= 300) {
				house.scale(0.25); //0.25倍の大きさにする
			}

			// --- 再描画する ---
			update();
		}

	}

}