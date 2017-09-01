/*
 * 曲線を書くプログラム
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class Curve extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Curve());
	}

	//タートルを動かす処理
	public void start() {

		int length;
		int angle;
		
		length = 5;
		angle = 5;
		
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);
		rt(length);
		fd(angle);				
		
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);
		lt(length);
		fd(angle);																
															

	}

}