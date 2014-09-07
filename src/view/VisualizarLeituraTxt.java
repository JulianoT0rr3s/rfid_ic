package view;

import controller.LerArquivoTxt;
import java.io.IOException;
import java.util.List;

public class VisualizarLeituraTxt {
    
    //Executar a leitura de uma arquivo
    public void executarLeitura(String Arquivo) throws IOException{
        
        String Coletor; 
        List<String> coletor2;
        LerArquivoTxt ler = new LerArquivoTxt();
        
        try{
            
            //método 1 - lê a primeira linha e printa no console
            System.out.println("método 1 - lê a primeira linha e printa no console");
            ler.lendoLinha(Arquivo);

            //-----------------
            System.out.println("--------------------------------------");

            //método 2 - lê a primeira linha e devolve o valor para a classe
            Coletor = ler.coletandoLinha(Arquivo);
            System.out.println("método 2 - lê a primeira linha e devolve o valor para a classe");
            System.out.println(Coletor);
            
            //-----------------
            System.out.println("--------------------------------------");

            //método 3 - lê todo o arquivo e printa no console
            System.out.println("método 3 - lê todo o arquivo e printa no console");
            ler.lendoTudo(Arquivo);
            
            //-----------------
            System.out.println("--------------------------------------");

            //método 4 - lê todo o arquivo e devolve o valor para a classe
            coletor2 = ler.colendoTudo(Arquivo);
            System.out.println("método 4 - lê todo o arquivo e devolve o valor para a classe");
            for (String printar : coletor2) {
                System.out.println(printar);
            }
            
            //-----------------
            System.out.println("--------------------------------------");

        }catch(IOException ex){
            
            System.out.println("Erro durante a visualização da leitura!");
            System.out.println(ex);
            
        }
        
    }
    
}
