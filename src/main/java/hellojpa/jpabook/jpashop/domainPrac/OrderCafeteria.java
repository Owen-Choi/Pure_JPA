package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;

@Entity
public class OrderCafeteria {

    @Id @GeneratedValue
    @Column(name = "order_cafeteria_Id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_Id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "cafeteria_Id")
    private Cafeteria cafeteria;
}
