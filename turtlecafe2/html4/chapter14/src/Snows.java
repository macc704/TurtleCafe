/**
* プログラム名：hogehoge
* 作成者： Ken5
* 作成日： Thu Nov 17 11:06:28 JST 2011
*/
public class Snows extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Snows(), args);
	}
	
	
	//タートルを動かす処理
	public void start() {
		int numOfSnow = 10;
		int w = 400;
		int h = 300;
		
		window.setSize(w,h);
		window.canvas().setBackground(java.awt.Color.darkGray);
		hide();
		
		ListTurtle <Snow> snows = new ListTurtle<Snow>();
		ListTurtle <Snow> snowsStop = new ListTurtle<Snow>();
		snows.hide();
		snowsStop.hide();
		
		for(int i=0; i<numOfSnow; i++){
			double scale = (double)(random(20) + 0)/100;
			addSnow(snows, random(w), random(h), scale);
		}
		
		while(true){
			sleep(0.03);
			
			w = window.getWidth();
			
			for(int i=0; i < snows.getSize(); i++){
				
				//積もる　そして新しい雪作成
				if(snows.get(i).getY() > h
				&& snows.get(i).getScale() <= 0.2){	

					snowsStop.add(snows.get(i));
					addSnow(snows, random(w), 0, (double)(random(20) + 0)/100);
					continue;
				}
				
				//Y warp
				if(snows.get(i).getY() > h){					
					snows.get(i).warp(snows.get(i).getX(),0);
				}
				
				//X warp
				if(snows.get(i).getX() > w){
					snows.get(i).warp(0,snows.get(i).getY());	
				}
				
				//fall
				snows.get(i).warp(snows.get(i).getX() + (randomAngle() * random(3)), snows.get(i).getY() + random(2) + 1);			
				snows.get(i).rt(5);
				
			}
			
			update();
		}
	}
	
	private void addSnow(ListTurtle<Snow> snows,int w,int h,double scale){
		Snow snow = new Snow();
		
		snow.scale(scale);
		snow.setScale(scale);
		snow.warp(w,h);
		
		snows.add(snow);
		
	}
	
	private int randomAngle(){
		if(random(4) == 1){
			return -1;
		}
		else{
			return 1;
		}
	}

}																																			