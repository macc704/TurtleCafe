import java.util.*;

/**
* プログラム名：
* 作成者： 
* 作成日： Wed Jan 02 23:15:23 JST 2008
*/
public class Deutschprogram{
	//起動処理
	public static void main(String[] args) {
		Deutschprogram main = new Deutschprogram();
		main.run();
	}
	
	//メイン処理
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		int lektion;
		
		System.out.println("これからドイツ語ワークプログラム/MODELLE2を開始します");
		System.out.println("問題は各ＬＥＫＴＩＯＮごとに分かれており、全て並び替え問題です");
		System.out.println("正しい順番に単語を並びかえ、並びかえた単語の先頭についている数字を順番に半角で入力してください");
		System.out.println("ウムラウトは旧式で表されているので注意してください");
		System.out.println("学習したいＬＥＫＴＩＯＮの数字（１から１2まで）を入力してください");
		lektion = scanner.nextInt();
		
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
		
		System.out.println("これでドイツ語ワークプログラム/MODELLE2を終了します");				
	}
	
	void lektion1( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1sind 2meines 3Buecher 4die 5Das 6Bruders(これらの本は私の弟のです。)");
		int Answer11 = scanner.nextInt( );
		if 	(Answer11 == 514326){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Das sind die Buecher meines Bruders.");				
		}
		System.out.println("1heute 2Datum 3? 4ist 5Welches(今日は何月何日ですか？)");	
		int Answer12 = scanner.nextInt( );
		if 	(Answer12 == 52413){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Welches Datum ist heute?");				
		}	
		System.out.println("1Grossvater 2hat 3Das 4gehort 5meinem(これは私のおじいさんのものでした。)");	
		int Answer13 = scanner.nextInt( );
		if 	(Answer13 == 32514){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Das hat meinem Grossvater gehort.");				
		}							
	}
	void lektion2( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1DWE 2arbeitete 3Mein 4bei 5Vater(私の父はDWEで働いていました。)");
		int Answer21 = scanner.nextInt( );
		if 	(Answer21 == 35241){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Meine Vater arbeitete bei DWE.");				
		}
		System.out.println("1kam 2Ich 3in 4Grundschule 5die(私は基礎学校に通っていました。)");	
		int Answer22 = scanner.nextInt( );
		if 	(Answer22 == 21354){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich kam in die Grundschule.");				
		}	
		System.out.println("1Japan 2arbeiten 3in 4wollte 5Ich(私は日本で働きたかった。)");	
		int Answer23 = scanner.nextInt( );
		if 	(Answer23 == 54312){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich wollte in Japan arbeiten.");				
		}
	}
	void lektion3( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1du 2Tasche 3gesehen 4Hast 5? 6schwarze 7eine(黒い鞄を見ませんでしたか？)");
		int Answer31 = scanner.nextInt( );
		if 	(Answer31 == 4176235){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Hast du eine schwarze Tasche gesehen?");				
		}
		System.out.println("1zwei 2Buecher 3deutsche 4habe 5ausgeliehen 6Ich(私は２冊のドイツの本を借りました。)");	
		int Answer32 = scanner.nextInt( );
		if 	(Answer32 == 641325){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich habe zwei deutsche Buecher ausgeliehen.");				
		}	
		System.out.println("1da 2Ich 3dass 4liegt 5Tasche 6meine 7hoffe(そこに私のカバンがあることを願うよ。)");	
		int Answer33 = scanner.nextInt( );
		if 	(Answer33 == 2736514){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich hoffe, dass meine Tasche da liegt.");			
		}
	}
	void lektion4( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Kyoto 2Nara 3aelter 4ist 5als(奈良は京都よりも古い。)");
		int Answer41 = scanner.nextInt( );
		if 	(Answer41 == 24351){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Nara ist aelter als Kyoto. ");				
		}
		System.out.println("1hat 2Schrein 3Nikko 4den 5elegantesten(日光には素晴らしい寺があります。)");	
		int Answer42 = scanner.nextInt( );
		if 	(Answer42 == 31452){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Nikko hat den elegantesten Schrein.");				
		}	
		System.out.println("1am 2im 3Wetter 4Oktober 5Das 6ist 7besten(天気は１０月が一番良いです。)");	
		int Answer43 = scanner.nextInt( );
		if 	(Answer43 == 5362417){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Das Wetter ist im Oktober am besten.");		
		}
	}
	void lektion5( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1los 2Was 3denn 4ist 5?(どうしたの？)");
		int Answer51 = scanner.nextInt( );
		if 	(Answer51 == 24315){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Was ist denn los?");				
		}
		System.out.println("1Ich 2nicht 3fuehle 4wohl 5mich(私は気分が良くない。)");	
		int Answer52 = scanner.nextInt( );
		if 	(Answer52 == 13524){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich fuehle mich nicht wohl.");				
		}	
		System.out.println("1ist 2kalt 3Mir (寒いなぁ。)");	
		int Answer53 = scanner.nextInt( );
		if 	(Answer53 ==312 ){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Mir ist kalt.");		
		}
	}
	void lektion6( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Lust 2mitzukommen 3? 4Hast 5du(一緒に来ない？)");
		int Answer61 = scanner.nextInt( );
		if 	(Answer61 == 45123){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Hast du Lust mitzukommen?");				
		}
		System.out.println("1habe 2verlaufen 3Ich 4mich(私は道に迷いました。)");	
		int Answer62 = scanner.nextInt( );
		if 	(Answer62 == 3142){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich habe mich verlaufen.");				
		}	
		System.out.println("1dir 2oft 3Das 4passiert(あなたにはよくあることね。)");	
		int Answer63 = scanner.nextInt( );
		if 	(Answer63 == 3412){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Das passiert dir oft.");		
		}
	}
	void lektion7( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1mich 2beschaeftigt 3der 4mit 5Geschichte 6Ich 7lange 8japanischen 9habe (私は長い間日本の歴史に従事してきた。)");
		int Answer71 = scanner.nextInt( );
		if 	(Answer71 == 691743852){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich habe mich lange mit der japanischen Geschichte beschaeftigt.");				
		}
		System.out.println("1fuer 2Ich 3Musik 4klassische 5interessiere 6mich (私はクラシック音楽に興味があります。)");	
		int Answer72 = scanner.nextInt( );
		if 	(Answer72 == 256143){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich interessiere mich fuer klassische Musik.");				
		}	
		System.out.println("1Forschung 2um 3bin 4nach 5fortzusetzen 6Fukuoka 7meine 8gekommen 9Ich(私は自分の研究を続けるため、福岡に行きます。)");	
		int Answer73 = scanner.nextInt( );
		if 	(Answer73 == 934682715){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich bin nach Fukuoka gekommen, um meine Forschung fortzusetzen.");		
		}
	}
	void lektion8( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1gelesen 2Seine 3heute 4werden 5viel 6Buecher 7noch (彼の本は今日もよく読まれています。)");
		int Answer81 = scanner.nextInt( );
		if 	(Answer81 == 2643751){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Seine Buecher werden heute noch viel gelesen.");				
		}
		System.out.println("1Keio-Universitaet  2Yukichi Fukuzawa 3von 4Die 5gegruendet 6wurde (慶應大学は福沢諭吉によって創設されました。)");	
		int Answer82 = scanner.nextInt( );
		if 	(Answer82 == 416325){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Die Keio-Universitaet wurde von Yukichi Fukuzawa gegruendet.");				
		}	
		System.out.println("1Wissenschaftler 2der 3Er 4fuehrenden 5einer 6war (彼は有名な学者の一人でした。)");	
		int Answer83 = scanner.nextInt( );
		if 	(Answer83 == 365241){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Er war einer der fuehrenden Wissenschaftler.");		
		}
	}
	void lektion9( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Frau 2liebe 3will 4die 5Ich 6wirklich 7eine 8heiraten 9ich (私は本当に愛している女性と結婚するつもりだ。)");
		int Answer91 = scanner.nextInt( );
		if 	(Answer91 == 537184962){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich will eine Frau heiraten, die ich wirklich liebe.");				
		}
		System.out.println("1der 2Roman 3wurde 4ist 5Das 6von 7Ogai Mori 8ein 9geschrieben (これは森鴎外によって書かれた小説です。)");	
		int Answer92 = scanner.nextInt( );
		if 	(Answer92 == 548216793){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Das ist ein Roman, der von Ogai Mori geschrieben wurde.");				
		}	
		System.out.println("1? 2es 3Worum 4geht 5denn(何が問題なの？)");	
		int Answer93 = scanner.nextInt( );
		if 	(Answer93 == 34251){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Worum geht es denn?");			
		}
	}
	void lektion10( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1ich 2um 3bitten 4Sie 5Duerfte 6Gefallen 7einen 8?(あなたに頼みごとをしてもよろしいでしょうか？)");
		int Answer101 = scanner.nextInt( );
		if 	(Answer101 == 51427638){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Duerfte ich Sie um einen Gefallen bitten?");				
		}
		System.out.println("1wollen 2dass 3nett 4helfen 5ist 6Sie 7Es 8mir (私を助けてくれるとありがたいのですが。)");	
		int Answer102 = scanner.nextInt( );
		if 	(Answer102 == 75326841){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Es ist nett, dass Sie mir helfen wollen.");				
		}	
		System.out.println("1mal 2Sie 3mich 4Lassen 5sehen(見せてごらんなさい。)");	
		int Answer103 = scanner.nextInt( );
		if 	(Answer103 == 42315){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Lassen Sie mich mal sehen.");			
		}
	}
	void lektion11( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Stelle 2mitnehmen 3Laptop 4wuerde 5keinen 6Ihrer 7ich 8An (私があなたの立場だったらラップトップは持って行かないでしょう。)");
		int Answer111 = scanner.nextInt( );
		if 	(Answer111 == 86147532){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は An Ihrer Stelle wuerde ich keinen Laptop mitnehmen.");				
		}
		System.out.println("1Handy 2Ohne 3nicht 4Internet 5ins 6Sie 7koennten (どの携帯電話もインターネットにはつながらない。)");	
		int Answer112 = scanner.nextInt( );
		if 	(Answer112 == 2176354){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ohne Handy koennten Sie nicht ins Internet.");				
		}	
		System.out.println("1Generator 2dabei 3muesste 4haben 5einen 6Ich (私は発電機を持ち合わせなければいけないでしょう。)");	
		int Answer113 = scanner.nextInt( );
		if 	(Answer113 == 635124){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich muesste einen Generator dabei haben.");			
		}
	}
	void lektion12( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Auto 2der 3dass 4Ich 5Meinung 6ist 7das 8praktischer 9bin (私は車がより便利だと思います。)");
		int Answer121 = scanner.nextInt( );
		if 	(Answer121 == 492537186){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich bin der Meinung, dass das Auto praktischer ist.");				
		}
		System.out.println("1die 2nicht 3bin 4gegen 5Technik 6Ich (私は、技術に反対というわけではない。)");	
		int Answer122 = scanner.nextInt( );
		if 	(Answer122 == 632415){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Ich bin nicht gegen die Technik.");				
		}	
		System.out.println("1halten 2Was 3Ihrer 4? 5Uni 6Sie 7von (あなたの大学についてどう思いますか？)");	
		int Answer123 = scanner.nextInt( );
		if 	(Answer123 == 2167354){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("×　正解は Was halten Sie von Ihrer Uni?");		
		}
	}
}