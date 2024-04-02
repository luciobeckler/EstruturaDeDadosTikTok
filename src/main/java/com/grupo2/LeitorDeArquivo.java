package com.grupo2;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeitorDeArquivo {
  public LeitorDeArquivo(String caminhoData) {

    try {
      BufferedReader buffer = new BufferedReader(new FileReader(caminhoData));
      String linha = buffer.readLine();
      ;
      while ((linha = buffer.readLine()) != null) {
        System.out.println(linha);

      }
    } catch (Exception e) {
      System.err.println(e);
    }

  }
}
