package guru.springframework.sfgpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetsController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
