import java.io.*;

public class ScritturaFile {
	
	private String path;

	
	//Metodi getter and setter di directory (path) dove verra' salvato il file
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	//Metodo scrittura file
	
	//DA AGGIUNGERE OGGETTO NEL COSTRUTTORE - TIPO DA DEFINIRE
	public void scritturaFile(String nomeFile) {  
		try {
			// Crea un nuovo file
			File file = new File(path + nomeFile + ".txt");

			if (!file.exists()) {
				
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(object.toString());  //DA AGGIUNGERE OGGETTO - TIPO DA DEFINIRE

				bw.newLine();

				bw.close();
				
			} else {
				//Aggiunge riga in un file gia' esistente
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));

				out.println(object.toString()); //DA AGGIUNGERE OGGETTO - TIPO DA DEFINIRE

				out.close();

			}
		}
		//Cattura eccezioni
		catch (Exception e) {
			System.err.println(e);
		}
	}

	
	
	

}
