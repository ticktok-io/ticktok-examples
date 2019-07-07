package io.ticktok.example;

import io.ticktok.client.Ticktok;

import static io.ticktok.client.Ticktok.options;

public class ManualTick {

    public static void main(String[] args) {
        final Ticktok ticktok = new Ticktok(options().domain(args[0]).token(args[1]));
        ticktok.schedule("non-scheduled-tick", "@never", () -> System.out.println("tick"));
        ticktok.tick("non-scheduled-tick", "@never");
    }
}
