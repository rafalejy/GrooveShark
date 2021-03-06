package reproductor;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import android.widget.ListView;


public class Reproductor {
  

    public Reproducir(int modoRep) {


        if (modoRep ==0){			
		ReproduccionAleatoria();
	}

	if (modoRep ==1){
		ReproducciónNoAleatoria();
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


    public ReproduccionNoAleatoria() {
 	try {
            
            // Se obtiene un Clip de sonido
            Clip sonido = AudioSystem.getClip();
            
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(new File("wav2.wav")));
            
            // Comienza la reproducción
            sonido.start();
            
            // Espera mientras se esté reproduciendo.
            while (sonido.isRunning())
                Thread.sleep(1000);
            
            // Se cierra el clip.
            sonido.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
	
    }
	
	
	



}


// El archivo ha pasado la revision exitosamente - 201025406
// El archivo ha pasado la revision exitosamente - 201021164