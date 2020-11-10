package by.jrr.jis.website;

import by.jrr.jis.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @GetMapping("/")
    public ModelAndView openIndex() {
        ModelAndView mov = new ModelAndView();
        mov.addObject("message", MessageService.getRandom());
        mov.setViewName("index");
        return mov;
    }
}
