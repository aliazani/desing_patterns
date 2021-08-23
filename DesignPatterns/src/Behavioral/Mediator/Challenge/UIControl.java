package Behavioral.Mediator.Challenge;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler handler) {
        eventHandlers.add(handler);
    }

    public void notifyHandlers() {
        for (var handler : eventHandlers)
            handler.handle();
    }
}
