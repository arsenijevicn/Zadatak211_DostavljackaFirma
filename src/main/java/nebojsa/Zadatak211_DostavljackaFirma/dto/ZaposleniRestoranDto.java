package nebojsa.Zadatak211_DostavljackaFirma.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nebojsa.Zadatak211_DostavljackaFirma.entity.TipZaposlenogRestoran;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ZaposleniRestoranDto {
    private Integer id;
    private TipZaposlenogRestoran tipZaposlenogPozan;
    private String imeZapRestoran;
    private String prezimeZapRestoran;
    private double ocena;
    private String rang;
    private String emailMenadzer;
    private String sifraMenadzer;
}
