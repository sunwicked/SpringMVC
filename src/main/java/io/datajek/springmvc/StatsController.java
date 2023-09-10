package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatsController {

    //method to handle /showStatsForm
    @RequestMapping("/showStatsForm")
    public String showForm(Model model) {
        model.addAttribute("playerStats", new PlayerStats());
        return "head-to-head";
    }

    //method to handle /processStatsForm    
}