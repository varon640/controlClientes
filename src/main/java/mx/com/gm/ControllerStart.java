package mx.com.gm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerStart {
    
    @GetMapping("/")
    public String start(){
        return "Hola mundo String";
    }
}