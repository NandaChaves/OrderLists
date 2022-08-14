
public class GereFace {
	Contato primE;
	Contato primNome;
	public GereFace() {
	primE = null;
	primNome = null;
	}

	public void addAsc(String nome,String email)
	{
    Contato C = new Contato(nome,email);
	Contato temp=primNome;
	Contato ant = null; 
	     while((temp!=null)&& (C.getNome().compareTo(temp.getNome()))>0)
	     {
	    	ant = temp;
	    	temp = temp.getProxN();
	     }
        C.setProxN(temp);
	 //cria novo ele
	     if(ant == null)
	     {C.setProxN(primNome);
	     primNome= C;}
		     else {
		    	 C.setProxN(ant.getProxN());
		    	 ant.setProxN(C);
		     }  
	}//fim do addAsc
	
	public void imprimirN()
	{
	Contato temp=primNome;
	while(temp!=null)
		{
		System.out.println("Nome:"+ temp.getNome());
		System.out.println("Email:"+ temp.getEmail());
		System.out.println();
		temp = temp.getProxN();
		}
	}//fim de imprimir
	
	public void imprimirE()
	{
	Contato temp=primE;
	while(temp!=null)
		{
		System.out.println("Nome:"+ temp.getNome());
		System.out.println("Email:"+ temp.getEmail());
		System.out.println();
		temp = temp.getProxE();
		}
	}//fim de imprimir
	
	
	public void inserirDes(Contato novoC)
	{
	  Contato temp = primE;
	  Contato ant = null;
	  while((temp!=null)&& (novoC.getEmail().compareTo(temp.getEmail()))<0)
	  {
		  ant = temp;
		  temp = temp.getProxE();
	  }
	    novoC.setProxE(temp);
	    if(ant==null)
	    {
	    	novoC.setProxE(primE);
	    	primE = novoC;
	    }
	    else {
	    	 novoC.setProxE(ant.getProxE());
	    	 ant.setProxE(novoC);}
	}//fim de inserirDes

	
}
