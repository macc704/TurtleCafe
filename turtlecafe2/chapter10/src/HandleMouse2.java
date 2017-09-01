/**
 * マウスの位置に車が動くプログラム
 * (変数省略版)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse2 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse2());
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
      
      //車をマウスの位置に移動
      car.warp(mouseX(), mouseY());
      
      // --- 再描画 ---
      update();
    }
    
  }
  
}