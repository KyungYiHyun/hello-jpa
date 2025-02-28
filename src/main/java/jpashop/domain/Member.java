package jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "NAME")
    private String name;

//    private Long teamId;
    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;




}
