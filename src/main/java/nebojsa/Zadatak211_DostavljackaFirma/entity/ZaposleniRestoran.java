package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

@Entity
public class ZaposleniRestoran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TipZaposlenogRestoran pozicija;

    @Column(name = "ime_zap_restoran")
    private String imeZapRestoran;

    @Column(name = "prezime_zap_restoran")
    private String prezimeZapRestoran;

    @Column(name = "ocena")
    private double ocena;

    @Column(name = "rang")
    private String rang;

    @Column(name = "email_menadzer")
    private String emailMenadzer;

    @Column(name = "sifra_menadzer")
    private String sifraMenadzer;

    public ZaposleniRestoran() {
    }

    public ZaposleniRestoran(Integer id, TipZaposlenogRestoran pozicija, String imeZapRestoran, String prezimeZapRestoran, double ocena, String rang, String emailMenadzer, String sifraMenadzer) {
        this.id = id;
        this.pozicija = pozicija;
        this.imeZapRestoran = imeZapRestoran;
        this.prezimeZapRestoran = prezimeZapRestoran;
        this.ocena = ocena;
        this.rang = rang;
        this.emailMenadzer = emailMenadzer;
        this.sifraMenadzer = sifraMenadzer;
    }

    public TipZaposlenogRestoran getPozicija() {
        return pozicija;
    }

    public void setPozicija(TipZaposlenogRestoran pozicija) {
        this.pozicija = pozicija;
    }

    public String getImeZapRestoran() {
        return imeZapRestoran;
    }

    public void setImeZapRestoran(String imeZapRestoran) {
        this.imeZapRestoran = imeZapRestoran;
    }

    public String getPrezimeZapRestoran() {
        return prezimeZapRestoran;
    }

    public void setPrezimeZapRestoran(String prezimeZapRestoran) {
        this.prezimeZapRestoran = prezimeZapRestoran;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getEmailMenadzer() {
        return emailMenadzer;
    }

    public void setEmailMenadzer(String emailMenadzer) {
        this.emailMenadzer = emailMenadzer;
    }

    public String getSifraMenadzer() {
        return sifraMenadzer;
    }

    public void setSifraMenadzer(String sifraMenadzer) {
        this.sifraMenadzer = sifraMenadzer;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
