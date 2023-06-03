public class PilasIguales {

	public static void main(String[] args) {
		int[] h1 = { 2, 1, 4 }, h2 = { 1, 1, 1, 2, 1 }, h3 = { 3, 1, 1, 1, 2 };
		System.out.println("altura: " + equalStacks(h1, h2, h3));
	}

	public static int equalStacks(int[] n1, int[] n2, int[] n3) {
		int h1, h2, h3;
		do {
			h1 = 0;
			h2 = 0;
			h3 = 0;
			for (int i = 0; i < n1.length; i++)
				h1 += n1[i];
			for (int i = 0; i < n2.length; i++)
				h2 += n2[i];
			for (int i = 0; i < n3.length; i++)
				h3 += n3[i];
			int[] alturas = { h1, h2, h3 };
			int[][] cilindros = { n1, n2, n3 };
			int min = Math.min(h1, Math.min(h2, h3));
			for (int i = 0; i < 3; i++) {
				if (alturas[i] > min) {
					int[] x = cilindros[i];
					for (int j = 2; j <= x.length; j++) {
						if (x[x.length - 1] != 0) {
							x[x.length - 1] = 0;
							break;
						} else {
							if (x[x.length - j] != 0)
								x[x.length - j] = 0;
							break;
						}
					}
				}
			}
			System.out.println(h1 + " " + h2 + " " + h3);
		} while (h1 != h2 && h1 != h3);
		return h1;
	}
}
