
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
	    Scanner l = new Scanner(System.in);
		GereFace gf = new GereFace();
		
		System.out.println("Ordem decrescente por email");
		Contato novoC = new  Contato("Fernanda","f@gmail.com");
		gf.inserirDes(novoC);
	    novoC = new  Contato("Adriana","a@gmail.com");
	    gf.inserirDes(novoC);
	    novoC = new  Contato("Wallace","w@gmail.com");
	    gf.inserirDes(novoC);
	    novoC = new  Contato("Elisabeth","e@gmail.com");
	    gf.inserirDes(novoC);
	    gf.imprimirE();
	    
	    System.out.println("Ordem Crescente por nome");
		gf.addAsc("Fernanda","f@gmail.com");
		gf.addAsc("Adriana","a@gmail.com");
		gf.addAsc("Wallace","w@gmail.com");
		gf.addAsc("Elisabeth","e@gmail.com");
     	gf.imprimirN();
	}
}
