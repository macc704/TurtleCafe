/**
 * プログラム名：HelloTurtle
 * 作成者： MegumiAraki
 * 作成日： Sat Oct 27 15:52:54 JST 2007
 */
public class HelloTurtle extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HelloTurtle());
	}

	//タートルを動かす処理
	public void start() {

		//HelloTurtle
		print("Hello World!");

		//HelloTurtle
		fd(100);	

	}

}