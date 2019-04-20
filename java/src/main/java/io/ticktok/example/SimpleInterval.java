package io.ticktok.example;

import io.ticktok.client.Ticktok;

import static io.ticktok.client.Ticktok.options;

public class SimpleInterval {

    public static void main(String[] args) {
        new Ticktok(options().domain(args[0]).token(args[1]))
                .schedule("kuku-clock", "every.10.seconds", () -> System.out.println("tick"));
    }
}
