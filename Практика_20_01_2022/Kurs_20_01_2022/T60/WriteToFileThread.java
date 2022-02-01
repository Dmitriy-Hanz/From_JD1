package Kurs_20_01_2022.T60;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class WriteToFileThread implements Runnable {
    private File resource;

    public WriteToFileThread(File f) {
        resource = f;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");

        synchronized (resource) {
            try (FileWriter fw = new FileWriter(resource,true)) {
                fw.write("Hello world " + LocalTime.now().toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " end");
    }
}
