package hellojpa.jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Locker {

    @Id @GeneratedValue
    @Column(name = "LOCKER_ID")
    private Long LockerId;

    private String name;

    @OneToOne(mappedBy = "locker")
    // 누가 주인이 돼도 상관없다.
    // Member 쪽의 locker에서 mappedBy = "member"가 되어도 된다.
    private Member member;
}
