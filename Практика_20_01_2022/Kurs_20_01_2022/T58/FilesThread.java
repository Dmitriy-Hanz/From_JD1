package Kurs_20_01_2022.T58;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class FilesThread implements Callable<Collection<String>> {
    final int FILES_COUNT = 10;
    final int RANDOMSTRING_LENGTH= 10;
    final String DIRECTORY_NAME = "T58_Files";

    @Override
    public Collection<String> call() throws Exception {
        System.out.println(Thread.currentThread().getName());

        List<String> filesNames = new ArrayList<>();
        File f = new File(DIRECTORY_NAME);
        f.mkdir();

        for (int i = 0; i < FILES_COUNT; i++) {
            f = new File(DIRECTORY_NAME + "/T58_" + (int)(Math.random()*1000+1) + ".txt");
            try {
                f.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }

            try(FileWriter fw = new FileWriter(f)){
                fw.write(Stream.generate(()-> String.valueOf((char)(int)(Math.random()*110+10))).limit(RANDOMSTRING_LENGTH).reduce((p1,p2) -> p1 + p2).get());
            } catch (IOException e){
                e.printStackTrace();
            }
            filesNames.add(f.getName());
        }
        Thread.sleep((int)(Math.random()*3+1)*1000);
        return filesNames;
    }
}
