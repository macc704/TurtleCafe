/*
 * ‰Ô‚ğ‘‚­ƒvƒƒOƒ‰ƒ€
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ‰ü’ù Yoshiaki Matsuzawa
 */
public class Flower extends Turtle {

	// ‹N“®ˆ—
	public static void main(String[] args) {
		Turtle.startTurtle(new Flower());
	}

	// ƒ^[ƒgƒ‹‚ğ“®‚©‚·ˆ—
	public void start() {

		{// ‰Ô‚ğ‚©‚­i6–‡‚Ì‰Ô‚Ñ‚ç‚ğ‘‚­j
			int j = 1;
			while (j <= 6) {

				{// ‰Ô‚Ñ‚ç‚ğ•`‚­
					{// ‰~ŒÊ‚ğ•`‚­
						int i = 1;
						while (i <= 120) {
							rt(1);
							fd(1);
							i++;
						}
					}

					{// Ÿ‚Ì‰~ŒÊ‚ÌŠp“x‚Ö
						rt(60);
					}

					{// ‰~ŒÊ‚ğ•`‚­
						int i = 1;
						while (i <= 120) {
							rt(1);
							fd(1);
							i++;
						}
					}

				}

				j++;
			}
		}
	}
}