package nebojsa.Zadatak211_DostavljackaFirma.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nebojsa.Zadatak211_DostavljackaFirma.entity.Zona;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class CenovnikDto {
    private Integer id;
    private Zona zona;
    private Double cena;
    private LocalDateTime pocetakVazenja;
    private LocalDateTime zavrsetakVazenja;
}
