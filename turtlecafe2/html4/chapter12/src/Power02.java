import java.util.Scanner;

/*
* �v���O�������F�ݏ�v�Z�v���O���� 
* �쐬�ҁF MegumiAraki 
* �쐬���F Tue Dec 04 12:28:06 JST 2007
*/
public class Power02 {
	
	// �N������
	public static void main(String[] args) {
		Power02 main = new Power02();
		main.run();
	}
	
	public void run(){
		test(2,2);
		test(2,3);
		test(2,4);
		test(3,3);
	}
	
	void test(int base, int exp) {
		System.out.println("calculatePower(" + base+ ", " + exp + ") = " + calculatePower(base, exp));
	}
	
	// �ݏ���v�Z����
	int calculatePower(int base, int exponent) {
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