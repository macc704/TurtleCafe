/**
 * プログラム名： 任意の大きさの四角形を書くプログラム
 * 作成者： Yoshiaki Matsuzawa
 * 作成日： 2007/09/22
 */
public class FirstTurtle extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FirstTurtle());
	}

	//タートルを動かす処理
	public void start() {
	
		//辺の長さを入力させる
		print("長さを入力してください");
		int len = input();
		
		//四角形を書く
		for(int i = 0; i < 4; i++){
			fd(len);
			rt(90);
		}
	}

}