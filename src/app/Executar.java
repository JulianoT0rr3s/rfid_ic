package app;

import controller.EscreverArquivoTxt;
import java.io.IOException;
import view.VisualizarLeituraTxt;

public final class Executar {
    
    //inicio de tudo
    public static void main(String[] args) throws IOException {

        /*ToDo:
         * a aplicação deve solicitar o caminho e arquivo
         * preferindo ter isso armazenado previamente
         * em um módulo de configuração
         */
        
        //localização do arquivo
        String Caminho = "C:\\ic\\app_eReader\\";
        String Arquivo = "SnNameRecord.txt";
        String Completo = Caminho + Arquivo;

        VisualizarLeituraTxt ler = new VisualizarLeituraTxt();
        ler.executarLeitura(Completo);
        
        //cuidado nesta parte (ela apaga o arquivo)
        EscreverArquivoTxt escrever = new EscreverArquivoTxt();
        escrever.escrevendo(Arquivo);
        
    }
    
}
