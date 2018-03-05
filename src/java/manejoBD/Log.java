package manejoBD;

import java.io.*;

public class Log {

    private String text;
    
    public Log() { }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public void modificar_log(String text) throws IOException {
//public static void main(String [ ] args){
   //     this.text = text;
        BufferedWriter bw = null;
        FileWriter fw = null;
        
//        File miDir = new File (".");
//       System.out.println ("Directorio actual: " + miDir.getCanonicalPath());
        try {
            String data = "";// = "LOG de operaciones en Academia JJDELROM\n"+"text";
            File file = new File("/home/jj/Escritorio/academia_log.txt");
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                data = "LOG DE ACADEMIA JJDELROM\n################################################################################\n";
                file.createNewFile();
            }
            data = data+text+"\n";
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("Insercion correcta en LOG!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
