package ge.edu.btu.searchdirectory.service.impl;

import ge.edu.btu.searchdirectory.service.FilesService;

import java.io.File;
import java.io.FilenameFilter;

public class FilesClass implements FilesService {

    @Override
    public String[] GetFileNames(String word) {
        File file = new File("C:\\Windows\\System32");
        String[] fileNames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                String searchKey = word;

                if (name.toLowerCase().contains(searchKey.toLowerCase())) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        return fileNames;
    }
}
