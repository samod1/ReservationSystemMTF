package sk.mtf.is.rezervacnySystem.model;


import javax.persistence.*;

@Entity
@Table(name = "rs_tbl_floor")
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "floor_id")
    private Integer floorId;


    @OneToMany
    @JoinColumn(name = "buildingId")
    @Column(name = "building_id")
    private Building buildingId;

    @Column(name = "nazov_poschodia")
    private String nazovPoschodia;


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
