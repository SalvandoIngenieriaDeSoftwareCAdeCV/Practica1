package IS.example.Practica1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/cerradura")

public class operaciones {
    int n;
    String cadena;

    public operaciones(){
        this.cadena = "";
    }

    @GetMapping("/estrella/{n}")
    public String cerraduraKleene(@PathVariable int n){
        this.cadena = "";
        for(int i = n; i > 0; i--){
            this.cerradura(i, "");
        }
        int longitud = cadena.length();
        cadena = cadena.substring(0, longitud-1);
        cadena = "Σ^*={λ,"+cadena+"}";
        return cadena;
    }

    public void cerradura(int m, String temp){
        if(m == 0){
            this.cadena = temp + "," + cadena;
            return ;
        }
        cerradura(m-1, temp+"1");
        cerradura(m-1, temp+"0");
    }

    @GetMapping("/positiva/{n}")
    public String cerraduraPositiva(@PathVariable int n){
        this.cadena = "";
        for(int i = n; i > 0; i--){
            this.cerradura(i, "");
        }
        int longitud = cadena.length();
        cadena = cadena.substring(0, longitud-1);
        cadena = "Σ^+={"+cadena+"}";
        //System.out.println(cadena);
        return cadena;
    }
}
