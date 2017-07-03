package puKePai;

public class Game {

	public static void main(String[] args) {
		puKe p = new puKe();
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();
		faPai f = new faPai();
		diZhu d = new diZhu();
		d.main(args);
		f.main(args);
		int n = 0;
		switch (d.getD()) {
		case 0: {
			p1.setPlayer(f.getP1());
			p2.setPlayer(f.getP2());
			p3.setPlayer(f.getP3());

			System.out.println("1P *地主*：");
			for (n = 0; n < 20; n++) {
				if (p1.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p1.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p1.getPlayer()[n] / 13] + p.getPoint()[p1.getPlayer()[n] % 13] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("2P：");
			for (n = 0; n < 17; n++) {
				if (p2.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p2.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p2.getPlayer()[n] / 13] + p.getPoint()[p2.getPlayer()[n] % 13] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("3P：");
			for (n = 0; n < 17; n++) {
				if (p3.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p3.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p3.getPlayer()[n] / 13] + p.getPoint()[p3.getPlayer()[n] % 13] + " ");
			}

			break;
		}
		case 1: {
			p2.setPlayer(f.getP1());
			p1.setPlayer(f.getP2());
			p3.setPlayer(f.getP3());

			System.out.println("1P：");
			for (n = 0; n < 17; n++) {
				if (p1.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p1.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p1.getPlayer()[n] / 13] + p.getPoint()[p1.getPlayer()[n] % 13] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("2P  *地主*：");
			for (n = 0; n < 20; n++) {
				if (p2.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p2.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p2.getPlayer()[n] / 13] + p.getPoint()[p2.getPlayer()[n] % 13] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("3P：");
			for (n = 0; n < 17; n++) {
				if (p3.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p3.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p3.getPlayer()[n] / 13] + p.getPoint()[p3.getPlayer()[n] % 13] + " ");
			}

			break;
		}
		case 2: {
			p3.setPlayer(f.getP1());
			p1.setPlayer(f.getP2());
			p2.setPlayer(f.getP3());

			System.out.println("1P：");
			for (n = 0; n < 17; n++) {
				if (p1.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p1.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p1.getPlayer()[n] / 13] + p.getPoint()[p1.getPlayer()[n] % 13] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("2P：");
			for (n = 0; n < 17; n++) {
				if (p2.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p2.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p2.getPlayer()[n] / 13] + p.getPoint()[p2.getPlayer()[n] % 13] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("3P  *地主*：");
			for (n = 0; n < 20; n++) {
				if (p3.getPlayer()[n] == 52) {
					System.out.print("小王" + " ");
					continue;
				}
				if (p3.getPlayer()[n] == 53) {
					System.out.print("大王" + " ");
					continue;
				}
				System.out.print(p.getPaiSe()[p3.getPlayer()[n] / 13] + p.getPoint()[p3.getPlayer()[n] % 13] + " ");
			}

			break;
		}
		default: {
			System.out.println("发牌出错");
		}
		}

	}

}
