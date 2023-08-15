package view;

import controller.MultPorSomaController;

public class Principal {

	public static void main(String[] args) {

		MultPorSomaController mps = new MultPorSomaController();

		int a = 2;
		int b = 5;
		int multporsoma = mps.multporsoma(a, b);

		System.out.println(multporsoma);

	}

}
