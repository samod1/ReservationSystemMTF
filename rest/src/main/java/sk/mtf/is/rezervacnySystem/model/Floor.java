package sk.mtf.is.rezervacnySystem.model;


import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rs_tbl_floor")
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "floor_id")
    private Integer floorId;


    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "buildingId")
    private Building buildingId;

    @NotNull
    @Column(name = "nazov_poschodia")
    private String nazovPoschodia;

    public User getVytvoriloID() {
        return vytvoriloID;
    }

    public void setVytvoriloID(User vytvoriloID) {
        this.vytvoriloID = vytvoriloID;
    }

    @OneToOne
    @JoinColumn(name = "vytvorilo_id_user_id")
    private User vytvoriloID;



    public Building getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Building buildingId) {
        this.buildingId = buildingId;
    }

    public String getNazovPoschodia() {
        return nazovPoschodia;
    }

    public void setNazovPoschodia(String nazovPoschodia) {
        this.nazovPoschodia = nazovPoschodia;
    }



    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }
}
