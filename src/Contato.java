
public class Contato {
	private String nome;
	private String email;
	Contato proxE;
	Contato proxN;
	public Contato(String nome,String email) {
	  this.nome=nome;
	  this.email=email;
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public Contato getProxE() {
		return proxE;
	}
	public void setProxE(Contato proxE) {
		this.proxE = proxE;
	}
	public Contato getProxN() {
		return proxN;
	}
	public void setProxN(Contato proxN) {
		this.proxN = proxN;
	}
	
	   
}
