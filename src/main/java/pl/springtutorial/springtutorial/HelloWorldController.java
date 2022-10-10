package pl.springtutorial.springtutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloworld() {
        return "hello World <br> " +
                "<a href=\"/goodbye\">goodbye</a>";
    }

    @RequestMapping("goodbye")
    public String goodbye(){
        return "Goodbye from 1st site ;) <br>" +
                "<a href=\"/\">welcome</a>";
    }
}
