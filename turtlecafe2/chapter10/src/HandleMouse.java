/**
 * マウスの位置に車が動くプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleMouse extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse());
	}
  
  //タートルを動かす処理
	public void start() {
    
    hide();//タートルを消す
    
    int mx;//マウスのx座標を入れておく変数
    int my;//マウスのy座標を入れておく変数
    
    //車を生成
    ImageTurtle car = new ImageTurtle("car.gif");
    
    while (true) {
      
      // --- 待つ ---
      sleep(0.1);
      
      // --- 処理 ---
      
      //車をマウスの位置に移動
      mx = mouseX();//マウスのx座標を取得する
      my = mouseY();//マウスのy座標を取得する
      car.warp(mx, my);
      
      // --- 再描画 ---
      update();
    }
    
  }
  
}