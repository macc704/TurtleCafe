/**
 * 車を点滅させるプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class OnAndOffCar extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new OnAndOffCar());
	}

  //タートルを動かす処理
	public void start() {

    int i;//ループカウンタ
    
    //車を生成する
    ImageTurtle car = new ImageTurtle("car.gif");

    //アニメーションループ
    i = 0;
    while (true) {

      //待つ
      sleep(0.2);

      //処理
      if(i % 2 == 0){//偶数だったら
        car.show();
      }else{//偶数ではなかったら(奇数だったら)
        car.hide();
      }
      i++;
      
      //再描画
      update();

    }
  }

}