package pl.akademiakodu.clinic;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visit {


    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id3;

    private String who;
    private String toWhom;


    public String getWho() { return who; }

    public void setWho(String who) { this.who = who; }

    public String getToWhom() { return toWhom; }

    public void setToWhom(String toWhom) { this.toWhom = toWhom; }

    public int getId3() { return id3; }

    public void setId3(int id3) { this.id3 = id3; }

}
