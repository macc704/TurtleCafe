/**
 * プログラム名：
 * 作成者： 
 * 作成日： Mon Oct 29 16:54:59 JST 2012
 */
public class Hurdling extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Hurdling());
	}

	//タートルを動かす処理
	public void start() {
		hide();
		
		// ハードルを作成
		Hurdle hurdle = new Hurdle();
		hurdle.warp(200,230);
		
		// 人間を作成
		Person person = new Person();	
		person.warp(50,200);
		int x = 50;
		int y = 200;
		
		// ハードル走ループ
		while(true){
			sleep(0.1);
			
			x = person.getX();
			y = person.getY();
			
			x += 5;
			if(140<=x && x<200){
				y = y-10;
				//person.rt(15);
			}else if(200<=x && x<260){
				y = y+10;
				//person.rt(15);
			}
			person.warp(x,y);

			if(person.getX()>350){
				person.warp(50,y);
			}
			
			update();
		}
	}

}																																																