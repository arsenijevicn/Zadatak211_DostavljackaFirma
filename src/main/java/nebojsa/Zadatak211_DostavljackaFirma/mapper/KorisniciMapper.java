package nebojsa.Zadatak211_DostavljackaFirma.mapper;

import nebojsa.Zadatak211_DostavljackaFirma.dto.KorisniciDto;
import nebojsa.Zadatak211_DostavljackaFirma.entity.Korisnici;
import org.springframework.stereotype.Component;

@Component
public class KorisniciMapper {
    public  KorisniciDto toDto(Korisnici korisnici) {
        if (korisnici == null) {
            return null;
        }

        KorisniciDto korisniciDTO = new KorisniciDto();
        korisniciDTO.setId(korisnici.getId());
        korisniciDTO.setImeKorisnik(korisnici.getImeKorisnik());
        korisniciDTO.setPrezimeKorisnik(korisnici.getPrezimeKorisnik());
        korisniciDTO.setEmailKorisnik(korisnici.getEmailKorisnik());
        korisniciDTO.setSifraKorisnik(korisnici.getSifraKorisnik());
        korisniciDTO.setAdresaKorisnik(korisnici.getAdresaKorisnik());
        korisniciDTO.setBrTelefonaKorisnik(korisnici.getBrTelefonaKorisnik());

        return korisniciDTO;
    }

    public  Korisnici toEntity(KorisniciDto korisniciDTO) {
        if (korisniciDTO == null) {
            return null;
        }

        Korisnici korisnici = new Korisnici();
        korisnici.setId(korisniciDTO.getId());
        korisnici.setImeKorisnik(korisniciDTO.getImeKorisnik());
        korisnici.setPrezimeKorisnik(korisniciDTO.getPrezimeKorisnik());
        korisnici.setEmailKorisnik(korisniciDTO.getEmailKorisnik());
        korisnici.setSifraKorisnik(korisniciDTO.getSifraKorisnik());
        korisnici.setAdresaKorisnik(korisniciDTO.getAdresaKorisnik());
        korisnici.setBrTelefonaKorisnik(korisniciDTO.getBrTelefonaKorisnik());
        return korisnici;

//    private final ModelMapper modelMapper;
//
//    public KorisniciMapper(ModelMapper modelMapper) {
//        this.modelMapper = modelMapper;
//    }
//
//    public KorisniciDTO toDto(Korisnici korisnici) {
//        return modelMapper.map(korisnici, KorisniciDTO.class);
//    }
//    public Korisnici toEntity(KorisniciDTO korisniciDTO) {
//        return modelMapper.map(korisniciDTO, Korisnici.class);
//    }
    }
}
