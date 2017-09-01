/**
 * プログラム名：
 * 作成者： 
 * 作成日： Wed Jan 02 17:29:52 JST 2008
 */
public class Star extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Star());
	}

	//タートルを動かす処理
	public void start() {
rt(135);
fd(50);
lt(128);
fd(25);
rt(90);
fd(50);
lt(90);
fd(10);
lt(90);
fd(50);
rt(90);
fd(25);
lt(128);
fd(50);
	}

}