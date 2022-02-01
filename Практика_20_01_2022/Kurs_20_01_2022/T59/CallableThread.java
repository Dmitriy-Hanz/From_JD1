package Kurs_20_01_2022.T59;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class CallableThread implements Callable<String> {
    final int NUM_COUNT = 10;

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " start");

        List<Integer> list = Stream.generate(()-> (int)(Math.random()*10+1)).limit(NUM_COUNT).toList();
        String result = list.stream().map((p) -> p.toString()).reduce((p1,p2)-> p1 + p2).get();
        Thread.sleep((int)(Math.random()*10+1)*1000);
        System.out.println(Thread.currentThread().getName() + " end " + result);
        return result;
    }
}
