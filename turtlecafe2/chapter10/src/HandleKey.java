/**
 * キーに対応して車が動くプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class HandleKey extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKey());
	}
  
  //タートルを動かす処理
	public void start() {

    hide();//タートルを消す
    
    int keycode;//キー番号を入れておく変数
    int x;//x座標を入れておく変数
    int y;//y座標を入れておく変数
		
    //車を生成
    ImageTurtle car = new ImageTurtle("car.gif");
    
    while (true) {
      
      // --- 待つ ---
      sleep(0.1);
      
      // --- 処理 ---
      
      //今押されているキーを取得する
      keycode = key();
      
      //車が今いる位置を取得する
      x = car.getX();
      y = car.getY();
      
      //上下左右キーが押されていたら，車を動かす
      if (keycode == 37) { //左
        car.warp(x - 5, y);
      } else if (keycode == 38) { //上
        car.warp(x, y - 5);
      } else if (keycode == 39) { //右
        car.warp(x + 5, y);
      } else if (keycode == 40) { //下
        car.warp(x, y + 5);
      }
      
      // --- 再描画 ---
      update();
    }
  }
  
}