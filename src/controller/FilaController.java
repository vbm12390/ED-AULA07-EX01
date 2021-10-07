package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.vinicius.filaDinamica.Int.Fila;

public class FilaController {

	public Fila Gerarfila(int senha, Fila fila) {
		fila.insert(senha);
		return fila;
	}

	public void ChamarNumero(Fila filaNormal, Fila filaPrioritarios) {
		if ((filaNormal.size() == 0) && (filaPrioritarios.size() == 0)) {
			JOptionPane.showMessageDialog(null, "Nenhuma senha para chamar");
			return;
		}
		int Len_filaPrioritarios = filaPrioritarios.size();
		int Len_filaNormal = filaNormal.size();
		if ((Len_filaPrioritarios % 3 == 1) || (Len_filaNormal == 0)) {
			String typeof = "Prioritario";
			Removerfila(filaPrioritarios, typeof);
		}else if(Len_filaNormal > 0) {
			String typeof = "Normal";
			Removerfila(filaNormal, typeof);
		}

	}

	private void Removerfila(Fila fila, String typeof) {
		int numero = 0;
		try {
			numero = fila.remove();
		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(typeof.contains("Prioritario")) {
			JOptionPane.showMessageDialog(null, "Chamando " + typeof + " Senha: " + numero);
		}else {
			JOptionPane.showMessageDialog(null, "Chamando " + typeof + " Senha: " + numero);
		}
	}

}