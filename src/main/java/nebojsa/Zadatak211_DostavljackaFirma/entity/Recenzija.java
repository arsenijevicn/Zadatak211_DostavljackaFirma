package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Recenzija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "datum_vreme_recenzije")
    private LocalDateTime datumVremeRecenzije;

    @Column(name = "ocena_restorana")
    private Integer ocenaRestorana;

    @Column(name = "ocena_dostavljaca")
    private Integer ocenaDostavljaca;

    @Column(name = "tekst")
    private String tekst;

    @ManyToOne
    @JoinColumn(name = "porudzbina_id")
    private Porudzbina porudzbina;

    public Recenzija() {
    }

    public Recenzija(Integer id, LocalDateTime datumVremeRecenzije, Integer ocenaRestorana, Integer ocenaDostavljaca, String tekst, Porudzbina porudzbina) {
        this.id = id;
        this.datumVremeRecenzije = datumVremeRecenzije;
        this.ocenaRestorana = ocenaRestorana;
        this.ocenaDostavljaca = ocenaDostavljaca;
        this.tekst = tekst;
        this.porudzbina = porudzbina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDatumVremeRecenzije() {
        return datumVremeRecenzije;
    }

    public void setDatumVremeRecenzije(LocalDateTime datumVremeRecenzije) {
        this.datumVremeRecenzije = datumVremeRecenzije;
    }

    public Integer getOcenaRestorana() {
        return ocenaRestorana;
    }

    public void setOcenaRestorana(Integer ocenaRestorana) {
        this.ocenaRestorana = ocenaRestorana;
    }

    public Integer getOcenaDostavljaca() {
        return ocenaDostavljaca;
    }

    public void setOcenaDostavljaca(Integer ocenaDostavljaca) {
        this.ocenaDostavljaca = ocenaDostavljaca;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public Porudzbina getPorudzbina() {
        return porudzbina;
    }

    public void setPorudzbina(Porudzbina porudzbina) {
        this.porudzbina = porudzbina;
    }

    // getters and setters
}