import java.util.*;

/**
 * ����a��ϊ��v���O�����i2���x�������\�b�h���j
 * 
 * @author �I�u�v�����
 * @version 3.0
 */
public class ConvertYearApplication3 {

	public static void main(String[] args) {
		ConvertYearApplication3 main = new ConvertYearApplication3();
		main.run();
	}

	Scanner scanner = new Scanner(System.in);

	// �����a��ɕϊ�����
	public void run() {
		showTitle();
		convertYear();
		showEndTitle();
	}

	// �����a��ɕϊ�����
	void convertYear() {
		int year;
		String japaneseYear;

		year = inputYear();
		japaneseYear = convertToJapaneseYear(year);
		showResult(year, japaneseYear);
	}

	// �������͂���
	int inputYear() {
		int year;
		System.out.println("�������͂��Ă�������");
		year = scanner.nextInt();
		return year;
	}

	// �����a��ɕϊ�����
	String convertToJapaneseYear(int year) {
		String japaneseYear;
		if (year >= 1989) {
			japaneseYear = "����" + (year - 1988);
		} else if (year >= 1926) {
			japaneseYear = "���a" + (year - 1925);
		} else {
			japaneseYear = "�s��";
		}
		return japaneseYear;
	}

	// �ϊ����ʂ��o�͂���
	void showResult(int year, String japaneseYear) {
		System.out.println(year + "�N��" + japaneseYear + "�N�ł�.");
	}

	// �A�v���P�[�V�����̊J�n��m�点��
	void showTitle() {
		System.out.println("����a��ϊ��v���O�������J�n���܂�");
	}

	// �A�v���P�[�V�����̏I����m�点��
	void showEndTitle() {
		System.out.println("����a��ϊ��v���O�������I�����܂�");
	}

}
