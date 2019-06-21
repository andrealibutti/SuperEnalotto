import java.util.regex.*;


public class Utilities {
	
	private static String nome;
	private static String numerici;
	private static String email;
	
	
	//setter e getter nome/cognome
	public static String getNome() {
		return nome;
	}
	public static boolean setNome(String nome) {
		boolean check=false;
		String regex="[a-zA-Z] {1,20}";
		Pattern patt=Pattern.compile(regex);
		Matcher m=patt.matcher(nome);
		if(m.matches()) {
			Utilities.nome = nome;
			check=true;
		}
		return check;
		
	}
	
	//setter e getter numerici

	public static String getNumerici() {
		return numerici;
	}
	public static boolean setNumerici(String numerici) {
		boolean check=false;
		String regex="[0-9] {1,20}";
		Pattern patt=Pattern.compile(regex);
		Matcher m=patt.matcher(numerici);
		if(m.matches()) {
			Utilities.numerici = numerici;
			check=true;
		}
		return check;
	}
	
	//setter e getter email

	public static String getEmail() {
		return email;
	}
	public static boolean setEmail(String email) {
		boolean check=false;
		String regex="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*"
				+ "+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern patt=Pattern.compile(regex);
		Matcher m=patt.matcher(email);
		if(m.matches()){
			Utilities.email = email;
			check=true;

		}
		return check;
		
	}
	
	
	
	
	
	

}
