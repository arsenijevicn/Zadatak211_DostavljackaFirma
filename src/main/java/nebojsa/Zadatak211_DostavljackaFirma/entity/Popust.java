package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Popust {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "datum_pocetka")
    private LocalDateTime datumPocetka;

    @Column(name = "kraj_vazenja")
    private LocalDateTime krajVazenja;

    @Column(name = "vrednost_popusta")
    private Double vrednostPopusta;

    public Popust() {
    }

    public Popust(Integer id, LocalDateTime datumPocetka, LocalDateTime krajVazenja, Double vrednostPopusta) {
        this.id = id;
        this.datumPocetka = datumPocetka;
        this.krajVazenja = krajVazenja;
        this.vrednostPopusta = vrednostPopusta;
    }

    public LocalDateTime getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(LocalDateTime datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public LocalDateTime getKrajVazenja() {
        return krajVazenja;
    }

    public void setKrajVazenja(LocalDateTime krajVazenja) {
        this.krajVazenja = krajVazenja;
    }

    public Double getVrednostPopusta() {
        return vrednostPopusta;
    }

    public void setVrednostPopusta(Double vrednostPopusta) {
        this.vrednostPopusta = vrednostPopusta;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
