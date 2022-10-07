package sk.mtf.is.rezervacnySystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

@Entity
@Table(name = "rezervacie")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(columnDefinition = "DateTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String datum_od;

    @Column(columnDefinition = "datetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String datum_do;

    @Column(name = "VytvorilPouz")
    private Integer userId;

    private Integer idMiestnost;
    private Integer idStolu;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatum_od() {
        return datum_od;
    }

    public void setDatum_od(String datum_od) {
        this.datum_od = datum_od;
    }

    public String getDatum_do() {
        return datum_do;
    }

    public void setDatum_do(String datum_do) {
        this.datum_do = datum_do;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIdMiestnost() {
        return idMiestnost;
    }

    public void setIdMiestnost(Integer idMiestnost) {
        this.idMiestnost = idMiestnost;
    }

    public Integer getIdStolu() {
        return idStolu;
    }

    public void setIdStolu(Integer idStolu) {
        this.idStolu = idStolu;
    }
}
