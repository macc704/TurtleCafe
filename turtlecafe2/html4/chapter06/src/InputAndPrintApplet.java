/**
 * プログラム名：
 * 作成者： 
 * 作成日： Sat Oct 20 14:26:39 JST 2007
 */
public class InputAndPrintApplet extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new InputAndPrintApplet());
	}

	//タートルを動かす処理
	void start() {
		Turtle.window.split.setDividerLocation(25);
		
		//入力を受けとる
		print("好きな文字を入力>>");
		String text = inputString();
		
		//出力を行う
		String reply = "あなたの入力したのは" + text + "ですね";
		print(reply);

	}

}