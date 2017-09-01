/**
 * 繰り返しを数えるカウンター
 * (文字とつなげる版)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class Counter2 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Counter2());
	}

  //タートルを動かす処理
	public void start() {

    int i;//ループをカウントする変数
    
    //カウンターを生成する
    TextTurtle counter = new TextTurtle("繰り返し数");

    i = 0;
    //アニメーションループ
    while (true) {

      //待つ
      sleep(0.1);

      //処理
      counter.text("現在の繰り返し数は" + i + "です。");
      i++;

      //再描画
      update();
    }
  }
  
}