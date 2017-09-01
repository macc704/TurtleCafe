/**
 * 「こんにちは」が回るプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class RotateText extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateText());
	}

  //タートルを動かす処理
	public void start() {

    //こんにちはを生成する
    TextTurtle hello = new TextTurtle("こんにちは");

    //アニメーションループ
    while (true) {

      //待つ
      sleep(0.1);

      //処理
      hello.rt(5);

      //再描画
      update();
    }
  }
  
}