package nebojsa.Zadatak211_DostavljackaFirma.controller;

import nebojsa.Zadatak211_DostavljackaFirma.dto.KorisniciDto;
import nebojsa.Zadatak211_DostavljackaFirma.entity.Korisnici;
import nebojsa.Zadatak211_DostavljackaFirma.mapper.KorisniciMapper;
import nebojsa.Zadatak211_DostavljackaFirma.service.KorisnikService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/korisnici")
public class KorisniciController {
    private KorisnikService korisnikService;
    private KorisniciMapper korisniciMapper;

    public KorisniciController(KorisnikService korisnikService) {
        this.korisnikService = korisnikService;
    }

    @GetMapping("/korisnici-forma")
    public String showKorisniciForma(Model theModel) {
        Korisnici korisnik = new Korisnici();
        theModel.addAttribute("korisnik", korisnik);
        return "korisnici/korisnici-forma";
    }

    @GetMapping("/listakorisnika")
    public String listaKorisnika(Model theModel) {
        List<KorisniciDto> korisnici = korisnikService.findAll();

        theModel.addAttribute("korisnici", korisnici);

        return "korisnici/listakorisnika";
    }

    @GetMapping("/formaZaDodavanje")
    public String formaZaDodavanje(Model theModel) {
        Korisnici korisnik = new Korisnici();

        theModel.addAttribute("korisnik", korisnik);
        return "korisnici/korisnici-forma";
    }

    @PostMapping("/save")
    public String sacuvajKorisnika(@ModelAttribute("/korisnik") Korisnici korisnik){
        korisnikService.save(korisniciMapper.toDto(korisnik));

        return "redirect:/korisnici/listakorisnika";
    }



}
