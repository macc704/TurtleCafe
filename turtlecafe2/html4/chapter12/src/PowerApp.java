import java.util.Scanner;

/*
* �v���O�������F�ݏ�v�Z�v���O���� 
* �쐬�ҁF MegumiAraki 
* �쐬���F Tue Dec 04 12:28:06 JST 2007
*/
public class PowerApp {
	
	// �N������
	public static void main(String[] args) {
		PowerApp main = new PowerApp();
		main.run();
	}
	
	// ���C������
	public void run() {
		System.out.println("�ݏ�v�Z�v���O�������J�n���܂�");// �A�v���P�[�V�����̊J�n��m�点��
		
		Scanner scanner = new Scanner(System.in);// ���͂��󂯕t����X�L���i�[�����
		
		// ��̓��͂��󂯕t����
		System.out.println("�����͂��Ă�������>>");
		int base = scanner.nextInt();
		
		// �w���̓��͂��󂯕t����
		System.out.println("�w������͂��Ă�������>>");
		int exponent = scanner.nextInt();
		
		// �ݏ搔���v�Z���A�v�Z���ʂ�calculatedPowerApp�Ƃ����ϐ��ɏ�������
		int calculatedPowerApp = calculatePowerApp(base, exponent);
		
		// �ݏ搔���o�͂���
		System.out.println(base + "��" + exponent + "���" + calculatedPowerApp
		+ "�ł��B");
		
		System.out.println("�ݏ�v�Z�v���O�������I�����܂�");// �A�v���P�[�V�����̏I����m�点��
	}
	
	// �ݏ���v�Z����
	int calculatePowerApp(int base, int exponent) {
		int power = 1;// �ݏ搔�̏����l���A����0��i1�j�ɐݒ肷��
		
		// �ݏ���v�Z����
		int i = 0;
		while (i < exponent) {
			power = power * base;
			i++;
		}
		
		return power;
	}
	
}																																												