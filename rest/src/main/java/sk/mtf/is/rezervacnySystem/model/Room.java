package sk.mtf.is.rezervacnySystem.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.SEQUENCE;


@Entity
@Table(name = "rs_tbl_room")
public class Room {
    @Id
    @Column
    @SequenceGenerator(name = "room_seq_id", sequenceName = "room_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "room_seq_id")
    private Integer roomId;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "floorid")
    private Floor floor;
    @OneToOne
    @JoinColumn(name = "vytvorilo_id_user_id")
    private User vytvoriloID;


    @ManyToOne
    @JoinColumn(name = "id_budovy_building_id")
    private Building idBudovy;

    private int pocetStolov;

    public Floor getFloor() {
        return floor;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public User getVytvoriloID() {
        return vytvoriloID;
    }

    public void setVytvoriloID(User vytvoriloID) {
        this.vytvoriloID = vytvoriloID;
    }

    public Building getIdBudovy() {
        return idBudovy;
    }

    public void setIdBudovy(Building idBudovy) {
        this.idBudovy = idBudovy;
    }

    public int getPocetStolov() {
        return pocetStolov;
    }

    public void setPocetStolov(int pocetStolov) {
        this.pocetStolov = pocetStolov;
    }
}
