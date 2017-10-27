import javax.swing.JOptionPane;

public class ProdutoMain {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		Produto p2 = new Produto();

		p1.setNome("Teste");
		p1.setNumero(10);
		p1.setPreco(5.32);

		JOptionPane.showMessageDialog(null, p1.getNome());
		JOptionPane.showMessageDialog(null, p1.getNumero());
		JOptionPane.showMessageDialog(null, p2.getNumero());

		String varNome = p1.getNome();
		int varNum = p1.getNumero();
		double varPreco = p1.getPreco();

		JOptionPane.showMessageDialog(null, "Nome: " + varNome);
		JOptionPane.showMessageDialog(null, "Número: " + varNum);
		JOptionPane.showMessageDialog(null, "Preço: " + varPreco);

	}

}
