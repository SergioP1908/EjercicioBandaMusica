public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*clase Instrumento
	nombre
	tipo
	afinado
	
	afinar() --> Afinando instrumento nombre, se afina o no de manera aleatoria
		Math.random()> 0.4 --> El instrumento está afinado
	tocar() --> Tocando instrumento nombre
	
Clase Guitarra hereda de Instrumento
	numCuerdas
	
	afinar() --> Hace lo del padre + afinando guitarra	
	
Clase GuitarraElectrica hereda de Guitarra
	potencia
	
	tocar () --> Tocando muy alto //
	
Clase Piano hereda de Instrumento
	numeroOctavas
	tipoPiano

	afinar() --> Hace lo del padre + Afinando Piano

Clase Tambor hereda de Instrumento
	material
	
	afinar() --> Afinando Tambor (siempre afinado)
	
	aporrear() --> Aporreando Tambor
	
	
BandaMusica
	main ()--> empezarConcierto()//No puede ser estático 
		+ se crea un objeto de cada tipo
	
		+afinarInstrumentos(), 
			+ se ponen todos los instrumentos a afinar
		
		+tocarInstrumentos(), se le pasan todos los instrumentos en un único parámetro
			+ se ponen todos los instrumentos a tocar excepto el tambor que se aporrea
			+ Si algún instrumento no está afinado, se indica que la banda suena mal */
    }
}
