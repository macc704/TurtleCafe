/*
 * 入力された番号の絵を書くプログラム
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class Condition extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Condition());
	}

	//タートルを動かす処理
	public void start() {

		int pictureNumber;//絵の番号
		
		print("書きたい絵の番号を入力してください。(1.家, 2.星)");
		pictureNumber = input();

		if(pictureNumber == 1){//入力された番号が1ならば家を書く
						
			int length;//1辺の長さ
			int rightAngle;//直角
		
			length = 50;//1辺の長さを50に設定する
			rightAngle = 90;//直角を90度に設定する
		
			//屋根を書く
			rt(30); //30度右に回る
			fd(length); //x歩前に進む
			rt(120);
			fd(length);
			rt(120);
			fd(length);

			//本体を書く
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			
		} else {//入力された番号が1以外ならば星を書く

			int length;//1辺の長さ
			int angle;//星を書くときに曲がる角度
			
			length = 100;//1辺の長さを100に設定する
			angle = 144;//曲がる角度を144度に設定する
			
			//星を書く
			rt(18);
			fd(length);
			rt(angle);
			fd(length);
			rt(angle);
			fd(length);
			rt(angle);
			fd(length);
			rt(angle);
			fd(length);
			
		}
		
	}

}