package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

//    private SpittleRepository spittleRepository;

    private static final String MAX_LONG_AS_STRING = "9223372036854775807";


//    public SpittleController(SpittleRepository spittleRepository) {
//        this.spittleRepository = spittleRepository;
//    }
/*
    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId,Model model)
    {
        model.addAttribute("spittleList", spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
            @RequestParam(value="count", defaultValue="20") int count) {
        return spittleRepository.findSpittles(max, count);
    }*/
}
