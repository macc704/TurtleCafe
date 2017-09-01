/*
 * 花びらを書くプログラム
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class Petal extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Petal());
	}

	//タートルを動かす処理
	public void start(){
	
		int i;//ループ用

		int length = 1;
		int angle = 1;
		
		//円弧を書く
		i = 1;
		while(i <= 120){
			rt(angle);
			fd(length);
			i = i + angle;
		}
		
		//次の円弧の角度へ
		rt(60);
		
		//円弧を書く
		i = 1;
		while(i <= 120){
			rt(angle);
			fd(length);
			i = i + angle;
		}

	}
}