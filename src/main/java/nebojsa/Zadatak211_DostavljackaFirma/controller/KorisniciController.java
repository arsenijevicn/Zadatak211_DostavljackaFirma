package nebojsa.Zadatak211_DostavljackaFirma.controller;

import nebojsa.Zadatak211_DostavljackaFirma.dto.KorisniciDto;
import nebojsa.Zadatak211_DostavljackaFirma.service.KorisnikService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/korisnici")
public class KorisniciController {
    private KorisnikService korisnikService;

    public KorisniciController(KorisnikService korisnikService) {
        this.korisnikService = korisnikService;
    }

    @GetMapping("/listakorisnika")
    public String listaKorisnika(Model theModel) {
        List<KorisniciDto> korisnici = korisnikService.findAll();

        theModel.addAttribute("korisnici", korisnici);

        return "korisnici/listakorisnika";
    }
}
