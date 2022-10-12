package pl.springtutorial.springtutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @RequestMapping("/metoda") public String widok(@RequestParam(value ="a", required = false,defaultValue="0") Integer danaA, @RequestParam(value = "b", required = false, defaultValue = "0") Integer danaB)
    {
        int i = danaB + danaA;
        return "wynik to" + i;
    }

    public String helloworld() {
        return "hello World <br> " +
                "<a href=\"/goodbye\">goodbye</a>";
    }

    @RequestMapping("goodbye")
    public String goodbye(){
        return "Goodbye from 1st site ;( <br>" +
                "<a href=\"/\">welcome</a>";
    }
}
