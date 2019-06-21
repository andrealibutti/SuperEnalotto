

public class Utilities {

	public static void main(String[] args) {
		
		public void actionPerformed(ActionEvent laallalaa) {
			if (e.getSource()==b) {
			System.exit(0);
			}
			if(e.getSource()==b2) {
				tf.setText(" ");
				
				
			}
			if(e.getSource()==b3) {
				this.testo=tf.getText();
				if(cc.setPin(testo)) {
					g2=new Gestione2();
					this.dispose();
					System.out.println("Pin giusto");
					
				}else {
					contatore--;
					l.setText("hai ancora "+contatore+" tentativi");
					if(contatore==0) {
						
						System.exit(0);
						
					}
					
				}
				
				
		
				
			}
		
	}

}
