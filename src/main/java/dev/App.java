package dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String asciiArt1 = "Hello World !";

        try {
            asciiArt1 = FigletFont.convertOneLine("Hello World !");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(asciiArt1);
    }
}
