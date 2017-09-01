/**
 * 車が回るプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class RotateCar extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateCar());
	}

  //タートルを動かす処理
	public void start() {

    //車を生成する
    ImageTurtle car = new ImageTurtle("car.gif");

    //アニメーションループ
    while (true) {

      //待つ
      sleep(0.1);

      //処理
      car.rt(5);

      //再描画
      update();
    }
  }
  
}