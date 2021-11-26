package heech.hellcoding.learn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LearnController {

    @GetMapping("hellcoding/learn")
    public String index(Model model) {
        model.addAttribute("subject", "동물의 세계");
        return "learn/index";
    }

    @GetMapping("hellcoding/learn/cow")
    public String cow(Model model) {
        model.addAttribute("name", "cow");
        return "learn/cow/cow";
    }

    @GetMapping("hellcoding/learn/dog")
    public String dog(@RequestParam(value = "name", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "learn/dog/dog";
    }

    @GetMapping("hellcoding/learn/cat")
    public String cat(Model model) {
        model.addAttribute("name", "cat");
        return "learn/cat/cat";
    }
}
