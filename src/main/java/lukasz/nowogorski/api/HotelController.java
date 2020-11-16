package lukasz.nowogorski.api;

import lukasz.nowogorski.domain.model.Hotel;
import lukasz.nowogorski.infrastructure.postgres.HotelRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HotelController {

    private final HotelRepository repository;

    public HotelController(HotelRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hotels")
    public List<Hotel> getHotel()
    {
        return repository.findAll();
    }


    @GetMapping("/hotels/{id}")
    public Optional<Hotel> getHotel(@PathVariable Long id)
    {
        return repository.findById(id);
    }

    @GetMapping("/hotels/{name}")
    public Hotel getName(@PathVariable String name)
    {
        return repository.findHotelByName(name);
    }


    @PostMapping("/hotels")
    public Hotel saveHotel(@RequestBody Hotel hotel)
    {
        return repository.save(hotel);
    }

    @PutMapping("/hotels/{id}")
    public Hotel updateHotel(@RequestBody Hotel hotel, @PathVariable Long id)
    {
        return repository.updateHotel(hotel,id);
    }

    @DeleteMapping("/hotels")
    public void deleteHotel()
    {
        repository.deleteAll();
    }

    @DeleteMapping("/hotels/{id}")
    public void deleteHotel(@PathVariable Long id)
    {
        repository.deleteById(id);
    }
}