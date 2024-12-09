package nebojsa.Zadatak211_DostavljackaFirma.dao;

import nebojsa.Zadatak211_DostavljackaFirma.dto.KorisniciDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KorisniciRepository extends JpaRepository<KorisniciDto, Integer> {

}
