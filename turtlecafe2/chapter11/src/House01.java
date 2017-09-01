/*
* 窓付きの家を描くプログラム（メソッドなし）
* 作成者：MegumiAraki
* 作成日：2007/06/09
* メールアドレス：garnet@sfc.keio.ac.jp
*/

public class House01 extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new House01());
	}
	
	// 家を描く
	//タートルを動かす処理
	public void start() {
		
		// 屋根を描く
		// 向きを調節する
		rt(30);
		// 三角形を描く
		for (int i = 0; i < 3; i++) {
			fd(80);
			rt(120);
		}
		// 向きを上向きに戻す
		lt(30);
		
		// 壁を描く
		rt(90); // 向きを調節する
		// 四角形を描く
		for (int j= 0; j < 4; j++) {
			fd(80);
			rt(90);
		}
		lt(90);// 向きを上向きに戻す
		
		// 窓を描く位置まで移動する
		// 前処理
		up();
		// 右へ22
		rt(90);
		fd(22);
		// 下へ22
		rt(90);
		fd(22);
		// 後処理
		rt(180);
		down();
		
		// 窓を描く
		rt(90);//向きを調節する
		for (int i = 0; i < 4; i++) {
			//小さな四角形を描く
			for (int j= 0; j < 4; j++) {
				fd(16);
				rt(90);
			}
			fd(16 * 2 + 4);
			rt(90);
		}
		lt(90);//向きを上向きに戻す
	}
}