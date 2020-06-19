package io.ticktok.example.spring;

import io.ticktok.client.Ticktok;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ticks")
public class TicksController {

    private List<Tick> ticks = new ArrayList<>();
    private Ticktok ticktok = new Ticktok(Ticktok.options().domain("http://localhost:9643").token("1234"));

    @PostConstruct
    public void init() {
        ticktok.schedule("kuku", "every.5.seconds", () -> { ticks.add(new Tick(System.currentTimeMillis())); });
    }

    @GetMapping
    public List<Tick> findTicks() {
        return ticks;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @ToString
    static class Tick {
        private long time;
    }

}
