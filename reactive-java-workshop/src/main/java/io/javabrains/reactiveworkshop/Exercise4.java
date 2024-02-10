package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(number -> System.out.println(number));

        // Get the value from the Mono into an integer variable
        // Reactive Programming에서 사실 block 별로임. 반응형 프로그래밍의 이점을 포기하게됨
        // block or blockOptional
        Integer number = ReactiveSources.intNumberMono()
                .blockOptional()
                .orElse(-1);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
