/*
 * �l�p�ƎO�p����ׂĂ����v���O����
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa 
 */
public class HundredBlocks2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HundredBlocks2());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int length = 10;// 1�ӂ̒���
		int margin = 5;// �ׂƂ̊Ԋu

		{// �c��10��J��Ԃ����߂̃��[�v
			int i = 1;
			while (i <= 10) {

				{// ����10��J��Ԃ����߂̃��[�v
					int j = 1;
					while (j <= 10) {

						if (j % 2 == 0) {
							{// �l�p�`���������߂̃��[�v
								int k = 1;
								while (k <= 4) {
									fd(length);
									rt(90);

									k++;
								}
							}
						} else {
							{// �O�p�`���������߂̃��[�v
								int k = 1;
								while (k <= 3) {
									fd(length);
									rt(120);

									k++;
								}
							}
						}

						{// �}�`����������ׂɈړ�
							up();
							rt(90);
							fd(length);
							fd(margin);
							lt(90);
							down();
						}

						j++;
					}

					{// ����񂪏I�����獶���Ɉړ�
						up();
						lt(90);
						fd((length + margin) * 10);
						lt(90);
						fd(length + margin);
						rt(180);
						down();
					}

					i++;
				}
			}
		}
	}

}