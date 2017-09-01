/*
 * 家を書くプログラム
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class InvalidHouse extends Turtle{

	void start(){
	
		//屋根を書く
		rt(30);//30度右を向く
		fd(50);//50歩前に進む
		rt(120)
		fd(50);
		rt(120);
		fd(50);
		
		//本体を書く
		lt(90);
		fd(50);
		lt(90);
		fd(50);
		lt(90);
		fd(50);
	}
	
}