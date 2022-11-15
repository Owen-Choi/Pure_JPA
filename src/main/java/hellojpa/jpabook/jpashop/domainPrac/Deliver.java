package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Deliver {

    @Id @GeneratedValue
    @Column(name = "deliver_Id")
    private Long id;

    @OneToOne(mappedBy = "deliver")
    private Student student;

    // 단방향 매핑으로 설계를 끝내는게 베스트라고 해서 DeliveryOrder와 양방향을 맺지 않으려고 했으나
    // 배달원 입장에서 배달 내역을 조회하는 일이 많을 것 같아 양방향으로 매핑하였다.

    @OneToMany(mappedBy = "deliver", fetch = FetchType.LAZY)
    private List<DeliveryOrder> deliveryOrders = new ArrayList<>();
}
