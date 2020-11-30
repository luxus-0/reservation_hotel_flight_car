package lukasz.nowogorski.service.validation;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Log4j2
public class ValidReservationYear
{
        public void validate(LocalDateTime checkIn, LocalDateTime checkOut)
        {
            if(checkOut.getYear() < checkIn.getYear())
            {
                log.error("Year check out less than Year check in!!");
            }
            else
            {
                log.info("Check in: " +checkIn);
                log.info("Check out: " +checkOut);
            }
        }
}
