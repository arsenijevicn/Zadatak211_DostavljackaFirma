package nebojsa.Zadatak211_DostavljackaFirma.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nebojsa.Zadatak211_DostavljackaFirma.entity.TipProizvoda;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProizvodiDto {
    private Integer idProizvod;
    private String nazivProizvod;
    private TipProizvoda tipProizvod;

}
