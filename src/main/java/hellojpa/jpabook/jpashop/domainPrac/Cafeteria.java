package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cafeteria {

    @Id @GeneratedValue
    @Column(name = "cafeteria_Id")
    private Long id;

    @OneToMany(mappedBy = "cafeteria", fetch = FetchType.LAZY)
    private List<OrderCafeteria> orderCafeteria = new ArrayList<>();

    @Column(name = "call_number")
    private String callNumber;
}
