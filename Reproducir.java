package reproductor;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


public class Reproductor {
  

    public Reproducir() {
        
	if (modRep = 1){
	ReproducciónNoAleatoria();
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