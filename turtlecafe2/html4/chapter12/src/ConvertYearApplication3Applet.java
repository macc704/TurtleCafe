/**
 * ����a��ϊ��v���O�����i2���x�������\�b�h���j
 * 
 * @author �I�u�v�����
 * @version 3.0
 */
public class ConvertYearApplication3Applet extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ConvertYearApplication3Applet());
	}

	// �����a��ɕϊ�����
	// �^�[�g���𓮂�������
	public void start() {
		Turtle.window.split.setDividerLocation(25);

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
		print("�������͂��Ă�������\n");
		year = input();
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
		print(year + "�N��" + japaneseYear + "�N�ł�.\n");
	}

	// �A�v���P�[�V�����̊J�n��m�点��
	void showTitle() {
		print("����a��ϊ��v���O�������J�n���܂�\n");
	}

	// �A�v���P�[�V�����̏I����m�点��
	void showEndTitle() {
		print("����a��ϊ��v���O�������I�����܂�\n");
	}

}
