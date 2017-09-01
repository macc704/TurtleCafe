/*
 * 家を書くプログラム(繰り返し)
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class WhileHouse extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WhileHouse());
	}

	//タートルを動かす処理
	public void start(){
	
		int i;//ループ用変数
		
		//屋根を書く
		rt(30);
		i = 1;
		while(i <= 3){
			fd(50);
			rt(120);
			i = i + 1;
		}
		lt(30);//上向きに戻す
		
		//本体を書く
		i = 1;
		while(i <= 4){
			rt(90);
			fd(50);
			i = i + 1;
		}
		
	}
	
}