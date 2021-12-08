package heech.hellcoding.board.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HC_BOARD")
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(name = "BOARD_NM")
    private String boardNm;

    @Column(name = "BOARD_CN")
    private String boardCn;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "CREATED_TIME")
    private Date createdTime;

    @Column(name = "UPDATED_TIME")
    private Date updatedTime;
}
