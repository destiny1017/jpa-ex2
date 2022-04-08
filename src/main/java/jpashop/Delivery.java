package jpashop;
import javax.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    private String street;
    private String zipCode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
