/**
* プログラム名：
* 作成者： 
* 作成日： Mon Jan 07 02:13:20 JST 2008
*/
public class Shiritori2 extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Shiritori2());
	}
	
	//タートルを動かす処理
	public void start() {
		window.size(800,350);
		
		//しりとりゲーム開始合図
		TextTurtle text = new TextTurtle("３文字しりとりです。単語の最後に「ん」が着いたら負けです。");
		TextTurtle text2 = new TextTurtle("濁点や半濁点のつくものもが最後になる単語も入力しないでください。");
		TextTurtle text3 = new TextTurtle("１つの枠に１つずつ文字を入力してください。枠を切り替えるにはスペースを押してください");
		text.warp(500,180);
		text2.warp(500,210);
		text3.warp(500,240);
		text.fontsize(14);
		text2.fontsize(14);
		text3.fontsize(14);
		
		//入力ボックス
		InputTurtle input = new InputTurtle();
		input.warp(30, 30);
		
		InputTurtle input2 = new InputTurtle();
		input2.warp(30, 50);
		input2.setActive(false);
		
		InputTurtle input3 = new InputTurtle();
		input3.warp(30, 70);
		input3.setActive(false);
		
		input.toJapaneseMode();
		input2.toJapaneseMode();
		input3.toJapaneseMode();
		
		while(true){
			
			sleep(0.025);
			
			
			
			//きりかえ
			if (key() == 32) {//スペースを押したら
				if (input.isActive()) {
					input.setActive(false);
					input2.setActive(true);
					input3.setActive(false);
					
					
				} else if (input2.isActive()) {
					input.setActive(false);
					input2.setActive(false);
					input3.setActive(true);
					
					
				}else if(input3.isActive()){
					input.setActive(true);
					input2.setActive(false);
					input3.setActive(false);
					
					
				}
			}
			
			//入力タートルから表示	
			if (key() == 10){	
				text.text(input3.text());
			}	
			

			
			
			//相手の単語の最後の文字による場合分け
			if (input3.text().equals("あ")){
				text.text("あいす");	

			}else if(input3.text().equals("い")){
				
				text.text("いんこ");
			}else if(input3.text().equals("う")){
				
				text.text("うちわ");
			}else if(input3.text().equals("え")){
			
				text.text("えのき");
			}else if(input3.text().equals("お")){
				
				text.text("おかし");		
			}else if(input3.text().equals("か")){
				
				text.text("かかし");
			}else if(input3.text().equals("き")){
				
				text.text("きのこ");
			}else if(input3.text().equals("く")){
				
				text.text("くるみ");
			}else if(input3.text().equals("け")){
				
				text.text("けしき");
			}else if(input3.text().equals("こ")){
				
				text.text("こけし");
			}else if(input3.text().equals("さ")){
			
				text.text("さくら");
			}else if(input3.text().equals("し")){
				
				text.text("しはつ");
			}else if(input3.text().equals("す")){
				
				text.text("すいか");
			}else if(input3.text().equals("せ")){
				
				text.text("せなか");
			}else if(input3.text().equals("そ")){
				
				text.text("そうり");
			}else if(input3.text().equals("た")){
				
				text.text("たばこ");
			}else if(input3.text().equals("ち")){
				
				text.text("ちこく");
			}else if(input3.text().equals("つ")){
				
				text.text("つみき");
			}else if(input3.text().equals("て")){
				
				text.text("ていき");
			}else if(input3.text().equals("と")){
				
				text.text("とけい");
			}else if(input3.text().equals("な")){
				
				text.text("なみき");
			}else if(input3.text().equals("に")){
			
				text.text("にくや");
			}else if(input3.text().equals("ぬ")){
				
				text.text("ぬまち");
			}else if(input3.text().equals("ね")){
				
				text.text("ねずみ");
			}else if(input3.text().equals("の")){
			
				text.text("のやま");
			}else if(input3.text().equals("は")){
				
				text.text("はがき");
			}else if(input3.text().equals("ひ")){
				
				text.text("ひんと");
			}else if(input3.text().equals("ふ")){
			
				text.text("ふらの");
			}else if(input3.text().equals("へ")){
				text.text("へいわ");
			}else if(input3.text().equals("ほ")){
				
				text.text("ほてる");		
			}else if(input3.text().equals("ま")){
				
				text.text("まんと");
			}else if(input3.text().equals("み")){
				
				text.text("みんと");
			}else if(input3.text().equals("む")){
				
				text.text("むすこ");
			}else if(input3.text().equals("め")){
				
				text.text("めだか");
			}else if(input3.text().equals("も")){
				
				text.text("もづく");
			}else if(input3.text().equals("や")){
				text.text("やたい");
			}else if(input3.text().equals("ゆ")){
				text.text("ゆうき");
			}else if(input3.text().equals("よ")){
				text.text("よやく");
			}else if(input3.text().equals("ら")){
				text.text("らじお");
			}else if(input3.text().equals("り")){
				text.text("りずむ");
			}else if(input3.text().equals("る")){
				text.text("るみね");
			}else if(input3.text().equals("れ")){
				text.text("れきし");
			}else if(input3.text().equals("ろ")){
				text.text("ろしあ");
			}else if(input3.text().equals("わ")){
				text.text("わんこ");
			}else if(input3.text().equals("ん")){
				text.text(	"残念！あなたの負けです。");
				//終了の合図
				
			}


			update();
		}
}}