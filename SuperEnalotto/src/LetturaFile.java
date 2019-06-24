import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LetturaFile {
	
	private String path;
	private BufferedReader br;
	
	//Metodo get e set boolean di path
	
	public String getPath() {
		return path;
	}

	public boolean setPath(String path) {
		boolean check=false;
		File f = new File(path);
		if(f.exists()){
			this.path=path;
			check=true;
		}
		return check;
	}
	
	//Metodo costruttore di default
	public void ReadFile() {
		
	}
	
	//Metodo costruttore della classe che richiede una stringa
	public void ReadFile (String path) {
		
		File f =new File(path);
		// Verifica dell'esistenza del file e lettura delle righe
		if (f.exists()) {
			try {
				br = new BufferedReader(new FileReader(f));
				String readline = br.readLine();
				while (readline != null) {
					
					System.out.println(readline);
					readline = br.readLine();
				}
				br.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

	
	/**************************************************
 		public static void main(String[] args){
		
		LetturaFile f = new LetturaFile();
		
		if(setPath("C:\\Users\\Sincrono\\Desktop\\"+ nomeFile +".txt")) {
			
			f.ReadFile("C:\\Users\\Sincrono\\Desktop\\"+ nomeFile +".txt"); 
		}
		else {
			System.out.println("File inesistente");
		}
	**************************************************/
		




	





	