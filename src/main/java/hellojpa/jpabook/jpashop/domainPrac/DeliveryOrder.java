package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;

@Entity
public class DeliveryOrder {

    @Id @GeneratedValue
    @Column(name = "delivery_order_Id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deliver_Id")
    private Deliver deliver;

    @ManyToOne
    @JoinColumn(name = "order_Id")
    private Order order;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;
}
