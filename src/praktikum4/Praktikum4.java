/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Thole
 */
public class Praktikum4 {
    public static void main(String[] args) {
        try {
            //mendapatkan output 
            OutputStream output = System.out;
            //membuat output streamwriter
            OutputStreamWriter writer = new OutputStreamWriter(output);
            //membaca untuk di tampilkan
            writer.write("hallo dunia");
            //flush dan menutup
            writer.flush();
            writer.close();
        } catch (IOException ioe){
            System.err.println("I/O error : " + ioe);
        }
    }
}
