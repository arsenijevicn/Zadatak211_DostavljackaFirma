package nebojsa.Zadatak211_DostavljackaFirma.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nebojsa.Zadatak211_DostavljackaFirma.entity.TipZaposlenogDostavljac;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ZaposleniDostavljacDto {
    private Integer id;
    private String imeDostavljaca;
    private String prezimeDostavljaca;
    private TipZaposlenogDostavljac tipZaposlenogDostavljac;
    private String emailDostavljaca;
    private String sifraDostavljaca;
    private String brTelefonaDostavljaca;
    private double ocnaDostavljaca;
}
