package Behavioral.Mediator.SolutionObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler event) {
        eventHandlers.add(event);
    }

    protected void notifyObservers() {
        for (var eventHandler : eventHandlers)
            eventHandler.handle();
    }
}
