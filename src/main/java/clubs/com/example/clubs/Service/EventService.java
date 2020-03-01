package clubs.com.example.clubs.Service;

import clubs.com.example.clubs.Entity.Event;
import clubs.com.example.clubs.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class EventService implements IBaseService<Event> {

    @Autowired
    @Qualifier("eventRepository")
    private EventRepository eventRepository;

    @Override
    public List<Event> getAll() {
        List<Event> all = eventRepository.findAll();
        return all;
    }

    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void update(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void delete(List<Event> t) {
        eventRepository.delete((Event) t);
    }
}
