package nebojsa.Zadatak211_DostavljackaFirma.service.impl;

import nebojsa.Zadatak211_DostavljackaFirma.dao.KorisniciRepository;
import nebojsa.Zadatak211_DostavljackaFirma.dto.KorisniciDto;
import nebojsa.Zadatak211_DostavljackaFirma.mapper.KorisniciMapper;
import nebojsa.Zadatak211_DostavljackaFirma.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KorisnikServiceImpl implements KorisnikService {

    private KorisniciRepository korisniciRepository;
    private KorisniciMapper korisniciMapper;

    @Autowired
    public KorisnikServiceImpl(KorisniciRepository korisniciRepository, KorisniciMapper korisniciMapper) {
        this.korisniciRepository = korisniciRepository;
        this.korisniciMapper = korisniciMapper;
    }


    @Override
    public List<KorisniciDto> findAll() {
        return korisniciRepository.findAll();
    }

    
//    public KorisniciDto findById(Integer theId) {
//        Optional<KorisniciDto> result = korisniciRepository.findById(theId);
//
//        KorisniciDto korisniciDto;
//
//        if (result.isPresent()) {
//            korisniciDto = result.get();
//        } else {
//            throw new RuntimeException("Nije nedjen korisnik sa id: " + theId);
//        }
//        return korisniciDto;
//
//    }

    @Override
    public KorisniciDto findById(Integer theId) {
        Optional<KorisniciDto> result = korisniciRepository.findById(theId);
    
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Nije nađen ni jedan korisnik sa id: " + theId);
        }
    }

    @Override
    public KorisniciDto save(KorisniciDto korisnikDTO) {
        return korisniciRepository.save(korisnikDTO);
    }

    @Override
    public void deleteById(Integer theId) {
        korisniciRepository.deleteById(theId);
    }
}
