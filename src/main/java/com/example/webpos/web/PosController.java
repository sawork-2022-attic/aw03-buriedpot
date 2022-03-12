package com.example.webpos.web;

import com.example.webpos.biz.PosService;
import com.example.webpos.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PosController {

    private PosService posService;

    @Autowired
    public void setPosService(PosService posService) {
        this.posService = posService;
    }

    @GetMapping("/")
    public String pos(Model model) {
        posService.add("PD1",2);
        posService.add("PD2",2);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("subTotal", posService.getCart().total());
        model.addAttribute("total", posService.getCart().total());
        model.addAttribute("products", posService.products());
        model.addAttribute("cart", posService.getCart());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id, Model model) {
        posService.delete(id);
        return "redirect:/index";
    }

    @GetMapping("/add/{id}")
    public String add(@PathVariable("id") String id, Model model) {
        System.out.println("add");
        posService.add(id, 1);
        return "redirect:/index";
    }
    @GetMapping("/sub/{id}")
    public String sub(@PathVariable("id") String id, Model model) {
        System.out.println("sub");
        posService.add(id, -1);
        return "redirect:/index";
    }

    @GetMapping("/charge")
    public String charge(Model model) {
        System.out.println("charge");
        posService.empty();
        return "redirect:/index";
    }
    @GetMapping("/cancel")
    public String cancel(Model model) {
        System.out.println("cancel");
        posService.empty();
        return "redirect:/index";
    }
}
