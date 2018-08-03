package pl.akademiakodu.clinic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id2;

    private String name2;
    private String surname2;
    private String pesel;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Integer getId2() { return id2; }

    public void setId2(Integer id2) { this.id2 = id2; }
}
