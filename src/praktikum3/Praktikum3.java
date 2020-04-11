/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Thole
 */
public class Praktikum3 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter your name : ");
            //memanggil apa yang di input
            InputStream input = System.in;
            //membuat inpurreader
            InputStreamReader reader = new InputStreamReader(input);
            //menyambungkan ke buffer reader untuk di gunakan
            BufferedReader bufReader = new BufferedReader(reader);
            String name = bufReader.readLine();
            System.out.println("please to meet you, " + name);
        } catch (IOException ioe){
            System.err.println("I/O error : " + ioe);
        }
    }
}
