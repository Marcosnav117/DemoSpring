package Elmarkito.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaMundo {
    @GetMapping("/hola")
    public String hola() {

        return "Primer prueba";
    }

    @GetMapping
    public String SegundaPrueba() {

        return "Segunda Prueba";
    }
    @PostMapping
    public String perro() {

        return "Imprime Perro";
    }
}
