package Kurs_20_01_2022.T58;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        final int TASK_COUNT = 10;
        ExecutorService exs = Executors.newFixedThreadPool(3);

        List<Future<Collection<String>>> results = new ArrayList<>();
        for (int i = 0; i < TASK_COUNT; i++) {
            results.add(exs.submit(new FilesThread()));
        }

        exs.shutdown();
    }

}
