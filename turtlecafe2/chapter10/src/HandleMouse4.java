/**
 * マウスの押した位置に車が動くプログラム
 * (右クリック，左クリック判定版)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse4 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse4());
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
      
      //もし，左マウスボタンが押されていたら，
      if (leftMouseDown()) {
        car.warp(mouseX(), mouseY());//車をマウスの位置に移動
      }
      //もし，右マウスボタンがダブルクリックされたら，
      if (rightMouseDown() && doubleClick()) {
        car.show(!car.isShow());//車を(現す/隠す)
      }
      
      // --- 再描画 ---
      update();
    }
    
  }
  
}