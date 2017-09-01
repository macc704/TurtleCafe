/*
 * 複数の円を書くプログラム
 * (角度を増やしていく版)
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class MultiCircle extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MultiCircle());
	}

	//タートルを動かす処理
	public void start(){
	
		int i;//ループ用1
		int j;//ループ用2
		
		int length;//1回に進む距離
		int angle;//1回に曲がる角度

		//円を10個書くためのループ		
		i = 1;
		while(i <= 10){
			angle = i;
			length = 1;

			//円を書くためのループ
			j = 1;
			while(j <= 360){
				fd(length);
				rt(angle);
				j = j + angle;
			}
			
			i = i + 1;
		}
		
	}
	
}