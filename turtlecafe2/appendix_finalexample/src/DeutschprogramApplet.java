/**
* DeutschprogramApplet.java
* 
* @author MegumiAraki
* @version 2008/05/26 13:58:38
*/

/**
 * プログラム名： 
 * 作成者： 
 * バージョン： 1.0 (日付) 
 */
public class DeutschprogramApplet extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DeutschprogramApplet());
	}

	//タートルを動かす処理
	public void start() {
		Turtle.window.split.setDividerLocation(25);
		int lektion;
		
		print("これからドイツ語ワークプログラム/MODELLE2を開始します");
		print("問題は各ＬＥＫＴＩＯＮごとに分かれており、全て並び替え問題です");
		print("正しい順番に単語を並びかえ、並びかえた単語の先頭についている数字を順番に半角で入力してください");
		print("ウムラウトは旧式で表されているので注意してください");
		print("学習したいＬＥＫＴＩＯＮの数字（１から１2まで）を入力してください");
		lektion = input();
		
		if (lektion == 1) {
			lektion1( );							
		}
		if (lektion == 2) {
			lektion2( );							
		}
		if (lektion == 3) {
			lektion3( );							
		}
		if (lektion == 4) {
			lektion4( );							
		}
		if (lektion == 5) {
			lektion5( );							
		}
		if (lektion == 6) {
			lektion6( );							
		}
		if (lektion == 7) {
			lektion7( );							
		}
		if (lektion == 8) {
			lektion8( );							
		}
		if (lektion == 9) {
			lektion9( );							
		}
		if (lektion == 10) {
			lektion10( );							
		}				
		if (lektion == 11) {
			lektion11( );							
		}
		if (lektion == 12) {
			lektion12( );							
		}
		
		print("これでドイツ語ワークプログラム/MODELLE2を終了します");				
	}

	
	void lektion1( ){
		print("1sind 2meines 3Buecher 4die 5Das 6Bruders(これらの本は私の弟のです。)");
		int Answer11 = input();
		if 	(Answer11 == 514326){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Das sind die Buecher meines Bruders.");				
		}
		print("1heute 2Datum 3? 4ist 5Welches(今日は何月何日ですか？)");	
		int Answer12 = input();
		if 	(Answer12 == 52413){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Welches Datum ist heute?");				
		}	
		print("1Grossvater 2hat 3Das 4gehort 5meinem(これは私のおじいさんのものでした。)");	
		int Answer13 =input();
		if 	(Answer13 == 32514){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Das hat meinem Grossvater gehort.");				
		}							
	}
	void lektion2( ){
		print("1DWE 2arbeitete 3Mein 4bei 5Vater(私の父はDWEで働いていました。)");
		int Answer21 = input();
		if 	(Answer21 == 35241){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Meine Vater arbeitete bei DWE.");				
		}
		print("1kam 2Ich 3in 4Grundschule 5die(私は基礎学校に通っていました。)");	
		int Answer22 = input();
		if 	(Answer22 == 21354){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich kam in die Grundschule.");				
		}	
		print("1Japan 2arbeiten 3in 4wollte 5Ich(私は日本で働きたかった。)");	
		int Answer23 = input();
		if 	(Answer23 == 54312){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich wollte in Japan arbeiten.");				
		}
	}
	void lektion3( ){
		print("1du 2Tasche 3gesehen 4Hast 5? 6schwarze 7eine(黒い鞄を見ませんでしたか？)");
		int Answer31 = input();
		if 	(Answer31 == 4176235){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Hast du eine schwarze Tasche gesehen?");				
		}
		print("1zwei 2Buecher 3deutsche 4habe 5ausgeliehen 6Ich(私は２冊のドイツの本を借りました。)");	
		int Answer32 = input();
		if 	(Answer32 == 641325){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich habe zwei deutsche Buecher ausgeliehen.");				
		}	
		print("1da 2Ich 3dass 4liegt 5Tasche 6meine 7hoffe(そこに私のカバンがあることを願うよ。)");	
		int Answer33 = input();
		if 	(Answer33 == 2736514){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich hoffe, dass meine Tasche da liegt.");			
		}
	}
	void lektion4( ){
		print("1Kyoto 2Nara 3aelter 4ist 5als(奈良は京都よりも古い。)");
		int Answer41 = input();
		if 	(Answer41 == 24351){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Nara ist aelter als Kyoto. ");				
		}
		print("1hat 2Schrein 3Nikko 4den 5elegantesten(日光には素晴らしい寺があります。)");	
		int Answer42 = input();
		if 	(Answer42 == 31452){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Nikko hat den elegantesten Schrein.");				
		}	
		print("1am 2im 3Wetter 4Oktober 5Das 6ist 7besten(天気は１０月が一番良いです。)");	
		int Answer43 = input();
		if 	(Answer43 == 5362417){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Das Wetter ist im Oktober am besten.");		
		}
	}
	void lektion5( ){
		print("1los 2Was 3denn 4ist 5?(どうしたの？)");
		int Answer51 = input();
		if 	(Answer51 == 24315){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Was ist denn los?");				
		}
		print("1Ich 2nicht 3fuehle 4wohl 5mich(私は気分が良くない。)");	
		int Answer52 = input();
		if 	(Answer52 == 13524){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich fuehle mich nicht wohl.");				
		}	
		print("1ist 2kalt 3Mir (寒いなぁ。)");	
		int Answer53 = input();
		if 	(Answer53 ==312 ){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Mir ist kalt.");		
		}
	}
	void lektion6( ){
	
		print("1Lust 2mitzukommen 3? 4Hast 5du(一緒に来ない？)");
		int Answer61 = input();
		if 	(Answer61 == 45123){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Hast du Lust mitzukommen?");				
		}
		print("1habe 2verlaufen 3Ich 4mich(私は道に迷いました。)");	
		int Answer62 = input();
		if 	(Answer62 == 3142){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich habe mich verlaufen.");				
		}	
		print("1dir 2oft 3Das 4passiert(あなたにはよくあることね。)");	
		int Answer63 = input();
		if 	(Answer63 == 3412){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Das passiert dir oft.");		
		}
	}
	void lektion7( ){

		print("1mich 2beschaeftigt 3der 4mit 5Geschichte 6Ich 7lange 8japanischen 9habe (私は長い間日本の歴史に従事してきた。)");
		int Answer71 = input();
		if 	(Answer71 == 691743852){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich habe mich lange mit der japanischen Geschichte beschaeftigt.");				
		}
		print("1fuer 2Ich 3Musik 4klassische 5interessiere 6mich (私はクラシック音楽に興味があります。)");	
		int Answer72 = input();
		if 	(Answer72 == 256143){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich interessiere mich fuer klassische Musik.");				
		}	
		print("1Forschung 2um 3bin 4nach 5fortzusetzen 6Fukuoka 7meine 8gekommen 9Ich(私は自分の研究を続けるため、福岡に行きます。)");	
		int Answer73 = input();
		if 	(Answer73 == 934682715){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich bin nach Fukuoka gekommen, um meine Forschung fortzusetzen.");		
		}
	}
	void lektion8( ){
		
		print("1gelesen 2Seine 3heute 4werden 5viel 6Buecher 7noch (彼の本は今日もよく読まれています。)");
		int Answer81 = input();
		if 	(Answer81 == 2643751){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Seine Buecher werden heute noch viel gelesen.");				
		}
		print("1Keio-Universitaet  2Yukichi Fukuzawa 3von 4Die 5gegruendet 6wurde (慶應大学は福沢諭吉によって創設されました。)");	
		int Answer82 = input();
		if 	(Answer82 == 416325){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Die Keio-Universitaet wurde von Yukichi Fukuzawa gegruendet.");				
		}	
		print("1Wissenschaftler 2der 3Er 4fuehrenden 5einer 6war (彼は有名な学者の一人でした。)");	
		int Answer83 =input();
		if 	(Answer83 == 365241){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Er war einer der fuehrenden Wissenschaftler.");		
		}
	}
	void lektion9( ){
		print("1Frau 2liebe 3will 4die 5Ich 6wirklich 7eine 8heiraten 9ich (私は本当に愛している女性と結婚するつもりだ。)");
		int Answer91 = input();
		if 	(Answer91 == 537184962){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich will eine Frau heiraten, die ich wirklich liebe.");				
		}
		print("1der 2Roman 3wurde 4ist 5Das 6von 7Ogai Mori 8ein 9geschrieben (これは森鴎外によって書かれた小説です。)");	
		int Answer92 = input();
		if 	(Answer92 == 548216793){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Das ist ein Roman, der von Ogai Mori geschrieben wurde.");				
		}	
		print("1? 2es 3Worum 4geht 5denn(何が問題なの？)");	
		int Answer93 = input();
		if 	(Answer93 == 34251){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Worum geht es denn?");			
		}
	}
	void lektion10( ){

		print("1ich 2um 3bitten 4Sie 5Duerfte 6Gefallen 7einen 8?(あなたに頼みごとをしてもよろしいでしょうか？)");
		int Answer101 = input();
		if 	(Answer101 == 51427638){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Duerfte ich Sie um einen Gefallen bitten?");				
		}
		print("1wollen 2dass 3nett 4helfen 5ist 6Sie 7Es 8mir (私を助けてくれるとありがたいのですが。)");	
		int Answer102 = input();
		if 	(Answer102 == 75326841){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Es ist nett, dass Sie mir helfen wollen.");				
		}	
		print("1mal 2Sie 3mich 4Lassen 5sehen(見せてごらんなさい。)");	
		int Answer103 = input();
		if 	(Answer103 == 42315){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Lassen Sie mich mal sehen.");			
		}
	}
	void lektion11( ){
		print("1Stelle 2mitnehmen 3Laptop 4wuerde 5keinen 6Ihrer 7ich 8An (私があなたの立場だったらラップトップは持って行かないでしょう。)");
		int Answer111 = input();
		if 	(Answer111 == 86147532){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は An Ihrer Stelle wuerde ich keinen Laptop mitnehmen.");				
		}
		print("1Handy 2Ohne 3nicht 4Internet 5ins 6Sie 7koennten (どの携帯電話もインターネットにはつながらない。)");	
		int Answer112 = input();
		if 	(Answer112 == 2176354){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ohne Handy koennten Sie nicht ins Internet.");				
		}	
		print("1Generator 2dabei 3muesste 4haben 5einen 6Ich (私は発電機を持ち合わせなければいけないでしょう。)");	
		int Answer113 = input();
		if 	(Answer113 == 635124){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich muesste einen Generator dabei haben.");			
		}
	}
	void lektion12( ){

		print("1Auto 2der 3dass 4Ich 5Meinung 6ist 7das 8praktischer 9bin (私は車がより便利だと思います。)");
		int Answer121 = input();
		if 	(Answer121 == 492537186){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich bin der Meinung, dass das Auto praktischer ist.");				
		}
		print("1die 2nicht 3bin 4gegen 5Technik 6Ich (私は、技術に反対というわけではない。)");	
		int Answer122 = input();
		if 	(Answer122 == 632415){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Ich bin nicht gegen die Technik.");				
		}	
		print("1halten 2Was 3Ihrer 4? 5Uni 6Sie 7von (あなたの大学についてどう思いますか？)");	
		int Answer123 = input();
		if 	(Answer123 == 2167354){
			print("Richtig!!!");				
		}
		else{
			print("×　正解は Was halten Sie von Ihrer Uni?");		
		}
	}
}
