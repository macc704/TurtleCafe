import java.util.*;

/**
* �v���O�������F
* �쐬�ҁF 
* �쐬���F Wed Jan 02 23:15:23 JST 2008
*/
public class Deutschprogram{
	//�N������
	public static void main(String[] args) {
		Deutschprogram main = new Deutschprogram();
		main.run();
	}
	
	//���C������
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		int lektion;
		
		System.out.println("���ꂩ��h�C�c�ꃏ�[�N�v���O����/MODELLE2���J�n���܂�");
		System.out.println("���͊e�k�d�j�s�h�n�m���Ƃɕ�����Ă���A�S�ĕ��ёւ����ł�");
		System.out.println("���������ԂɒP�����т����A���т������P��̐擪�ɂ��Ă��鐔�������Ԃɔ��p�œ��͂��Ă�������");
		System.out.println("�E�����E�g�͋����ŕ\����Ă���̂Œ��ӂ��Ă�������");
		System.out.println("�w�K�������k�d�j�s�h�n�m�̐����i�P����P2�܂Łj����͂��Ă�������");
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
		
		System.out.println("����Ńh�C�c�ꃏ�[�N�v���O����/MODELLE2���I�����܂�");				
	}
	
	void lektion1( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1sind 2meines 3Buecher 4die 5Das 6Bruders(�����̖{�͎��̒�̂ł��B)");
		int Answer11 = scanner.nextInt( );
		if 	(Answer11 == 514326){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Das sind die Buecher meines Bruders.");				
		}
		System.out.println("1heute 2Datum 3? 4ist 5Welches(�����͉��������ł����H)");	
		int Answer12 = scanner.nextInt( );
		if 	(Answer12 == 52413){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Welches Datum ist heute?");				
		}	
		System.out.println("1Grossvater 2hat 3Das 4gehort 5meinem(����͎��̂���������̂��̂ł����B)");	
		int Answer13 = scanner.nextInt( );
		if 	(Answer13 == 32514){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Das hat meinem Grossvater gehort.");				
		}							
	}
	void lektion2( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1DWE 2arbeitete 3Mein 4bei 5Vater(���̕���DWE�œ����Ă��܂����B)");
		int Answer21 = scanner.nextInt( );
		if 	(Answer21 == 35241){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Meine Vater arbeitete bei DWE.");				
		}
		System.out.println("1kam 2Ich 3in 4Grundschule 5die(���͊�b�w�Z�ɒʂ��Ă��܂����B)");	
		int Answer22 = scanner.nextInt( );
		if 	(Answer22 == 21354){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich kam in die Grundschule.");				
		}	
		System.out.println("1Japan 2arbeiten 3in 4wollte 5Ich(���͓��{�œ������������B)");	
		int Answer23 = scanner.nextInt( );
		if 	(Answer23 == 54312){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich wollte in Japan arbeiten.");				
		}
	}
	void lektion3( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1du 2Tasche 3gesehen 4Hast 5? 6schwarze 7eine(�����������܂���ł������H)");
		int Answer31 = scanner.nextInt( );
		if 	(Answer31 == 4176235){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Hast du eine schwarze Tasche gesehen?");				
		}
		System.out.println("1zwei 2Buecher 3deutsche 4habe 5ausgeliehen 6Ich(���͂Q���̃h�C�c�̖{���؂�܂����B)");	
		int Answer32 = scanner.nextInt( );
		if 	(Answer32 == 641325){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich habe zwei deutsche Buecher ausgeliehen.");				
		}	
		System.out.println("1da 2Ich 3dass 4liegt 5Tasche 6meine 7hoffe(�����Ɏ��̃J�o�������邱�Ƃ��肤��B)");	
		int Answer33 = scanner.nextInt( );
		if 	(Answer33 == 2736514){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich hoffe, dass meine Tasche da liegt.");			
		}
	}
	void lektion4( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Kyoto 2Nara 3aelter 4ist 5als(�ޗǂ͋��s�����Â��B)");
		int Answer41 = scanner.nextInt( );
		if 	(Answer41 == 24351){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Nara ist aelter als Kyoto. ");				
		}
		System.out.println("1hat 2Schrein 3Nikko 4den 5elegantesten(�����ɂ͑f���炵����������܂��B)");	
		int Answer42 = scanner.nextInt( );
		if 	(Answer42 == 31452){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Nikko hat den elegantesten Schrein.");				
		}	
		System.out.println("1am 2im 3Wetter 4Oktober 5Das 6ist 7besten(�V�C�͂P�O������ԗǂ��ł��B)");	
		int Answer43 = scanner.nextInt( );
		if 	(Answer43 == 5362417){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Das Wetter ist im Oktober am besten.");		
		}
	}
	void lektion5( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1los 2Was 3denn 4ist 5?(�ǂ������́H)");
		int Answer51 = scanner.nextInt( );
		if 	(Answer51 == 24315){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Was ist denn los?");				
		}
		System.out.println("1Ich 2nicht 3fuehle 4wohl 5mich(���͋C�����ǂ��Ȃ��B)");	
		int Answer52 = scanner.nextInt( );
		if 	(Answer52 == 13524){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich fuehle mich nicht wohl.");				
		}	
		System.out.println("1ist 2kalt 3Mir (�����Ȃ��B)");	
		int Answer53 = scanner.nextInt( );
		if 	(Answer53 ==312 ){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Mir ist kalt.");		
		}
	}
	void lektion6( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Lust 2mitzukommen 3? 4Hast 5du(�ꏏ�ɗ��Ȃ��H)");
		int Answer61 = scanner.nextInt( );
		if 	(Answer61 == 45123){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Hast du Lust mitzukommen?");				
		}
		System.out.println("1habe 2verlaufen 3Ich 4mich(���͓��ɖ����܂����B)");	
		int Answer62 = scanner.nextInt( );
		if 	(Answer62 == 3142){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich habe mich verlaufen.");				
		}	
		System.out.println("1dir 2oft 3Das 4passiert(���Ȃ��ɂ͂悭���邱�ƂˁB)");	
		int Answer63 = scanner.nextInt( );
		if 	(Answer63 == 3412){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Das passiert dir oft.");		
		}
	}
	void lektion7( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1mich 2beschaeftigt 3der 4mit 5Geschichte 6Ich 7lange 8japanischen 9habe (���͒����ԓ��{�̗��j�ɏ]�����Ă����B)");
		int Answer71 = scanner.nextInt( );
		if 	(Answer71 == 691743852){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich habe mich lange mit der japanischen Geschichte beschaeftigt.");				
		}
		System.out.println("1fuer 2Ich 3Musik 4klassische 5interessiere 6mich (���̓N���V�b�N���y�ɋ���������܂��B)");	
		int Answer72 = scanner.nextInt( );
		if 	(Answer72 == 256143){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich interessiere mich fuer klassische Musik.");				
		}	
		System.out.println("1Forschung 2um 3bin 4nach 5fortzusetzen 6Fukuoka 7meine 8gekommen 9Ich(���͎����̌����𑱂��邽�߁A�����ɍs���܂��B)");	
		int Answer73 = scanner.nextInt( );
		if 	(Answer73 == 934682715){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich bin nach Fukuoka gekommen, um meine Forschung fortzusetzen.");		
		}
	}
	void lektion8( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1gelesen 2Seine 3heute 4werden 5viel 6Buecher 7noch (�ނ̖{�͍������悭�ǂ܂�Ă��܂��B)");
		int Answer81 = scanner.nextInt( );
		if 	(Answer81 == 2643751){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Seine Buecher werden heute noch viel gelesen.");				
		}
		System.out.println("1Keio-Universitaet  2Yukichi Fukuzawa 3von 4Die 5gegruendet 6wurde (�c���w�͕���@�g�ɂ���đn�݂���܂����B)");	
		int Answer82 = scanner.nextInt( );
		if 	(Answer82 == 416325){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Die Keio-Universitaet wurde von Yukichi Fukuzawa gegruendet.");				
		}	
		System.out.println("1Wissenschaftler 2der 3Er 4fuehrenden 5einer 6war (�ނ͗L���Ȋw�҂̈�l�ł����B)");	
		int Answer83 = scanner.nextInt( );
		if 	(Answer83 == 365241){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Er war einer der fuehrenden Wissenschaftler.");		
		}
	}
	void lektion9( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Frau 2liebe 3will 4die 5Ich 6wirklich 7eine 8heiraten 9ich (���͖{���Ɉ����Ă��鏗���ƌ���������肾�B)");
		int Answer91 = scanner.nextInt( );
		if 	(Answer91 == 537184962){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich will eine Frau heiraten, die ich wirklich liebe.");				
		}
		System.out.println("1der 2Roman 3wurde 4ist 5Das 6von 7Ogai Mori 8ein 9geschrieben (����͐X���O�ɂ���ď����ꂽ�����ł��B)");	
		int Answer92 = scanner.nextInt( );
		if 	(Answer92 == 548216793){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Das ist ein Roman, der von Ogai Mori geschrieben wurde.");				
		}	
		System.out.println("1? 2es 3Worum 4geht 5denn(�������Ȃ́H)");	
		int Answer93 = scanner.nextInt( );
		if 	(Answer93 == 34251){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Worum geht es denn?");			
		}
	}
	void lektion10( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1ich 2um 3bitten 4Sie 5Duerfte 6Gefallen 7einen 8?(���Ȃ��ɗ��݂��Ƃ����Ă���낵���ł��傤���H)");
		int Answer101 = scanner.nextInt( );
		if 	(Answer101 == 51427638){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Duerfte ich Sie um einen Gefallen bitten?");				
		}
		System.out.println("1wollen 2dass 3nett 4helfen 5ist 6Sie 7Es 8mir (���������Ă����Ƃ��肪�����̂ł����B)");	
		int Answer102 = scanner.nextInt( );
		if 	(Answer102 == 75326841){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Es ist nett, dass Sie mir helfen wollen.");				
		}	
		System.out.println("1mal 2Sie 3mich 4Lassen 5sehen(�����Ă����Ȃ����B)");	
		int Answer103 = scanner.nextInt( );
		if 	(Answer103 == 42315){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Lassen Sie mich mal sehen.");			
		}
	}
	void lektion11( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Stelle 2mitnehmen 3Laptop 4wuerde 5keinen 6Ihrer 7ich 8An (�������Ȃ��̗��ꂾ�����烉�b�v�g�b�v�͎����čs���Ȃ��ł��傤�B)");
		int Answer111 = scanner.nextInt( );
		if 	(Answer111 == 86147532){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ An Ihrer Stelle wuerde ich keinen Laptop mitnehmen.");				
		}
		System.out.println("1Handy 2Ohne 3nicht 4Internet 5ins 6Sie 7koennten (�ǂ̌g�ѓd�b���C���^�[�l�b�g�ɂ͂Ȃ���Ȃ��B)");	
		int Answer112 = scanner.nextInt( );
		if 	(Answer112 == 2176354){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ohne Handy koennten Sie nicht ins Internet.");				
		}	
		System.out.println("1Generator 2dabei 3muesste 4haben 5einen 6Ich (���͔��d�@���������킹�Ȃ���΂����Ȃ��ł��傤�B)");	
		int Answer113 = scanner.nextInt( );
		if 	(Answer113 == 635124){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich muesste einen Generator dabei haben.");			
		}
	}
	void lektion12( ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1Auto 2der 3dass 4Ich 5Meinung 6ist 7das 8praktischer 9bin (���͎Ԃ����֗����Ǝv���܂��B)");
		int Answer121 = scanner.nextInt( );
		if 	(Answer121 == 492537186){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich bin der Meinung, dass das Auto praktischer ist.");				
		}
		System.out.println("1die 2nicht 3bin 4gegen 5Technik 6Ich (���́A�Z�p�ɔ��΂Ƃ����킯�ł͂Ȃ��B)");	
		int Answer122 = scanner.nextInt( );
		if 	(Answer122 == 632415){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Ich bin nicht gegen die Technik.");				
		}	
		System.out.println("1halten 2Was 3Ihrer 4? 5Uni 6Sie 7von (���Ȃ��̑�w�ɂ��Ăǂ��v���܂����H)");	
		int Answer123 = scanner.nextInt( );
		if 	(Answer123 == 2167354){
			System.out.println("Richtig!!!");				
		}
		else{
			System.out.println("�~�@������ Was halten Sie von Ihrer Uni?");		
		}
	}
}