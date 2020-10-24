package hotel_app.hotel.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Booking booking;

    @OneToOne
    private Customer customer;

    @ManyToMany
    private Set<Extra> extras;

    @Enumerated(EnumType.STRING)
    private Diet diet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
