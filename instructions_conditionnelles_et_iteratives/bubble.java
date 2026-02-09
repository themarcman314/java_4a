
class bubble {
	public static void main(String[] args) {
		int[] tab = { 10, 40, 10, 7, 7, 8, 10, 40 };

		boolean swaps = false;
		do {
			swaps = false;
			for (int index = 0; index < tab.length - 1; index++) {
				if (tab[index] > tab[index + 1]) {
					swaps = true;
					int temp = tab[index];
					tab[index] = tab[index + 1];
					tab[index + 1] = temp;
				}
			}
		} while (swaps == true);
		for (int i : tab) {
			System.out.print(i + " ");
		}
	}
}
