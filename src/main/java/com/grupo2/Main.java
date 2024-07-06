package com.grupo2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LeitorDeArquivo.leArquivoEgeraListaDeVideos("src/main/resources/data/tiktok_dataset.csv");

        Video.getListaVideos().forEach(video -> {
            System.out.println(video.printVideoAtributos() + "\n");
        });
    }
}