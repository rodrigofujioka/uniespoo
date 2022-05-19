package br.uniesp.poo.serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManipulaArquivo {

    public static void escreverDados(){
        FileOutputStream arq;
        try {
            arq = new FileOutputStream("Dados.dat");
            for(int cont = 65; cont<90;cont ++){
                arq.write(cont);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerDados(){
        FileInputStream arq;
        int letra = 0;
        try {
            arq = new FileInputStream("dados.dat");
            while(letra!=-1){
                letra = arq.read();
                System.out.println(letra);
            }
            arq.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
