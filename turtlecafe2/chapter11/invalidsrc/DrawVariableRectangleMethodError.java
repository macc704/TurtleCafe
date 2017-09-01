/*
 * 四角形を描くプログラム（コンパイルエラー）
 * （引数ありメソッドの練習）
 * 作成者：MegumiAraki
 * 作成日：2007/06/09
 * メールアドレス：garnet@sfc.keio.ac.jp
 */

public class DrawVariableRectangleMethodError extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawVariableRectangleMethodError());
	}
	
	//タートルを動かす処理
	void start() {

		// 一辺の長さの入力を受け取る
		int length = 0;
		print("一辺の長さを入力してください");
		length = input();
		
		drawRectangle();// 一辺の長さを指定して四角形を描く

	}

	//四角形を描く
	void drawRectangle(){
		for (int i = 0; i < 4; i++) {
			fd(length);
			rt(90);
		}
	}
}
