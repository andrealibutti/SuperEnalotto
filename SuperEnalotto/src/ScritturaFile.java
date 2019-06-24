import java.io.*;
import java.util.ArrayList;

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
	
	public void scritturaFile(ArrayList<String> a, String nomeFile) {  
		try {
			// Crea un nuovo file
			File file = new File(path + nomeFile + ".txt");

			if (!file.exists()) {
				
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(a.toString());  
				bw.newLine();

				bw.close();
				
			} else {
				//Aggiunge riga in un file gia' esistente
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));

				out.println(a.toString()); 
				out.close();

			}
		}
		//Cattura eccezioni
		catch (Exception e) {
			System.err.println(e);
		}
	}
}
	
	
	


