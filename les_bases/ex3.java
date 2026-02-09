class ex3 {
	public static void main(String[] args) {
		String personnage = "passager";
		String guichet_train = "guichet train";
		String guichet_metro = "guichet métro";
		int train_ticket_price = 55;
		int money_given_train = 100;
		int money_given_metro = 20;
		int metro_ticket_price = 13;
		System.out.println(personnage.concat(": ").concat(Integer.toString(money_given_train)).concat(" -> ")
				.concat(guichet_train));
		System.out.println(
				guichet_train.concat(": ")
						.concat(Integer.toString(money_given_train - train_ticket_price))
						.concat(" -> ")
						.concat(guichet_train));
		System.out.println(personnage.concat(": ").concat(Integer.toString(money_given_metro)).concat(" -> ")
				.concat(guichet_metro));
		System.out.println(guichet_metro.concat(": ")
				.concat(Integer.toString(money_given_metro - metro_ticket_price)).concat(" -> ")
				.concat(guichet_metro));
	}
}
