/**
 * マウスのあたり判定をするプログラム
 * (マウスが車にあたると，車が小さくなる)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class ContainsJudge extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ContainsJudge());
	}
  
  //タートルを動かす処理
	public void start() {
    
    hide();//タートルを消す
    
    //車を生成
    ImageTurtle car = new ImageTurtle("car.gif");
    
    while (true) {
      
      // --- 待つ ---
      sleep(0.1);
      
      // --- 処理 ---

      //もし，車がマウスの位置に含まれていたら
      if (car.contains(mouseX(), mouseY())){
        car.small(5);//車を小さくする
      }
      
      // --- 再描画 ---
      update();
    }
    
  }
  
}