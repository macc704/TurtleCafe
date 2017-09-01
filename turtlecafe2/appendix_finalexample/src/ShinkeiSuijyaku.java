/**
* プログラム名：カードゲーム(神経衰弱)
* 作成者： Uchiyama Yuki
* 作成日： Sun Jan 06 21:13:19 JST 2008
*/
public class ShinkeiSuijyaku extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ShinkeiSuijyaku());
	}
	
	//タートルを動かす処理
	public void start() {
		//ウインドウサイズ	
		window.size(400,450);

		hide();
		start2();
		take1();	
		//表カードの準備
		ImageTurtle cardA = new ImageTurtle("cardA.gif");
		ImageTurtle cardB = new ImageTurtle("cardB.gif");
		ImageTurtle cardC = new ImageTurtle("cardC.gif");
		ImageTurtle cardD = new ImageTurtle("cardD.gif");
		cardA.hide();
		cardB.hide();	
		cardC.hide();
		cardD.hide();
		//裏カードの準備
		ImageTurtle cardura = new ImageTurtle("cardura.gif");
		ImageTurtle cardura2 = new ImageTurtle("cardura.gif");
		ImageTurtle cardura3 = new ImageTurtle("cardura.gif");
		ImageTurtle cardura4 = new ImageTurtle("cardura.gif");
		ImageTurtle cardura5 = new ImageTurtle("cardura.gif");
		ImageTurtle cardura6 = new ImageTurtle("cardura.gif");
		ImageTurtle cardura7 = new ImageTurtle("cardura.gif");
		ImageTurtle cardura8 = new ImageTurtle("cardura.gif");
		cardura2.warp(150,100);	
		cardura3.warp(100,150);
		cardura4.warp(150,150);
		cardura5.warp(100,200);
		cardura6.warp(150,200);
		cardura7.warp(100,250);
		cardura8.warp(150,250);

		
		//正解画面
		ImageTurtle right = new ImageTurtle("right.gif");
		right.hide();
		//不正解画面
		ImageTurtle falsh = new ImageTurtle("falsh.gif");	
		falsh.hide();		
		//長ったらしい定義の数々･･･		
		int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,x7,y7,x8,y8;
		int A = 0;
		int B = 3;	
		int C;
		//手を生成
		ImageTurtle hand = new ImageTurtle("hand.gif");
		hand.hide();
		while(A <= B){
			int i = 0;//繰りかえし用
			hand.hide();
			while (i <= 50){
				sleep(0.1);
				x1 = cardura.getX();
				y1 = cardura.getY();
				x2 = cardura2.getX();
				y2 = cardura2.getY();
				x3 = cardura3.getX();
				y3 = cardura3.getY();
				x4 = cardura4.getX();
				y4 = cardura4.getY();
				x5 = cardura5.getX();
				y5 = cardura5.getY();
				x6 = cardura6.getX();
				y6 = cardura6.getY();
				x7 = cardura7.getX();
				y7 = cardura7.getY();
				x8 = cardura8.getX();
				y8 = cardura8.getY();
				//ランダム移動
				int FC = random(20);			
				int SC = random(20);
				int ed = random(20);
				int th = random(20);
				
				int FC2 = random(20);			
				int SC2 = random(20);
				int ed2 = random(20);
				int th2 = random(20);
				
				int FC3 = random(20);			
				int SC3 = random(20);
				int ed3 = random(20);
				int th3 = random(20);
				
				int FC4 = random(20);			
				int SC4 = random(20);
				int ed4 = random(20);
				int th4 = random(20);
				
				int FC5 = random(20);			
				int SC5 = random(20);
				int ed5 = random(20);
				int th5 = random(20);
				
				int FC6 = random(20);			
				int SC6 = random(20);
				int ed6 = random(20);
				int th6 = random(20);
				
				int FC7 = random(20);			
				int SC7 = random(20);
				int ed7 = random(20);
				int th7 = random(20);
				
				int FC8 = random(20);			
				int SC8 = random(20);
				int ed8 = random(20);
				int th8 = random(20);
				
				cardura.warp(x1+FC-ed,y1+SC-th);
				cardura2.warp(x2+FC2-ed2,y2+SC2-th2);
				cardura3.warp(x3+FC3-ed3,y3+SC3-th3);
				cardura4.warp(x4+FC4-ed4,y4+SC4-th4);
				cardura5.warp(x5+FC5-ed5,y5+SC5-th5);
				cardura6.warp(x6+FC6-ed6,y6+SC6-th6);
				cardura7.warp(x7+FC7-ed7,y7+SC7-th7);
				cardura8.warp(x8+FC8-ed8,y8+SC8-th8);
				
				if (x1 >= 400){
					cardura.warp(390,y1);
				}
				if(y1 >= 400){
					cardura.warp(x1,390);
				}
				if (x1 <=0){
					cardura.warp(10,y1);
				}
				if(y1 <=0){
					cardura.warp(x1,10);
				}
				if (x2 >= 400){
					cardura2.warp(390,y2);
				}
				if(y2 >= 400){
					cardura2.warp(x2,390);
				}
				if (x2 <=0){
					cardura2.warp(10,y2);
				}
				if(y2 <=0){
					cardura2.warp(x2,10);
				}
				if (x3 >= 400){
					cardura3.warp(390,y3);
				}
				if(y3 >= 400){
					cardura3.warp(x3,390);
				}
				if (x3 <=0){
					cardura3.warp(10,y3);
				}
				if(y3 <=0){
					cardura3.warp(x3,10);
				}
				if (x4 >= 400){
					cardura4.warp(390,y4);
				}
				if(y4 >= 400){
					cardura4.warp(x4,390);
				}
				if (x4 <=0){
					cardura4.warp(10,y4);
				}
				if(y4 <=0){
					cardura4.warp(x4,10);
				}
				if(x5 >= 400){
					cardura5.warp(390,y5);
				}
				if(y5 >= 400){
					cardura5.warp(x5,390);
				}
				if (x5 <=0){
					cardura5.warp(10,y5);
				}
				if(y5 <=0){
					cardura5.warp(x5,10);
				}
				if (x6 >= 400){
					cardura6.warp(390,y6);
				}
				if(y6 >= 400){
					cardura6.warp(x6,390);
				}
				if (x6 <=0){
					cardura6.warp(10,y6);
				}
				if(y6 <=0){
					cardura6.warp(x6,10);
				}
				if (x7 >= 400){
					cardura7.warp(390,y7);
				}
				if(y7 >= 400){
					cardura7.warp(x7,390);
				}
				if (x7 <=0){
					cardura7.warp(10,y7);
				}
				if(y7 <=0){
					cardura7.warp(x7,10);
				}
				if (x8 >= 400){
					cardura8.warp(390,y8);
				}
				if(y8 >= 400){
					cardura8.warp(x8,390);
				}
				if (x8 <=0){
					cardura8.warp(10,y8);
				}
				if(y8 <=0){
					cardura8.warp(x8,10);
				}
				i++;
				update();
			}
			int mx;//マウスのｘ座標を入れておく変数
			int my;//マウスのｙ座標を入れておく変数
			
			//回数制限
			int kaisuuseigen = 0;	
			int kaisuuseigen2 = 0;
			int kaisuuseigen3 = 0;
			int kaisuuseigen4 = 0;
			int kaisuuseigen5 = 0;
			int kaisuuseigen6 = 0;
			int kaisuuseigen7 = 0;
			int kaisuuseigen8 = 0;
			//照らし合わせ
			int terasiawase =0;	
			
			right.warp(1000,1000);
			right.hide();
			falsh.warp(1000,1200);
			falsh.hide();
			C = 0;
			while (C < 1){
				//待つ
				sleep(0.03);
				//処理
				hand.show();
				//手をマウスの位置に移動
				mx = mouseX();//マウスのｘ座標を取得
				my = mouseY();//マウスのｙ座標を取得
				hand.warp(mx,my);
				update();
				
				if(kaisuuseigen + kaisuuseigen2 + kaisuuseigen3 + kaisuuseigen4 + kaisuuseigen5 + kaisuuseigen6 + kaisuuseigen7 + kaisuuseigen8 <= 1){
					if(cardura.intersects(hand)){
						if(kaisuuseigen == 0){
							cardura.looks(cardA);
							update();	
							kaisuuseigen++;
							terasiawase = terasiawase + 1;	
						}		
					}
					
					if(cardura2.intersects(hand)){
						if(kaisuuseigen2 == 0){
							cardura2.looks(cardA);
							update();	
							kaisuuseigen2++;		
							terasiawase = terasiawase + 10;
						}		
					}
					
					if(cardura3.intersects(hand)){
						if(kaisuuseigen3 == 0){
							cardura3.looks(cardB);
							update();
							kaisuuseigen3++;
							terasiawase = terasiawase + 100;			
						}
					}
					
					if(cardura4.intersects(hand)){
						if(kaisuuseigen4 == 0){
							cardura4.looks(cardB);
							update();			
							kaisuuseigen4++;
							terasiawase = terasiawase + 1000;					
						}
					}
					
					if(cardura5.intersects(hand)){
						if(kaisuuseigen5 == 0){
							cardura5.looks(cardC);
							update();
							kaisuuseigen5++;			
							terasiawase = terasiawase + 10000;					
						}			
					}
					
					if(cardura6.intersects(hand)){
						if(kaisuuseigen6 == 0){
							cardura6.looks(cardC);
							update();
							kaisuuseigen6++;			
							terasiawase = terasiawase + 100000;					
						}	
					}
					
					if(cardura7.intersects(hand)){
						if(kaisuuseigen7 == 0){
							cardura7.looks(cardD);
							update();
							kaisuuseigen7++;			
							terasiawase = terasiawase + 1000000;					
						}	
					}
					
					if(cardura8.intersects(hand)){
						if(kaisuuseigen8 == 0){
							cardura8.looks(cardD);
							update();			
							kaisuuseigen8++;
							terasiawase = terasiawase + 10000000;					
						}	
					}				
				} else {
					if(terasiawase == 11 || terasiawase == 1100 || terasiawase == 110000 || terasiawase == 11000000){
						right.warp(200,450);
						right.show();
						sleep(1);
						if(terasiawase == 11){
							cardura.hide();
							cardura2.hide();
						}						
						if(terasiawase == 1100){
							cardura3.hide();
							cardura4.hide();
						}		
						if(terasiawase == 110000){
							cardura5.hide();
							cardura6.hide();
						}		
						if(terasiawase == 11000000){
							cardura7.hide();
							cardura8.hide();
						}	
						A++;
						C++;
					} else {
						falsh.warp(200,450);
						falsh.show();		
						sleep(1);						
						cardura.looks(cardura);
						cardura2.looks(cardura);
						cardura3.looks(cardura);
						cardura4.looks(cardura);
						cardura5.looks(cardura);
						cardura6.looks(cardura);
						cardura7.looks(cardura);
						cardura8.looks(cardura);
						C++;			
					} 					
				}
			}	
		}
		sleep(1.5);
		right.hide();
		hand.hide();
		finish();						
	}
	
	void take1(){
		ImageTurtle field = new ImageTurtle("field.gif");
		field.warp(200,200);
	}
	
	void start2(){
		ImageTurtle syousi = new ImageTurtle("title.gif");
		syousi.warp(200,200);
		TextTurtle gamestart = new TextTurtle("G a m e S t a r t               P l e a s e L e f t C l i c k ");
		gamestart.warp(200,300);
		gamestart.size(300,100);
		update();
		while(true){			
			sleep(0.1);
			//左マウスボタンが押されたら
			if (leftMouseDown()) {
				break;
			}
			//右マウスボタン
			if (rightMouseDown()) {
				ImageTurtle howto = new ImageTurtle("howto.gif");			
				howto.warp(200,200);
				update();	
			}
		}
	}
	
	void finish(){
		ImageTurtle last = new ImageTurtle("last.gif");
		last.warp(200,200);
		update();
	}
}