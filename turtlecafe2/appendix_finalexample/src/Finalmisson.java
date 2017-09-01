/**
* プログラム名：Finalmisson
* 作成者： 菅　孝彰
* 作成日： Wed Jan 02 14:38:20 JST 2008
*/
public class Finalmisson extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Finalmisson());
	}
	ButtonTurtle startButton;
	ButtonTurtle resetButton;
	
	ButtonTurtle upButton;
	ButtonTurtle downButton;
	ButtonTurtle shootButton;
	
	//タートルを動かす処理
	public void start() {
		hide();
		Turtle.window.size(1000,500);
		
		ImageTurtle bg = new ImageTurtle("bg.gif");	
		ImageTurtle bomb=new ImageTurtle("bomb.gif");
		ImageTurtle flame=new ImageTurtle("flame.gif");
		ImageTurtle gozira=new ImageTurtle("gozira.gif");
		ImageTurtle player=new ImageTurtle("player.gif");
		ImageTurtle damage=new ImageTurtle("damage.gif");
		ImageTurtle hitend=new ImageTurtle("hitend.gif");
		
		startButton=new ButtonTurtle("START");
		resetButton=new ButtonTurtle("RESET");
		upButton=new ButtonTurtle("UP");
		downButton=new ButtonTurtle("DOWN");
		shootButton=new ButtonTurtle("SHOOT!");
		
		bg.warp(500,100);
		startButton.warp(100,20);
		resetButton.warp(100,50);
		upButton.warp(684,20);
		downButton.warp(700,50);
		shootButton.warp(800,20);
		
		
		TextTurtle gameover = new TextTurtle("GAMEOVER");
		TextTurtle clear = new TextTurtle("CLEAR!!");
		TextTurtle scoreBoard = new TextTurtle(); 
		TextTurtle scoretxt = new TextTurtle("SCORE"); 
		
		gameover.warp(-1000,-1000);
		clear.warp(-1100,-1100);
		gozira.warp(100,300);
		player.warp(900,300);
		bomb.warp(-200,-200);
		flame.warp(-200,-300);
		damage.warp(-300,300);
		hitend.warp(-600,-600);
		scoreBoard.warp(400, 50);
		scoretxt.warp(400,25);
		scoretxt.fontsize(15);
	
		
		int score;
		int x;
		int y;
		
		score = 0;
		while (true){
			sleep(0.05);
			
			flame.warp(flame.x()+10,flame.y());
			
			
			if(900<flame.x()&&300==flame.y()){
				flame.warp(200,200);
			}	
			if(900<flame.x()&&200==flame.y()){
				flame.warp(200,400);
			}		
			if(900<flame.x()&&400==flame.y()){
				flame.warp(200,300);
			}	
			
			
			if (upButton.isClicked()){
				player.rt(360);
				player.fd(50);
				player.lt(360);
			}
			if (downButton.isClicked()){
				player.lt(180);
				player.fd(50);
				player.rt(180);
			}	
			if(startButton.isClicked()){
				flame.warp(200,300);	
				
			}
			if (resetButton.isClicked()){
				gozira.warp(100,300);
				player.warp(900,300);
				player.looks(player);
				gozira.looks(gozira);
				flame.warp(-200,-300);
				gameover.warp(-1000,-1000);
				clear.warp(-1000,-1000);
				score=0;
			}
			if  (shootButton.isClicked()){	
				bomb.warp(player.x()-70,player.y()+20);
				bomb.looks(bomb);
			}
			bomb.warp(bomb.x()-10,bomb.y());
			
			
			if (150>bomb.x()){
			bomb.warp(-200,-200);}
			
			
			if (flame.intersects(player)){
				player.looks(damage);
				flame.warp(-400,-400);
				bomb.warp(-500,-500);
				gameover.warp(450,200);
			}
			if (bomb.intersects(gozira)){
				score++;
			}
			scoreBoard.text(score); 
			
			if(30<score){
				clear.warp(450,200);
				gozira.looks(hitend);
				flame.warp(-400,-400);
				bomb.warp(-500,-500);
			}
			if (bomb.intersects(flame)){
				bomb.warp(-200,-200);
			}
			
			update();
			
		}
}}