package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id @GeneratedValue
    @Column(name = "customer_Id")
    private Long id;

    @OneToOne(mappedBy = "customer")
    private Student student;

    // Deliver와 마찬가지로 주문 내역을 조회할 일이 있을 것 같아서 양방향으로 매핑
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

}
