package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_Id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private Customer customer;

    @Embedded
    private OrderInfo orderInfo;

    @OneToMany(mappedBy = "order")
    private List<OrderCafeteria> orderCafeteria = new ArrayList<>();

    // Order와 DeliveryOrder는 단방향으로 매핑하겠음

}
