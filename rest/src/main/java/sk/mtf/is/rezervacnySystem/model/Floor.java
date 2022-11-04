package sk.mtf.is.rezervacnySystem.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Floor {

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer floorId;
}
