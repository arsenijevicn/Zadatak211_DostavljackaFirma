package nebojsa.Zadatak211_DostavljackaFirma.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import nebojsa.Zadatak211_DostavljackaFirma.entity.Zona;

@Entity
public class KorisniciDto {
    @Id
    private Integer id;
    private String imeKorisnik;
    private String prezimeKorisnik;
    private String emailKorisnik;
    private String sifraKorisnik;
    private String adresaKorisnik;
    private Zona zonaKorisnik;
    private String brTelefonaKorisnik;

    public KorisniciDto() {
    }

    public KorisniciDto(Integer id, String imeKorisnik, String prezimeKorisnik, String emailKorisnik, String sifraKorisnik, String adresaKorisnik, Zona zonaKorisnik, String brTelefonaKorisnik) {
        this.id = id;
        this.imeKorisnik = imeKorisnik;
        this.prezimeKorisnik = prezimeKorisnik;
        this.emailKorisnik = emailKorisnik;
        this.sifraKorisnik = sifraKorisnik;
        this.adresaKorisnik = adresaKorisnik;
        this.zonaKorisnik =zonaKorisnik;
        this.brTelefonaKorisnik = brTelefonaKorisnik;
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

    public Zona getZonaKorisnik() {
        return zonaKorisnik;
    }

    public void setZonaKorisnik(Zona zonaKorisnik) {
        this.zonaKorisnik = zonaKorisnik;
    }
}
