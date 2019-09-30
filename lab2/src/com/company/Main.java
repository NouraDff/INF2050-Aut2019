package com.company;

import net.sf.json.JSONArray;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        JSONArray collection = JSONReader.getCollectionArray("collection.json");
        System.out.println("Nombre d'albums = " + JSONReader.getNbAlbum(collection));
        System.out.println("\nNombre de singles = " + JSONReader.getNbSingle(collection));
        System.out.println("\nAlbums publiés depuis 2003\n" +  JSONReader.getAlbum2003(collection).toString(1));
        System.out.println("\nAlbums avec un rating de 5\n" + JSONReader.getRating5(collection).toString(1));


        JSONWriter.writeJson();


    }
}
