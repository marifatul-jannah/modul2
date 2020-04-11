/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Thole
 */
public class Praktikum5 {
    public static void main(String[] args) {
        Image image = null;
        try {
            //membaca dari lokasi yang di tentukan
            File resourceimage = new File("E:/yudharta.png");
            image = ImageIO.read(resourceimage);
            //membaca file dari yang di tentukan
            InputStream ia = new BufferedInputStream(new FileInputStream("E:/yudharta.png"));
            image = ImageIO.read(ia);
        } catch (IOException e){
        }
        //menggunnakan label untuk ditampilkan sebagai gambar
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
