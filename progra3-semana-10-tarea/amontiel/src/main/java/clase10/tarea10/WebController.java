package clase10.tarea10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")

public class WebController {
    
    @GetMapping()
    public String index(){
        return "index";
    }

}
