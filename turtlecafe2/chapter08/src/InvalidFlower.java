/*
 * 花を書くプログラム(うまくいかない版)
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class InvalidFlower extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new InvalidFlower());
	}

	//タートルを動かす処理
	public void start(){
	
		int i;//ループ用
		int j;//ループ用

		int length = 1;
		int angle = 1;
		
		
		//6枚の花びらを書く
		i = 1;
		while(i <= 6){
			rt(angle);
			fd(length);
			i = i + angle;
		}
		
		//円弧を書く
		j = 1;
		while(j <= 120){
			rt(angle);
			fd(length);
			j = j + angle;
		}
		
		//次の円弧の角度へ
		rt(60);
		
		//円弧を書く
		j = 1;
		while(j <= 120){
			rt(angle);
			fd(length);
			j = j + angle;
		}

	}
}