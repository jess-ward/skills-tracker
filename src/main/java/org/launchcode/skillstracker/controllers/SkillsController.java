package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class SkillsController {

    @GetMapping("/")
    public String skillsList() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action= 'results' method= 'post'>" +
                "<label>Name:" + "</label>" +
                "<input type = 'text' name = 'name' /><br>" +
                "<label>My favorite language:" + "</label>" +
                "<select name = 'firstfav'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'TypeScript'>TypeScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select><br>" +
                "<label>My second favorite language:" +
                "<select name = 'secondfav'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'TypeScript'>TypeScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select><br>" +
                "</label>" +
                "<label>My third favorite language:" +
                "<select name = 'thirdfav'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'TypeScript'>TypeScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select><br>" +
                "</label>" +
                "<input type = 'submit' value= 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/results")
    public String returnResults(@RequestParam String name, String firstfav, String secondfav, String thirdfav) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstfav + "</li>" +
                "<li>" + secondfav + "</li>" +
                "<li>" + thirdfav + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }
}
