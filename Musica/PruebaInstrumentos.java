package musica;

public class PruebaInstrumentos {

    public static void main(String arg[]) {
       
        InstrumentosMusicales miGuitarra = new Guitarra();
        System.out.println("Instrumento : " + miGuitarra.tipodeinstrumento);
        miGuitarra.tocarInstrumento();
        System.out.println();
        
        InstrumentosMusicales miPiano = new Piano();
        System.out.println("Instrumento : " + miPiano.tipodeinstrumento);
        miPiano.tocarInstrumento();
        System.out.println();
       
        InstrumentosMusicales miViolin = new Violin();
        System.out.println("Instrumento : " + miViolin.tipodeinstrumento);
        miViolin.tocarInstrumento();
    }
}
