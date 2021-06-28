package at.aau.ESOP.AB11.AB4;

import java.util.jar.Attributes;

/**
 * Created by Nikita on 16.06.2021 at 19:29
 */
public class checkFilenameTest {
    public static void main(String[] args) {
        checkFilename("a file.pdf"); //valid
        checkFilename("name of the_file.longExtension"); // invalid
        checkFilename("_REGEX-check.1"); //valid
        checkFilename("template__file 123.html"); // valid
        checkFilename("-_-.no"); // valid
        checkFilename(" .HIDDEN"); // invalid
    }

    public static void checkFilename(String input){

        if (input.matches("^[a-zA-Z0-9\\-_\\s]+(\\.[a-zA-Z0-9]{1,5})+$")){
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
