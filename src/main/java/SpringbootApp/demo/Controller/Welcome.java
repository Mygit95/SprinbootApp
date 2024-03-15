package SpringbootApp.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

    @GetMapping("/welcome")
    ResponseEntity<String> getWelcomeMessage() {
        return new ResponseEntity<>("First Java Application Deployment using Jenkins!", HttpStatus.OK);
    }
}
