package Exercicio2;

import java.lang.Thread;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		int tempo = 0;

		int respostaDoUsuario;

		do {

			try {

				respostaDoUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Como está a sua internet hoje? \n1-Lenta\n2-Intermediário\n3-Rápida"));

			} catch (NumberFormatException | NullPointerException e) {

				JOptionPane.showMessageDialog(null,
						"Você não inseriu dados válidos ou fechou a aplicação repentinamente");
				break;
			}

			switch (respostaDoUsuario) {

			case 1:

				try {

					for (int i = 0; i < 100; i++) {

						System.out.print(i + " ");

						Thread.sleep(10000);
						tempo += 10000;
					}

				} catch (InterruptedException e) {

					JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, tente novamente");
				}

				finally {
					JOptionPane.showMessageDialog(null,
							"Download Efetuado com sucesso 100% \nTempo :" + Math.round(tempo / 1000) + " s");

				}

				break;

			case 2:

				try {

					for (int i = 0; i < 100; i++) {

						System.out.print(i + " ");

						Thread.sleep(5000);

						tempo += 5000;
					}

				} catch (InterruptedException e) {

					JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, tente novamente");
				}

				finally {
					JOptionPane.showMessageDialog(null,
							"Download Efetuado com sucesso 100% \nTempo : " + Math.round((tempo / 1000)) + " s");

				}

				break;

			case 3:

				try {

					for (int i = 0; i < 100; i++) {

						System.out.print(i + " ");

						Thread.sleep(500);

						tempo += 500;
					}

				} catch (InterruptedException e) {

					JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, tente novamente");
				}

				finally {
					JOptionPane.showMessageDialog(null,
							"Download Efetuado com sucesso 100% \nTempo : " + Math.round(tempo / 1000) + "s");

				}

				break;

			default:
				JOptionPane.showMessageDialog(null,
						"Você não selecionou nenhuma entrada de dados válida, portanto a aplicação foi finalizada");

				break;
			}

		} while (respostaDoUsuario > 0 && respostaDoUsuario <= 3);

	}

}
