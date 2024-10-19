package dev;

import com.github.lalyos.jfiglet.FigletFont;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Logger LOGGER = LoggerFactory.getLogger(App.class);

        LOGGER.info("Hello Slf4J !");
        LOGGER.info("Logback implementation");

        String asciiArt1 = "Hello World !";

        try {
            asciiArt1 = FigletFont.convertOneLine("Hello World !");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println(asciiArt1);
    }
}
