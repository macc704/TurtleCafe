/**
* プログラム名：
* 作成者： 
* 作成日： Mon Oct 22 19:19:30 JST 2007
*/
public class HelloWorld extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HelloWorld());
	}
	
	//タートルを動かす処理
	public void start() {

		//コンソールにHello World!を表示する
		print("Hello World!");

	}
	
}