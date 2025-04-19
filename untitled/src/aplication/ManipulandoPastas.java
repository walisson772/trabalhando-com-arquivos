package aplication;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho para a pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Pastas:");
        for (File pasta : folders){
            System.out.println(pasta);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Arquivos:");
        for (File file : files){
            System.out.println(file);
        }
        sc.close();
    }
}
