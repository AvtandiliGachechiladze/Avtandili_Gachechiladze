package ge.edu.btu.searchdirectory;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

import ge.edu.btu.searchdirectory.service.impl.FilesClass;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        final Logger logger=Logger.getLogger(Main.class);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter word");
        String word = myObj.nextLine();

        FilesClass filesClass = new FilesClass();
        String[] fileNames = filesClass.GetFileNames(word);

        logger.info("შემოტანილი სიტყვაა: " + word);
        for (String fileName : fileNames) {
            logger.info("მოიძებნა: " + fileName);
        }
    }
}

