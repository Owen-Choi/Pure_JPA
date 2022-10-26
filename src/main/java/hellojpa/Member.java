package hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table("USER")
// 테이블 명이 클래스명과 다르다면 위와 같이 매핑 가능
public class Member {

    @Id
    private Long id;

//    @Column(name = "username")
    // 칼럼 명이 변수명과 다르다면 위와 같이 매핑 가능
    @Column(name = "name", updatable = false)
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    // 생성 일자 : DATE, TIME, TIMESTAMP 3가지 타입이 있다.
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    // 수정 일자
    private Date lastModifiedDate;

    @Lob
    // DB에 varchar를 넘어서는 뭔가 큰 것을 넣고싶으면 Lob을 쓴다.
    // clob : 문자열 타입, blob : 이진(binary) 대형 객체
    private String description;

    @Transient
    // temp필드는 DB에 반영하지 않겠다.
    private String temp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
