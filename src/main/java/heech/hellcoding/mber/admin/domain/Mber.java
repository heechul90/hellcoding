package heech.hellcoding.mber.admin.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "HC_MBER")
@Entity
@Getter
@Setter
public class Mber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_ID", nullable = false, length = 60)
    private String userId;

    @Column(name = "USER_NM", nullable = false, length = 30)
    private String userNm;

    @Column(name = "PASSWORD", nullable = false, length = 30)
    private String password;

    @Column(name = "USER_AUTH")
    private String userAuth;

    @Column(name = "REGIST_PNTTM")
    private LocalDateTime registPnttm;

}
