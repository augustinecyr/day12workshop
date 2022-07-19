package sg.edu.nus.iss.day12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumberController {

    // 
    @RequestMapping (path=("/number")) 
    public String test(){
        return "number";
    }

}
