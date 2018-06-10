package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.Spitter;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

//    private SpitterRepository spitterRepository;


//    public SpitterController(SpitterRepository spitterRepository) {
//        this.spitterRepository = spitterRepository;
//    }

    @RequestMapping(value="/register", method=GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("spitter",new Spitter());
        return "registerForm";
    }


    @RequestMapping(value="/register", method=POST)
    public String processRegistration(
            @Valid Spitter spitter,
            Errors errors,
            Model model) {
        if (errors.hasErrors()) {
            return "registerForm";
        }

//        spitterRepository.save(spitter);
        model.addAttribute("username",spitter.getUsername());
        model.addAttribute("spitterId",spitter.getId());
        return "redirect:/spitter/{username}"; //spitterId会自动加上的
    }


   /* @RequestMapping(value="/register", method=POST)
    public String processRegistration(
            @Valid Spitter spitter,
            Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }

        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value="/{username}", method=GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
       if (!model.containsAttribute("spitter")) {
                model.addAttribute(spitterRepository.findByUsername(username));
        return  "profile";
        }
    }*/

}
