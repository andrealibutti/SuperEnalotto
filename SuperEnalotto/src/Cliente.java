
public class Cliente {
	
	private String nome;
	private String cognome;
	private String email;
	private String tel;
	
	
	//COSTRUTTORE DI DEFAULT
	public Cliente() {
		
	}
	
	//COSTRUTTORE DI NOME-COGNOME

	
	public Cliente(String nome,String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	
	//COSTRUTTORE COMPLETO
	
	public Cliente (String nome,String cognome,String email,String tel) {
		this.cognome=cognome;
		this.nome=nome;
		this.email=email;
		this.tel=tel;
	}
	
	
	//Metodi Set e Get NOME

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//Metodi Set e Get COGNOME

	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//Metodi Set e Get EMAIL

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Metodi Set e Get TELEFONO

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
