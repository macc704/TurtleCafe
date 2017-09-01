/**
 * あたり判定をするプログラム
 * (車がドラえもんにあたると，ドラえもんが小さくなる)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class IntersectsJudge extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new IntersectsJudge());
	}
  
  //タートルを動かす処理
	public void start() {
    
    hide();//タートルを消す
    
    //車を生成
    ImageTurtle car = new ImageTurtle("car.gif");
    //doraという名前のドラえもんを生成
    Doraemon dora = new Doraemon();

    car.warp(200, 200);//車を移動
    
    while (true) {
      
      // --- 待つ ---
      sleep(0.1);
      
      // --- 処理 ---
      
      //もし，マウスが押されていたら，
      if (mouseDown()) {
        car.warp(mouseX(), mouseY());//車をマウスの位置に移動
      }

      //もし，どらえもんが車に当たっていたら
      if (dora.intersects(car)){
        dora.small(5);//ドラえもんを小さくする
      }
      
      // --- 再描画 ---
      update();
    }
    
  }
  
}