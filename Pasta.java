package modelo;

import java.util.ArrayList;

public class Pasta implements Explorar {

		private String nome;
		ArrayList<Explorar> explorar;

		public Pasta(String nome) {
			this.nome = nome;
			this.explorar = new ArrayList<Explorar>();
		}

		@Override
		public String getNome() {
			return this.nome;
		}

		public void addArquivoPasta(Explorar ex) {

			this.explorar.add(ex);

		}

		public void listarArquivo() {

			System.out.println("\nArquivos da pasta: " + this.nome);
			System.out.println("---------------------------------------");
			for (int i = 0; i < explorar.size(); i++) {

				System.out.println(explorar.get(i).toString());
			}
			System.out.println("---------------------------------------\n");
		}

		public void removerArquivo(int index) {
			this.explorar.remove(index);

		}

		@Override
		public String toString() {
			return "Pasta: " + this.nome + " " + this.explorar;
		}

	
}
