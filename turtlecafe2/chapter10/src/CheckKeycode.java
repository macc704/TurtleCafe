/**
 * キー番号を調べるプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/23
 */
public class CheckKeycode extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new CheckKeycode());
	}
  
  //タートルを動かす処理
	public void start() {

    hide();//タートルを消す
    
    int keycode;//キー番号を入れておく変数
    
    //文字(太郎)を生成
    TextTurtle taro = new TextTurtle();
    
    while (true) {
      
      // --- 待つ ---
      sleep(0.1);
      
      // --- 処理 ---
      
      //今押されているキーを取得する
      keycode = key();
      
      //押されているキー番号を文字にして表示する
      taro.text(keycode);
      
      // --- 再描画 ---
      update();
    }
  }
  
}