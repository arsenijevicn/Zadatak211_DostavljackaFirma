package nebojsa.Zadatak211_DostavljackaFirma.mapper;

import nebojsa.Zadatak211_DostavljackaFirma.dto.CenovnikDto;
import nebojsa.Zadatak211_DostavljackaFirma.entity.Cenovnik;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

// Mapper Interface
@Mapper
public interface CenovnikMapper {
    CenovnikMapper INSTANCE = Mappers.getMapper(CenovnikMapper.class);

    CenovnikDto toDto(Cenovnik cenovnik);
    Cenovnik toEntity(CenovnikDto cenovnikDto);
}