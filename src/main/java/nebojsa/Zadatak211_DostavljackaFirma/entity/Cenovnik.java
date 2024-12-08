package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Cenovnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Zona zona;

    @Column(name = "cena", columnDefinition = "DECIMAL(10, 2) DEFAULT 0.00")
    private Double cena;

    @Column(name = "pocetak_vazenja")
    private LocalDateTime pocetakVazenja;

    @Column(name = "zavrsetak_vazenja")
    private LocalDateTime  zavrsetakVazenja;

    public Cenovnik() {
    }

    public Cenovnik(Integer id, Zona zona, Double cena, LocalDateTime pocetakVazenja, LocalDateTime zavrsetakVazenja) {
        this.id = id;
        this.zona = zona;
        this.cena = cena;
        this.pocetakVazenja = pocetakVazenja;
        this.zavrsetakVazenja = zavrsetakVazenja;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public LocalDateTime getPocetakVazenja() {
        return pocetakVazenja;
    }

    public void setPocetakVazenja(LocalDateTime pocetakVazenja) {
        this.pocetakVazenja = pocetakVazenja;
    }

    public LocalDateTime getZavrsetakVazenja() {
        return zavrsetakVazenja;
    }

    public void setZavrsetakVazenja(LocalDateTime zavrsetakVazenja) {
        this.zavrsetakVazenja = zavrsetakVazenja;
    }

}
