package nebojsa.Zadatak211_DostavljackaFirma.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nebojsa.Zadatak211_DostavljackaFirma.entity.Zona;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RestoranDto {
    private Integer id;
    private String brTelefoneRestorana;
    private String naziRestorana;
    private double ocenaRestorana;
    private String adresaRestorana;
    private Zona zonaRestorana;

}
