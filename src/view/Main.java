package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.vinicius.filaDinamica.Int.Fila;
import controller.FilaController;

public class Main {

	public static void main(String[] args) {
		FilaController Fcont = new FilaController();
		Fila filaNormal = new Fila();
		Fila filaPrioritarios = new Fila();
		boolean validador = false;
		int senha = 0;
		while (validador == false) {
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Sistema de Fila\n\n"
					+ "Selecione sua Opção:\n1-Gerar senha\n2-Gerar senha prioritária\n" + "3-Chamar senha\n9-Sair"));
			switch (opc) {
			case 1:
				senha++;
				filaNormal = Fcont.Gerarfila(senha,filaNormal);
				break;
			case 2:
				senha++;
				filaPrioritarios = Fcont.Gerarfila(senha,filaPrioritarios);
				break;
			case 3:
				Fcont.ChamarNumero(filaNormal, filaPrioritarios);


				break;
			case 9:
				validador = true;
				break;

			default:
				break;
			}
		}
	}

}