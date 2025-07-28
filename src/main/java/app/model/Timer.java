package app.model;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Timer {
    private final Long nanoTime;

    public Timer() {
        this.nanoTime = System.nanoTime();
    }

    public Long getTime() {
        return nanoTime;
    }
}