/**
* DeutschprogramApplet.java
* 
* @author MegumiAraki
* @version 2008/05/26 13:58:38
*/

/**
 * �v���O�������F 
 * �쐬�ҁF 
 * �o�[�W�����F 1.0 (���t) 
 */
public class DeutschprogramApplet extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DeutschprogramApplet());
	}

	//�^�[�g���𓮂�������
	public void start() {
		Turtle.window.split.setDividerLocation(25);
		int lektion;
		
		print("���ꂩ��h�C�c�ꃏ�[�N�v���O����/MODELLE2���J�n���܂�");
		print("���͊e�k�d�j�s�h�n�m���Ƃɕ�����Ă���A�S�ĕ��ёւ����ł�");
		print("���������ԂɒP�����т����A���т������P��̐擪�ɂ��Ă��鐔�������Ԃɔ��p�œ��͂��Ă�������");
		print("�E�����E�g�͋����ŕ\����Ă���̂Œ��ӂ��Ă�������");
		print("�w�K�������k�d�j�s�h�n�m�̐����i�P����P2�܂Łj����͂��Ă�������");
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
		
		print("����Ńh�C�c�ꃏ�[�N�v���O����/MODELLE2���I�����܂�");				
	}

	
	void lektion1( ){
		print("1sind 2meines 3Buecher 4die 5Das 6Bruders(�����̖{�͎��̒�̂ł��B)");
		int Answer11 = input();
		if 	(Answer11 == 514326){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Das sind die Buecher meines Bruders.");				
		}
		print("1heute 2Datum 3? 4ist 5Welches(�����͉��������ł����H)");	
		int Answer12 = input();
		if 	(Answer12 == 52413){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Welches Datum ist heute?");				
		}	
		print("1Grossvater 2hat 3Das 4gehort 5meinem(����͎��̂���������̂��̂ł����B)");	
		int Answer13 =input();
		if 	(Answer13 == 32514){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Das hat meinem Grossvater gehort.");				
		}							
	}
	void lektion2( ){
		print("1DWE 2arbeitete 3Mein 4bei 5Vater(���̕���DWE�œ����Ă��܂����B)");
		int Answer21 = input();
		if 	(Answer21 == 35241){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Meine Vater arbeitete bei DWE.");				
		}
		print("1kam 2Ich 3in 4Grundschule 5die(���͊�b�w�Z�ɒʂ��Ă��܂����B)");	
		int Answer22 = input();
		if 	(Answer22 == 21354){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich kam in die Grundschule.");				
		}	
		print("1Japan 2arbeiten 3in 4wollte 5Ich(���͓��{�œ������������B)");	
		int Answer23 = input();
		if 	(Answer23 == 54312){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich wollte in Japan arbeiten.");				
		}
	}
	void lektion3( ){
		print("1du 2Tasche 3gesehen 4Hast 5? 6schwarze 7eine(�����������܂���ł������H)");
		int Answer31 = input();
		if 	(Answer31 == 4176235){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Hast du eine schwarze Tasche gesehen?");				
		}
		print("1zwei 2Buecher 3deutsche 4habe 5ausgeliehen 6Ich(���͂Q���̃h�C�c�̖{���؂�܂����B)");	
		int Answer32 = input();
		if 	(Answer32 == 641325){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich habe zwei deutsche Buecher ausgeliehen.");				
		}	
		print("1da 2Ich 3dass 4liegt 5Tasche 6meine 7hoffe(�����Ɏ��̃J�o�������邱�Ƃ��肤��B)");	
		int Answer33 = input();
		if 	(Answer33 == 2736514){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich hoffe, dass meine Tasche da liegt.");			
		}
	}
	void lektion4( ){
		print("1Kyoto 2Nara 3aelter 4ist 5als(�ޗǂ͋��s�����Â��B)");
		int Answer41 = input();
		if 	(Answer41 == 24351){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Nara ist aelter als Kyoto. ");				
		}
		print("1hat 2Schrein 3Nikko 4den 5elegantesten(�����ɂ͑f���炵����������܂��B)");	
		int Answer42 = input();
		if 	(Answer42 == 31452){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Nikko hat den elegantesten Schrein.");				
		}	
		print("1am 2im 3Wetter 4Oktober 5Das 6ist 7besten(�V�C�͂P�O������ԗǂ��ł��B)");	
		int Answer43 = input();
		if 	(Answer43 == 5362417){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Das Wetter ist im Oktober am besten.");		
		}
	}
	void lektion5( ){
		print("1los 2Was 3denn 4ist 5?(�ǂ������́H)");
		int Answer51 = input();
		if 	(Answer51 == 24315){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Was ist denn los?");				
		}
		print("1Ich 2nicht 3fuehle 4wohl 5mich(���͋C�����ǂ��Ȃ��B)");	
		int Answer52 = input();
		if 	(Answer52 == 13524){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich fuehle mich nicht wohl.");				
		}	
		print("1ist 2kalt 3Mir (�����Ȃ��B)");	
		int Answer53 = input();
		if 	(Answer53 ==312 ){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Mir ist kalt.");		
		}
	}
	void lektion6( ){
	
		print("1Lust 2mitzukommen 3? 4Hast 5du(�ꏏ�ɗ��Ȃ��H)");
		int Answer61 = input();
		if 	(Answer61 == 45123){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Hast du Lust mitzukommen?");				
		}
		print("1habe 2verlaufen 3Ich 4mich(���͓��ɖ����܂����B)");	
		int Answer62 = input();
		if 	(Answer62 == 3142){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich habe mich verlaufen.");				
		}	
		print("1dir 2oft 3Das 4passiert(���Ȃ��ɂ͂悭���邱�ƂˁB)");	
		int Answer63 = input();
		if 	(Answer63 == 3412){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Das passiert dir oft.");		
		}
	}
	void lektion7( ){

		print("1mich 2beschaeftigt 3der 4mit 5Geschichte 6Ich 7lange 8japanischen 9habe (���͒����ԓ��{�̗��j�ɏ]�����Ă����B)");
		int Answer71 = input();
		if 	(Answer71 == 691743852){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich habe mich lange mit der japanischen Geschichte beschaeftigt.");				
		}
		print("1fuer 2Ich 3Musik 4klassische 5interessiere 6mich (���̓N���V�b�N���y�ɋ���������܂��B)");	
		int Answer72 = input();
		if 	(Answer72 == 256143){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich interessiere mich fuer klassische Musik.");				
		}	
		print("1Forschung 2um 3bin 4nach 5fortzusetzen 6Fukuoka 7meine 8gekommen 9Ich(���͎����̌����𑱂��邽�߁A�����ɍs���܂��B)");	
		int Answer73 = input();
		if 	(Answer73 == 934682715){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich bin nach Fukuoka gekommen, um meine Forschung fortzusetzen.");		
		}
	}
	void lektion8( ){
		
		print("1gelesen 2Seine 3heute 4werden 5viel 6Buecher 7noch (�ނ̖{�͍������悭�ǂ܂�Ă��܂��B)");
		int Answer81 = input();
		if 	(Answer81 == 2643751){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Seine Buecher werden heute noch viel gelesen.");				
		}
		print("1Keio-Universitaet  2Yukichi Fukuzawa 3von 4Die 5gegruendet 6wurde (�c���w�͕���@�g�ɂ���đn�݂���܂����B)");	
		int Answer82 = input();
		if 	(Answer82 == 416325){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Die Keio-Universitaet wurde von Yukichi Fukuzawa gegruendet.");				
		}	
		print("1Wissenschaftler 2der 3Er 4fuehrenden 5einer 6war (�ނ͗L���Ȋw�҂̈�l�ł����B)");	
		int Answer83 =input();
		if 	(Answer83 == 365241){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Er war einer der fuehrenden Wissenschaftler.");		
		}
	}
	void lektion9( ){
		print("1Frau 2liebe 3will 4die 5Ich 6wirklich 7eine 8heiraten 9ich (���͖{���Ɉ����Ă��鏗���ƌ���������肾�B)");
		int Answer91 = input();
		if 	(Answer91 == 537184962){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich will eine Frau heiraten, die ich wirklich liebe.");				
		}
		print("1der 2Roman 3wurde 4ist 5Das 6von 7Ogai Mori 8ein 9geschrieben (����͐X���O�ɂ���ď����ꂽ�����ł��B)");	
		int Answer92 = input();
		if 	(Answer92 == 548216793){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Das ist ein Roman, der von Ogai Mori geschrieben wurde.");				
		}	
		print("1? 2es 3Worum 4geht 5denn(�������Ȃ́H)");	
		int Answer93 = input();
		if 	(Answer93 == 34251){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Worum geht es denn?");			
		}
	}
	void lektion10( ){

		print("1ich 2um 3bitten 4Sie 5Duerfte 6Gefallen 7einen 8?(���Ȃ��ɗ��݂��Ƃ����Ă���낵���ł��傤���H)");
		int Answer101 = input();
		if 	(Answer101 == 51427638){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Duerfte ich Sie um einen Gefallen bitten?");				
		}
		print("1wollen 2dass 3nett 4helfen 5ist 6Sie 7Es 8mir (���������Ă����Ƃ��肪�����̂ł����B)");	
		int Answer102 = input();
		if 	(Answer102 == 75326841){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Es ist nett, dass Sie mir helfen wollen.");				
		}	
		print("1mal 2Sie 3mich 4Lassen 5sehen(�����Ă����Ȃ����B)");	
		int Answer103 = input();
		if 	(Answer103 == 42315){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Lassen Sie mich mal sehen.");			
		}
	}
	void lektion11( ){
		print("1Stelle 2mitnehmen 3Laptop 4wuerde 5keinen 6Ihrer 7ich 8An (�������Ȃ��̗��ꂾ�����烉�b�v�g�b�v�͎����čs���Ȃ��ł��傤�B)");
		int Answer111 = input();
		if 	(Answer111 == 86147532){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ An Ihrer Stelle wuerde ich keinen Laptop mitnehmen.");				
		}
		print("1Handy 2Ohne 3nicht 4Internet 5ins 6Sie 7koennten (�ǂ̌g�ѓd�b���C���^�[�l�b�g�ɂ͂Ȃ���Ȃ��B)");	
		int Answer112 = input();
		if 	(Answer112 == 2176354){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ohne Handy koennten Sie nicht ins Internet.");				
		}	
		print("1Generator 2dabei 3muesste 4haben 5einen 6Ich (���͔��d�@���������킹�Ȃ���΂����Ȃ��ł��傤�B)");	
		int Answer113 = input();
		if 	(Answer113 == 635124){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich muesste einen Generator dabei haben.");			
		}
	}
	void lektion12( ){

		print("1Auto 2der 3dass 4Ich 5Meinung 6ist 7das 8praktischer 9bin (���͎Ԃ����֗����Ǝv���܂��B)");
		int Answer121 = input();
		if 	(Answer121 == 492537186){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich bin der Meinung, dass das Auto praktischer ist.");				
		}
		print("1die 2nicht 3bin 4gegen 5Technik 6Ich (���́A�Z�p�ɔ��΂Ƃ����킯�ł͂Ȃ��B)");	
		int Answer122 = input();
		if 	(Answer122 == 632415){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Ich bin nicht gegen die Technik.");				
		}	
		print("1halten 2Was 3Ihrer 4? 5Uni 6Sie 7von (���Ȃ��̑�w�ɂ��Ăǂ��v���܂����H)");	
		int Answer123 = input();
		if 	(Answer123 == 2167354){
			print("Richtig!!!");				
		}
		else{
			print("�~�@������ Was halten Sie von Ihrer Uni?");		
		}
	}
}
