package sk.mtf.is.rezervacnySystem.model;

import javax.persistence.*;

@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int buildingId;
    @Column(name = "nazov")
    private String nazov;
    @Column(name = "skratka_Budovy", length = 10)
    private String skratka;
    @Column(name = "pocet_poschodi" )
    private Integer pocet_poschodi;


    public Integer getId() {
        return buildingId;
    }

    public void setId(Integer id) {
        this.buildingId = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getSkratka() {
        return skratka;
    }

    public void setSkratka(String skratka) {
        this.skratka = skratka;
    }

    public Integer getPocet_poschodi() {
        return pocet_poschodi;
    }

    public void setPocet_poschodi(Integer pocet_poschodi) {
        this.pocet_poschodi = pocet_poschodi;
    }
}
