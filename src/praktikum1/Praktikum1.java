/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Thole
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //lokasi penyimpanan
        InputStream fileInput = new FileInputStream("E:/dokumen.txt");
        int data = fileInput.read();
        while (data != -1) {
            System.out.println((char)data);
            data = fileInput.read();
        }
        fileInput.close();
    }
    
}
