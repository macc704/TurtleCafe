/*
* 四角形を描くプログラム（コンパイルエラー）
* （メソッド定義の間違い）
* 作成者：MegumiAraki
* 作成日：2007/06/09
* メールアドレス：garnet@sfc.keio.ac.jp
*/

public class DrawRectangleMethodError extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawRectangleMethodError());
	}
	
	//タートルを動かす処理
	public void start() {
		
		drawRectangle();// 四角形を描く処理を呼び出す

		//四角形を描く
		void drawRectangle(){
			for (int i = 0; i < 4; i++) {
				fd(50);
				rt(90);
			}
		}

	}
}