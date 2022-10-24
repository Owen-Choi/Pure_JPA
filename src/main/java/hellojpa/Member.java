package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table("USER")
// 테이블 명이 클래스명과 다르다면 위와 같이 매핑 가능
public class Member {

    @Id
    private Long id;

//    @Column(name = "username")
    // 칼럼 명이 변수명과 다르다면 위와 같이 매핑 가능
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
