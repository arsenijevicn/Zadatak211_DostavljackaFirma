package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

@Entity
public class Korisnici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ime_korisnik")
    private String imeKorisnik;

    @Column(name = "prezime_korisnik")
    private String prezimeKorisnik;

    @Column(name = "email_korisnik")
    private String emailKorisnik;

    @Column(name = "sifra_korisnik")
    private String sifraKorisnik;

    @Column(name = "adresa_korisnik")
    private String adresaKorisnik;

    @Column(name = "br_telefona_korisnik")
    private String brTelefonaKorisnik;

    public Korisnici() {
    }

    public String getImeKorisnik() {
        return imeKorisnik;
    }

    public void setImeKorisnik(String imeKorisnik) {
        this.imeKorisnik = imeKorisnik;
    }

    public String getPrezimeKorisnik() {
        return prezimeKorisnik;
    }

    public void setPrezimeKorisnik(String prezimeKorisnik) {
        this.prezimeKorisnik = prezimeKorisnik;
    }

    public String getEmailKorisnik() {
        return emailKorisnik;
    }

    public void setEmailKorisnik(String emailKorisnik) {
        this.emailKorisnik = emailKorisnik;
    }

    public String getSifraKorisnik() {
        return sifraKorisnik;
    }

    public void setSifraKorisnik(String sifraKorisnik) {
        this.sifraKorisnik = sifraKorisnik;
    }

    public String getAdresaKorisnik() {
        return adresaKorisnik;
    }

    public void setAdresaKorisnik(String adresaKorisnik) {
        this.adresaKorisnik = adresaKorisnik;
    }

    public String getBrTelefonaKorisnik() {
        return brTelefonaKorisnik;
    }

    public void setBrTelefonaKorisnik(String brTelefonaKorisnik) {
        this.brTelefonaKorisnik = brTelefonaKorisnik;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
