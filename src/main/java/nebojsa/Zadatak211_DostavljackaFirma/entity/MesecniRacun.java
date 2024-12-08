package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MesecniRacun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "datum_izdavanja")
    private LocalDateTime datumIzdavanja;

    @Column(name = "iznos")
    private Double iznos;

    public MesecniRacun() {
    }

    public MesecniRacun(Integer id, LocalDateTime datumIzdavanja, Double iznos) {
        this.id = id;
        this.datumIzdavanja = datumIzdavanja;
        this.iznos = iznos;
    }

    public LocalDateTime getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(LocalDateTime datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Double getIznos() {
        return iznos;
    }

    public void setIznos(Double iznos) {
        this.iznos = iznos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
