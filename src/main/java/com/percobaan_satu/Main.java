package com.percobaan_satu;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo, Coba Maven Pertama Kali Nih...");

        //Buat Objek Orang
        ObjeckOrang Jamal = new ObjeckOrang();

            // Set properti
            Jamal.setNama("Jamal Fazlur");
            Jamal.setUmur(25);
            Jamal.setBerat(70);

        // Tampilkan Object dalam bentuk Java
        System.out.println("Object Orang di Java: " + Jamal); // com.percobaan_satu.ObjeckOrang@232204a1

        // Library untuk ubah Object Java menjadi Object JSON
        Gson JsonConverter = new Gson();

        // Tampilkan Object dalam bentuk JSON
        System.out.println("Setalah ubah ke JSON: " + JsonConverter.toJson(Jamal)); // {"nama":"Jamal Fazlur","umur":25,"berat":70}


        // Buat Object String JSON
        String Manusia =    "{ \"nama\": \"Fazlur\"," +
                            " \"umur\": 23  }";

        System.out.println("String Java" + Manusia);

        // Convert dari JSON ke Object Java
        System.out.println(JsonConverter.fromJson(Manusia, ObjeckOrang.class));

        //String ManusiaBaru = JsonConverter.fromJson(Manusia, ObjeckOrang.class).getNama();
        System.out.println(JsonConverter.fromJson(Manusia, ObjeckOrang.class).getNama());

    }
}
