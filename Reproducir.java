//Release 1.0
package reproductor;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


public class Reproductor {
  

    public Reproducir(int modoRep) {
        
		if (modoRep ==0){
			
			ReproduccionAleatoria();
		}


    }
	
	
	
	public ReproduccionAleatoria() {
        
		 try {
			Reproductor   mi_reproductor = new Reproductor();
            mi_reproductor.AbrirFichero("C:/Users/Public/Music/Sample Music/Kalimba.mp3");
            mi_reproductor.Play(0);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }


    }


}