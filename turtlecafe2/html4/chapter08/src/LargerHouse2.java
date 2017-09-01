/*
 * �Ƃ�傫������v���O���� (����2: �傫���Ȃ肷�����珬��������)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class LargerHouse2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LargerHouse2());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // 1�R�}�̏������s��
					int width = house.getWidth();
					int height = house.getHeight();
					house.size(width + 2, height + 2);
					{ // �������傫���Ȃ肷�����珬��������
						if (width >= 300) {
							house.scale(0.25);
						}
					}
					{ // �c�����傫���Ȃ肷�����珬��������
						if (height >= 300) {
							house.scale(0.25);
						}
					}
				}
				update();
			}
		}
	}

}