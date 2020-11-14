package lukasz.nowogorski.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class HotelNameNotFound extends RuntimeException {
    public HotelNameNotFound(String message) {
    }
}
