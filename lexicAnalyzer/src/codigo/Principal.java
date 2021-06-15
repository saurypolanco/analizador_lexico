package codigo;

import java.io.File;

/**
 *
 * @author Saury Polanco
 */
public class Principal {
    public static void main(String[] args) {
        String ruta="D:/clases/compiladores/Lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
