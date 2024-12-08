package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Ugovor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "datum_pocetka")
    private LocalDateTime datumPocetka;

    @Column(name = "datum_zavrsetka")
    private LocalDateTime datumZavrsetka;

    public Ugovor() {
    }

    public Ugovor(Integer id, LocalDateTime datumPocetka, LocalDateTime datumZavrsetka) {
        this.id = id;
        this.datumPocetka = datumPocetka;
        this.datumZavrsetka = datumZavrsetka;
    }

    public LocalDateTime getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(LocalDateTime datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public LocalDateTime getDatumZavrsetka() {
        return datumZavrsetka;
    }

    public void setDatumZavrsetka(LocalDateTime datumZavrsetka) {
        this.datumZavrsetka = datumZavrsetka;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
