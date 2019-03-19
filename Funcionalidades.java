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
		  File archivo = null;
		  FileReader fr = null;
		  BufferedReader br = null;

		  try {
			 // Apertura del fichero y creacion de BufferedReader para poder
			 // hacer una lectura comoda (disponer del metodo readLine()).
			 archivo = new File ("C:\\archivo.txt");
			 fr = new FileReader (archivo);
			 br = new BufferedReader(fr);

			 // Lectura del fichero
			 String linea;
			 while((linea=br.readLine())!=null)
				System.out.println(linea);
		  }
		  catch(Exception e){
			 e.printStackTrace();
		  }finally{
			 // En el finally cerramos el fichero, para asegurarnos
			 // que se cierra tanto si todo va bien como si salta 
			 // una excepcion.
			 try{                    
				if( null != fr ){   
				   fr.close();     
				}                  
			 }catch (Exception e2){ 
				e2.printStackTrace();
			 }
		  }
	}

	public DescargarCancion() {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}

	public VisualizarPlayList() {
		  List<Model> models = new ArrayList<>();

      
        for(Model model : models) {
            System.out.println(model.getName());
        }

        for(int i = 0; i < models.size(); i++) {
            System.out.println(models.get(i).getName());
        }

	}


	public saved GuardarPlayList() {
	 private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	}



	public CancionSiguiente() {
	try {
            
            if((index+1) < lista.size()){
                index++;
          	Reproducir();
	  }

        } catch (Exception e) {
            System.out.println("" + e);
        }

	

	}


	public CancionAnterior() {

	try {


 	   if(index==0){
                 index = 0;
           }else{
                 index--;
           Reproducir();
	   }
            
        
        } catch (Exception e) {
            System.out.println("" + e);
        }


	}


	public AdelantarCancion() {

	try {
		mi_reproductor = mediaPlayer.PlaybackSession;
   	 	mi_reproductor.Position = session.Position + TimeSpan.FromSeconds(10);
		mi_reproductor.PlaybackSession.BufferingStarted += MediaPlaybackSession_BufferingStarted;
		mi_reproductor.PlaybackSession.BufferingEnded += MediaPlaybackSession_BufferingEnded;

        } catch (Exception ex) {
			
            	System.out.println("Error: " + ex.getMessage());
        }

	}


	public RetrocederCancion() {


	try {
		mi_reproductor = mediaPlayer.PlaybackSession;
   	 	mi_reproductor.Position = session.Position - TimeSpan.FromSeconds(10);
		mi_reproductor.PlaybackSession.BufferingStarted -= MediaPlaybackSession_BufferingStarted;
		mi_reproductor.PlaybackSession.BufferingEnded -= MediaPlaybackSession_BufferingEnded;

        } catch (Exception ex) {
			
            	System.out.println("Error: " + ex.getMessage());
        }


	}




}


// El archivo ha pasado la revision exitosamente - 201025406
// El archivo ha pasado la revision exitosamente - 201021164