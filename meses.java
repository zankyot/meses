package mes;
import javax.swing.*;
public class meses {

	public static void main(String[] args) {
		int nul;
		String mes = null;
		JOptionPane.showMessageDialog(null, "Esse programa mostrará o mês correspondente ao número digitado");
		nul = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número de 1 até 12"));
		switch (nul) {
		case 1:
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;
			default:
				JOptionPane.showMessageDialog(null,"Número Inválido");
		}
		JOptionPane.showMessageDialog(null,"O mês escolhido foi: "+mes);

	}

}
