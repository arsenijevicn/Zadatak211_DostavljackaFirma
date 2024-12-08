package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

@Entity
public class Proizvodi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "naziv_proizvod")
    private String nazivProizvod;

    @Enumerated(EnumType.STRING)
    private TipProizvoda tipProizvoda;

    public Proizvodi() {
    }

    public Proizvodi(Integer id, String nazivProizvod, TipProizvoda tipProizvoda) {
        this.id = id;
        this.nazivProizvod = nazivProizvod;
        this.tipProizvoda = tipProizvoda;
    }

    public String getNazivProizvod() {
        return nazivProizvod;
    }

    public void setNazivProizvod(String nazivProizvod) {
        this.nazivProizvod = nazivProizvod;
    }

    public TipProizvoda getTipProizvoda() {
        return tipProizvoda;
    }

    public void setTipProizvoda(TipProizvoda tipProizvoda) {
        this.tipProizvoda = tipProizvoda;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
