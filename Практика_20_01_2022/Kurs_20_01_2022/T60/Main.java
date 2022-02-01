package Kurs_20_01_2022.T60;

import Kurs_20_01_2022.T59.CallableThread;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static final int TASK_COUNT = 10;
    static final String FILE_NAME = "T60.txt";

    public static void main(String[] args) {
        ExecutorService exs = Executors.newFixedThreadPool(3);

        File f = createNewFile(FILE_NAME);

        for (int i = 0; i < TASK_COUNT; i++) {
           exs.submit(new WriteToFileThread(f));
        }

        exs.shutdown();
    }

    private static File createNewFile(String fileName) {
        File f = new File(fileName);
        try {
            if (f.exists()){
                f.delete();
            }
            f.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
        return f;
    }
}
