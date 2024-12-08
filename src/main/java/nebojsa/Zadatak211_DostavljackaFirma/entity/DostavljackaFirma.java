package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class DostavljackaFirma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "naziv")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String naziv;

    @ManyToOne
    @JoinColumn(name = "cenovnik_id")
    private Cenovnik cenovnik;

    public DostavljackaFirma() {
    }

    public DostavljackaFirma(Integer id, String naziv, Cenovnik cenovnik) {
        this.id = id;
        this.naziv = naziv;
        this.cenovnik = cenovnik;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String getNaziv() {
        return naziv;
    }

    public void setNaziv(@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String naziv) {
        this.naziv = naziv;
    }

    public Cenovnik getCenovnik() {
        return cenovnik;
    }

    public void setCenovnik(Cenovnik cenovnik) {
        this.cenovnik = cenovnik;
    }
}
