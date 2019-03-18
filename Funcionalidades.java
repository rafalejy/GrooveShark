package reproductor;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


public class Funcionalidades{
  


    public Funcion(int modoRep) {

	int index = 0;

        if (modoRep ==0){			
		SubirCancion();
	}

	if (modoRep ==1){
		DescargarCancion();
	}

        if (modoRep ==3){			
		VisualizarPlayList();
	}

	if (modoRep ==4){
		GuardarPlayList();
	}


        if (modoRep ==5){			
		CancionSiguiente();
	}

	if (modoRep ==6){
		CancionAnterior();
	}


        if (modoRep ==7){			
		AdelantarCancion();
	}

	if (modoRep ==8){
		RetrocederCancion();
	}


    }



    public Reproducir(){

	if (modoRep ==0){			
		ReproduccionAleatoria();
	}

	if (modoRep ==1){
		ReproduccionNoAleatoria();
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
	
	

 	public SubirCancion() {

	}


	public VisualizarPlayList() {

	}


	public GuardarPlayList() {

	}



	public CancionSiguiente() {

	  if((index+1) < lista.size()){
                index++;
          	Reproducir();
	  }

	}


	public CancionAnterior() {

 	   if(index==0){
                 index = 0;
           }else{
                 index--;
           Reproducir();
	   }

	}


	public AdelantarCancion() {

	}


	public RetrocederCancion() {

	}




}