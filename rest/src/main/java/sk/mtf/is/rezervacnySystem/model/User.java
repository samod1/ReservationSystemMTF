package sk.mtf.is.rezervacnySystem.model;


import javax.persistence.*;


@Entity
@Table (name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private int id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String meno;
    @Column(nullable = false)
    private String priezvisko;
    @Column(nullable = false)
    private String datumNarodenia;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private Integer studentMtf;
    private Integer status;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(String datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStudentMtf() {
        return studentMtf;
    }

    public void setStudentMtf(Integer studentMtf) {
        this.studentMtf = studentMtf;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }
}
