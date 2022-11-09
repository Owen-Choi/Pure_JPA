package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.*;

@Entity
public class Student {

    @Id @GeneratedValue
    @Column(name = "student_id")
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "deliver_Id")
    private Deliver deliver;

    @OneToOne
    @JoinColumn(name = "customer_Id")
    private Customer customer;

}
