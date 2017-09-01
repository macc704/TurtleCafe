/*
 * グーを書くプログラム
 *
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class Goo extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Goo());
	}
  
  //タートルを動かす処理
	public void start() {
    
    fd(30);
    
    lt(30);
    fd(25);
    rt(60);
    fd(25);
    rt(150);
    fd(30);
    lt(180);
    fd(20);
    
    fd(20);
    rt(90);
    fd(20);
    rt(90);
    fd(20);
    lt(90);
    fd(5);
    
    lt(90);
    fd(20);
    rt(90);
    fd(20);
    rt(90);
    fd(20);
    lt(90);
    fd(5);
    
    lt(90);
    fd(20);
    rt(90);
    fd(20);
    rt(90);
    fd(20);
    lt(90);
    fd(5);
    
    lt(90);			
    fd(20);
    rt(90);
    fd(20);
    rt(90);
    fd(20);
    
    fd(65);
    
		
  }
  
}