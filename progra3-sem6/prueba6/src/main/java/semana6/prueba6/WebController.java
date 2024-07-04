package semana6.prueba6;

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

    @GetMapping("/welcome")
    public String indexcopy(){
        return "indexcopy";
    }
}
