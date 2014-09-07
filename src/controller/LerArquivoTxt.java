package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivoTxt {
    
    /*ToDo:
     * os métodos de leitura deverão quebrar a linha de retorno em campos
     */
    
    //método 1 - lê a primeira linha e printa no console
    public void lendoLinha(String Arquivo) throws IOException{
        try{ 
            
            String Linha;
            try (BufferedReader Lendo = new BufferedReader(new FileReader (Arquivo))) {
                Linha = Lendo.readLine();
            }
            System.out.println(Linha);
            
        }catch (IOException ex) {
            
            System.out.println("Erro durante a execução da leitura! (M1)");
            System.out.println(ex);
            
        }

    }
    
    //método 2 - lê a primeira linha e devolve o valor para a classe
    public String coletandoLinha(String Arquivo) throws IOException{
        
        /*ToDo:
         * seria melhor ter o try/catch?
         */
        String Linha;
        try (BufferedReader Lendo = new BufferedReader(new FileReader (Arquivo))) {
            Linha = Lendo.readLine();
        }
        return Linha;
        
    }
    
    //método 3 - lê o arquivo e devolve o valor para a classe
    public void lendoTudo(String Arquivo)throws IOException{
        
        /*ToDo:
         * seria melhor ter o try/catch?
         */
        try (BufferedReader Lendo = new BufferedReader(new FileReader (Arquivo))) {
            while (Lendo.ready()){
                System.out.println(Lendo.readLine());  
            }
        }

    }
    
    public List<String> colendoTudo(String Arquivo)throws IOException{
        
        /*ToDo:
         * seria melhor ter o try/catch?
         */
        List<String> valor = new ArrayList<>();
        try (BufferedReader Lendo = new BufferedReader(new FileReader (Arquivo))) {
            while (Lendo.ready()){
                valor.add(Lendo.readLine());
            }
        }
        return valor;
        
    }
    
}
