package cz.czechitas.webapp;

import org.springframework.lang.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView displayIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView evaluateIndex(Form filledForm) {
        ModelAndView dataHolder = new ModelAndView("result");
        int score = filledForm.getAdaptability()
                        + filledForm.getGame()
                        + filledForm.getLove()
                        + filledForm.getPreferedFood()
                        + filledForm.getSport()
                        + filledForm.getTimeAtWork()
                        + filledForm.getTreats();

        String result;
        int image;
        int styles;

        if (score >= 0 && score < 6) {
            image = 5;
            styles = 5;
            result = "Pejsci se ti raději vyhýbají.";

        } else if (score >= 6 && score < 12) {
            result = "Pejsci tě tolerují.";
            image = 4;
            styles = 4;
        } else if (score >= 12 && score < 18) {
            result = "No... Ne, že bys byla jejich první volba, ale kámošit se s tebou budou.";
            image = 3;
            styles = 3;
        } else if (score >= 18 && score < 24) {
            result = "Pejsci tě mají rádi :)";
            image = 2;
            styles = 2;
        } else if (score >= 24 && score < 30) {
            result = "Pejsci tě prostě zbožňují!!! :)";
            image = 1;
            styles = 1;
        } else {
            result = "Někde se stala chyba :(";
            image = 1;
            styles = 1;
        }

        dataHolder.addObject("result", result);
        dataHolder.addObject("image", image);
        dataHolder.addObject("styles", styles);

        return dataHolder;
    }
}
