package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Porudzbina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "datum_vreme_porucivanja")
    private LocalDateTime datumVremePorucivanja;

    @ManyToOne
    @JoinColumn(name = "korisnik_id")
    private Korisnici korisnik;

    @ManyToOne
    @JoinColumn(name = "restoran_id")
    private Restoran restoran;

    @ManyToMany
    @JoinTable(
        name = "porudzbina_proizvodi",
        joinColumns = @JoinColumn(name = "porudzbina_id"),
        inverseJoinColumns = @JoinColumn(name = "proizvod_id")
    )
    private List<Proizvodi> proizvodi;

    @ManyToOne
    @JoinColumn(name = "zaposleni_dostavljac_id")
    private ZaposleniDostavljac zaposleniDostavljac;

    @Enumerated(EnumType.STRING)
    private StatusPorudzbine statusPorudzbine;

    public Porudzbina() {
    }

    public Porudzbina(Integer id, LocalDateTime datumVremePorucivanja, Korisnici korisnik, Restoran restoran, List<Proizvodi> proizvodi, ZaposleniDostavljac zaposleniDostavljac, StatusPorudzbine statusPorudzbine) {
        this.id = id;
        this.datumVremePorucivanja = datumVremePorucivanja;
        this.korisnik = korisnik;
        this.restoran = restoran;
        this.proizvodi = proizvodi;
        this.zaposleniDostavljac = zaposleniDostavljac;
        this.statusPorudzbine = statusPorudzbine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDatumVremePorucivanja() {
        return datumVremePorucivanja;
    }

    public void setDatumVremePorucivanja(LocalDateTime datumVremePorucivanja) {
        this.datumVremePorucivanja = datumVremePorucivanja;
    }

    public Korisnici getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnici korisnik) {
        this.korisnik = korisnik;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public List<Proizvodi> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvodi> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public ZaposleniDostavljac getZaposleniDostavljac() {
        return zaposleniDostavljac;
    }

    public void setZaposleniDostavljac(ZaposleniDostavljac zaposleniDostavljac) {
        this.zaposleniDostavljac = zaposleniDostavljac;
    }

    public StatusPorudzbine getStatusPorudzbine() {
        return statusPorudzbine;
    }

    public void setStatusPorudzbine(StatusPorudzbine statusPorudzbine) {
        this.statusPorudzbine = statusPorudzbine;
    }

    // getters and setters
}