package nebojsa.Zadatak211_DostavljackaFirma.entity;

import jakarta.persistence.*;

@Entity
public class ZaposleniDostavljac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ime_dobavljaca")
    private String imeDobavljaca;

    @Column(name = "prezime_dobavljaca")
    private String prezimeDobavljaca;

    @Enumerated(EnumType.STRING)
    private TipZaposlenogDostavljac tipDobavljaca;

    @Column(name = "email_dobavljaca")
    private String emailDobavljaca;

    @Column(name = "sifra_dobavljaca")
    private String sifraDobavljaca;

    @Column(name = "broj_telefona_dobavljaca")
    private String brojTelefonaDobavljaca;

    @Column(name = "ocena_dobavljaca")
    private double ocenaDobavljaca;

    public ZaposleniDostavljac() {
    }

    public ZaposleniDostavljac(Integer id, String imeDobavljaca, String prezimeDobavljaca, TipZaposlenogDostavljac tipDobavljaca, String emailDobavljaca, String sifraDobavljaca, String brojTelefonaDobavljaca, double ocenaDobavljaca) {
        this.id = id;
        this.imeDobavljaca = imeDobavljaca;
        this.prezimeDobavljaca = prezimeDobavljaca;
        this.tipDobavljaca = tipDobavljaca;
        this.emailDobavljaca = emailDobavljaca;
        this.sifraDobavljaca = sifraDobavljaca;
        this.brojTelefonaDobavljaca = brojTelefonaDobavljaca;
        this.ocenaDobavljaca = ocenaDobavljaca;
    }

    public String getImeDobavljaca() {
        return imeDobavljaca;
    }

    public void setImeDobavljaca(String imeDobavljaca) {
        this.imeDobavljaca = imeDobavljaca;
    }

    public String getPrezimeDobavljaca() {
        return prezimeDobavljaca;
    }

    public void setPrezimeDobavljaca(String prezimeDobavljaca) {
        this.prezimeDobavljaca = prezimeDobavljaca;
    }

    public TipZaposlenogDostavljac getTipDobavljaca() {
        return tipDobavljaca;
    }

    public void setTipDobavljaca(TipZaposlenogDostavljac tipDobavljaca) {
        this.tipDobavljaca = tipDobavljaca;
    }

    public String getEmailDobavljaca() {
        return emailDobavljaca;
    }

    public void setEmailDobavljaca(String emailDobavljaca) {
        this.emailDobavljaca = emailDobavljaca;
    }

    public String getSifraDobavljaca() {
        return sifraDobavljaca;
    }

    public void setSifraDobavljaca(String sifraDobavljaca) {
        this.sifraDobavljaca = sifraDobavljaca;
    }

    public String getBrojTelefonaDobavljaca() {
        return brojTelefonaDobavljaca;
    }

    public void setBrojTelefonaDobavljaca(String brojTelefonaDobavljaca) {
        this.brojTelefonaDobavljaca = brojTelefonaDobavljaca;
    }

    public double getOcenaDobavljaca() {
        return ocenaDobavljaca;
    }

    public void setOcenaDobavljaca(double ocenaDobavljaca) {
        this.ocenaDobavljaca = ocenaDobavljaca;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
