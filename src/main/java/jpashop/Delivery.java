package jpashop;
import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Delivery extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    private String street;
    private String zipCode;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
