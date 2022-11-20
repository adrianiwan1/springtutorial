package pl.springtutorial.springtutorial;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Login(Map<String,Object> model)
    {
        UserLoginDTO login = new UserLoginDTO();
        model.put("form",login);


        return "Loginform";
    }
    @PostMapping("/SucessLogin")
    public String SucessLogin(@ModelAttribute UserLoginDTO dto,Map<String,Object> model)
    {
       String username = dto.getUsername();
       String passwd = dto.getPasswd();

       if(username.equals("admin") && passwd.equals("zaq12wsx"))
       {
           CalculatorDTO calc = new CalculatorDTO();
           model.put("calc",calc);
           return"Calculator";
       }
        return "BadLogin";
    }
    @PostMapping("/Calculator")
    public String Wynik(@ModelAttribute CalculatorDTO calc, Map<String,Object> model, Model mod)
    {
        int a = calc.getA();
        int b = calc.getB();
        int w = calc.getA();
        String znak = calc.getZnak();

        if( ( a>0) || ( b > 0))
        {

             switch (znak) {
                 case "+":w = a + b;
                     break;
                 case "-":w = a - b;
                     break;
                 case "*":w = a * b;
                     break;
                 case "/":w = a / b;
                     break;
            };

            mod.addAttribute("wyn",w);
        }
        return"Calculator";


    }

}
