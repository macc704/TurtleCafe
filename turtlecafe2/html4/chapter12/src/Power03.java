import java.util.Scanner;

/*
* �v���O�������F�ݏ�v�Z�v���O���� 
* �쐬�ҁF MegumiAraki 
* �쐬���F Tue Dec 04 12:28:06 JST 2007
*/
public class Power03 {
	
	// �N������
	public static void main(String[] args) {
		Power03 main = new Power03();
		main.run();
	}
	
	public void run(){
		test(2, 2, 4);
		test(2, 3, 8);
		test(2, 4, 16);
		test(3, 3, 27);
	}
	
	void test(int base, int exp, int expected) {
		int answer = calculatePower(base,exp);
		String result = "";
		if(answer == expected){
			result = "PASS";
		}else{
			result = "FAIL";
		}
		System.out.println("calculatePower(" + base + ", " + exp + ") = " + answer + ", ����: " + result);
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