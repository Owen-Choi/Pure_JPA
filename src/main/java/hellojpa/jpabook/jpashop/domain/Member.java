package hellojpa.jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ID")
    // GeneratedValue의 strategy는 default가 AUTO
    private Long id;

    @Column(name="USERNAME")
    private String username;

//    @Column(name = "TEAM_ID")
//    private Long teamId;


    @ManyToOne
    // Member가 N이고 Team이 1이다.
    // 따라서 @ManyToOne이 된다.
    @JoinColumn(name="TEAM_ID")
    // 조인해야 하는 칼럼이 뭐냐? => TEAM_ID다!
    private Team team;

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

