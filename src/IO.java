
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author C5
 */
public class IO {

    public static void main(String[] args) {

        try {
            writeFile();
//            readFile();
//           writeData();

        } catch (IOException e) {
            System.out.println("Io Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
//        writeFile02();

    }

    public static void writeFile() throws IOException {

        String[] names = {"Mash", "Hassan", "Tamim"};

        BufferedWriter bfw = new BufferedWriter(new FileWriter("F:\\xyz.txt", true));

        for (String name : names) {
            bfw.write("Hello " + name + "!!\n");
        }
        bfw.close();
    }
}
