package nebojsa.Zadatak211_DostavljackaFirma.service;

import nebojsa.Zadatak211_DostavljackaFirma.dto.KorisniciDto;

import java.util.List;

public interface KorisnikService {
    List<KorisniciDto> findAll();
    //List<KorisniciDTO> getAllKorisnici();
    KorisniciDto findById(Integer theId);
    KorisniciDto save(KorisniciDto korisnikDTO);
    void deleteById(Integer theId);

}

/*    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);*/
