/**
 * アニメーションのサンプル
 *
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class AnimationSample extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new AnimationSample());
	}
  
  //タートルを動かす処理
	public void start() {
    
    int i;
    
    TextTurtle text = new TextTurtle("注目->");		
    
    TextTurtle number = new TextTurtle();
    number.warp(200, 100);
    
    ImageTurtle car = new ImageTurtle("car.gif");
    car.hide();
    
    i = 10;
    while (true) {
      //待つ
      sleep(1);
      
      //処理
      number.text(i);
      
      if (i == 3) {
        number.color(java.awt.Color.red);
      }
      
      if (i <= 0) {
        text.looks(car);
        number.text("ぼかーん!!");
      }
      
      i--;
      
      //再描画
      update();
    }
  }
  
}