package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWrite {
    public static void main(String[] args){

        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = "D:\\exercicio\\trabalhando-com-arquivos\\untitled\\src\\out";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
