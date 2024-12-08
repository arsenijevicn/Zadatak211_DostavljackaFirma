package nebojsa.Zadatak211_DostavljackaFirma.dto;

public class KorisniciDto {
    private Integer id;
    private String imeKorisnik;
    private String prezimeKorisnik;
    private String emailKorisnik;
    private String sifraKorisnik;
    private String adresaKorisnik;
    private String brTelefonaKorisnik;

    public KorisniciDto() {
    }

    public KorisniciDto(Integer id, String imeKorisnik, String prezimeKorisnik, String emailKorisnik, String sifraKorisnik, String adresaKorisnik, String brTelefonaKorisnik) {
        this.id = id;
        this.imeKorisnik = imeKorisnik;
        this.prezimeKorisnik = prezimeKorisnik;
        this.emailKorisnik = emailKorisnik;
        this.sifraKorisnik = sifraKorisnik;
        this.adresaKorisnik = adresaKorisnik;
        this.brTelefonaKorisnik = brTelefonaKorisnik;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
