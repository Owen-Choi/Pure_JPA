package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;

@Entity
public class OrderCafeteria {

    @Id @GeneratedValue
    @Column(name = "order_cafeteria_Id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_Id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cafeteria_Id")
    private Cafeteria cafeteria;
}
