package produto;

public class pacotes {

 public static void main(String[] args) {
	 
	 produto p1 = new produto();
	 p1.nome = "Gramado";
	 p1.preco = 2.500;
	 p1.desconto = 0.25;
	 
	 var p2 = new produto();
	 p2.nome = "Fortaleza";
	 p2.preco = 3.000;
	 p2.desconto = 0.25;
	 
	 System.out.println(p1.nome);
	 
	 double precoFinal1 = p1.preco * (1 - p1.desconto);
	 
	 
 }
}
