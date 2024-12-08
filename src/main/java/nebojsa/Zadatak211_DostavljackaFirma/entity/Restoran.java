package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Restoran {
    @Id
    private Integer id;

    @Column(name = "br_telefona_restorana")
    private String brTelefonaRestorana;

    @Column(name = "naziv_restorana")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String nazivRestorana;

    @Column(name = "ocena_restorana")
    private double ocenaRestorana;

    @Column(name = "adresa_restorana")
    private String adresaRestorana;

    @Enumerated(EnumType.STRING)
    private Zona zonaRestorana;

    public Restoran() {
    }

    public Restoran(Integer id, String brTelefonaRestorana, String nazivRestorana, double ocenaRestorana, String adresaRestorana, Zona zonaRestorana) {
        this.id = id;
        this.brTelefonaRestorana = brTelefonaRestorana;
        this.nazivRestorana = nazivRestorana;
        this.ocenaRestorana = ocenaRestorana;
        this.adresaRestorana = adresaRestorana;
        this.zonaRestorana = zonaRestorana;
    }

    public String getBrTelefonaRestorana() {
        return brTelefonaRestorana;
    }

    public void setBrTelefonaRestorana(String brTelefonaRestorana) {
        this.brTelefonaRestorana = brTelefonaRestorana;
    }

    public String getNazivRestorana() {
        return nazivRestorana;
    }

    public void setNazivRestorana(String nazivRestorana) {
        this.nazivRestorana = nazivRestorana;
    }

    public double getOcenaRestorana() {
        return ocenaRestorana;
    }

    public void setOcenaRestorana(double ocenaRestorana) {
        this.ocenaRestorana = ocenaRestorana;
    }

    public String getAdresaRestorana() {
        return adresaRestorana;
    }

    public void setAdresaRestorana(String adresaRestorana) {
        this.adresaRestorana = adresaRestorana;
    }

    public Zona getZonaRestorana() {
        return zonaRestorana;
    }

    public void setZonaRestorana(Zona zonaRestorana) {
        this.zonaRestorana = zonaRestorana;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
