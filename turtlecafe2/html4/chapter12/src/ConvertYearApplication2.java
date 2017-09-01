import java.util.Scanner;

/**
 * ����a��ϊ��v���O�����i1���x�������\�b�h���j
 * 
 * @author �I�u�v�����
 * @version 2.0
 */
public class ConvertYearApplication2 {

	public static void main(String[] args) {
		ConvertYearApplication2 main = new ConvertYearApplication2();
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

		// �������͂���
		System.out.println("�������͂��Ă�������");
		year = scanner.nextInt();

		// �����a��ɕϊ�����
		if (year >= 1989) {
			japaneseYear = "����" + (year - 1988);
		} else if (year >= 1926) {
			japaneseYear = "���a" + (year - 1925);
		} else {
			japaneseYear = "�s��";
		}

		// �ϊ����ʂ��o�͂���
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
