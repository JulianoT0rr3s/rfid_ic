package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivoTxt{
    
    public void escrevendo(String arquivo) throws IOException{
        /* ToDo: 
         * esta parte apaga todo o arquivo e escreve
         * queremos incluir no fim do arquivo
         */
        try{
            
            BufferedWriter novo;
            novo = new BufferedWriter(new FileWriter(arquivo));
            novo.write("Gravação realizada com sucesso !!!!");
            novo.newLine();
            novo.close();
            
        }catch(IOException ex){
            
            System.out.println("Erro durante a escrita!");
            System.out.println(ex);
            
        }

    }
    
}
