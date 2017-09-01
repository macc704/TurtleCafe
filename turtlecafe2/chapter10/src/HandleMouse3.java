/**
 * マウスの押した位置に車が動くプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse3 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse3());
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
      
      //もし，マウスが押されていたら，
      if (mouseDown()) {
        car.warp(mouseX(), mouseY());//車をマウスの位置に移動
      }
      
      // --- 再描画 ---
      update();
    }
    
  }
  
}