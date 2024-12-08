package nebojsa.Zadatak211_DostavljackaFirma.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nebojsa.Zadatak211_DostavljackaFirma.entity.StatusPorudzbine;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PorudzbinaDto {
    private Integer id;
    private LocalDateTime datumVremePorucivanja;
    private String korisnikIme;
    private String restoranNaziv;
    private List<ProizvodiDto> proizvodi;
    private String dostavljacIme;
    private StatusPorudzbine status;

}
