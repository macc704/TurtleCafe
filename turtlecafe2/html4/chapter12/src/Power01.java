import java.util.Scanner;

/*
* �v���O�������F�ݏ�v�Z�v���O���� 
* �쐬�ҁF MegumiAraki 
* �쐬���F Tue Dec 04 12:28:06 JST 2007
*/
public class Power01 {
	
	// �N������
	public static void main(String[] args) {
		Power01 main = new Power01();
		main.run();
	}
	
	public void run(){
		System.out.println("calculatePower(" + 2 + ", " + 2 + ") = " + calculatePower(2, 2));
		System.out.println("calculatePower(" + 2 + ", " + 3 + ") = " + calculatePower(2, 3));
		System.out.println("calculatePower(" + 2 + ", " + 4 + ") = " + calculatePower(2, 4));
		System.out.println("calculatePower(" + 3 + ", " + 3 + ") = " + calculatePower(3, 3));
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