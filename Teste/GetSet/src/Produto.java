import javax.swing.JOptionPane;

public class Produto {

	private static int numero;
	private String nome;
	private double preco;

	public static int getNumero() {
		return numero;
	}

	public static void setNumero(int num) {
		numero = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String descricao) {
		nome = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double prec) {
		preco = prec;

	}

}
