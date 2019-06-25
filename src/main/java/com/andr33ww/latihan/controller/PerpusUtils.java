package com.andr33ww.latihan.controller;

import org.springframework.stereotype.Controller;

@Controller
public class PerpusUtils {
    public String titleCase(String kata){
        return kata.substring(0, 1).toUpperCase() +kata.substring(1, kata.length());
    }

    public String titleCaseKalimat(String kalimat){
        String[] arrKata = kalimat.split(" ");
        String hasil = "";
        for(int i=0; i<arrKata.length; i++){
            hasil += titleCase(arrKata[i]);
            if(i!=arrKata.length-1){
                hasil += " ";
            }
        }
        return hasil;
    }
}