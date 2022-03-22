package principal;

import modelo.Luta;
import modelo.Lutador;

public class LutadorMain {
	
	public static void main(String[] args) {
		Lutador[] l = new Lutador[6]; 
				
				
		l[0] = new Lutador("Pretty Boy", "França", 31 , 1.75f, 60.9f, 11 ,2 ,1);
		l[1] = new Lutador("Putsscript", "Brasil", 29 , 1.68f, 60.8f, 14 ,2 ,3);
//			l[0].status();
//			l[1].status();
		
		Luta UEF = new Luta();
		
		UEF.marcarLuta(l[0], l[1]);
		UEF.lutar();
		l[0].status();
		l[1].status();
	}

}
