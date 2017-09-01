/**
 * じゃんけんアニメーションプログラム
 * 
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class JankenAnimation extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new JankenAnimation());
	}
  
  //タートルを動かす処理
	public void start() {
    
    int i; //ループ用の変数
    
    Goo g = new Goo();
    Choki c = new Choki();
    Paa p = new Paa();
    
    g.warp(100,100);
    c.warp(200,100);
    p.warp(300,100);
    
    i = 0;
    while (true) {
      
      sleep(0.5);
      
      //繰り返した数に応じてグーの見た目を変える
      if(i % 3 == 0){
        g.looks(g);
      }
      else if(i % 3 == 1){
        g.looks(c);
      }
      else{
        g.looks(p);
      }
      
      update();
      i++;
    }
  }
  
}