package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


    @Controller
    @ResponseBody
    public class SkillsController {
        static String submission;

        @GetMapping
        public static String homePage() {
            return "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn, Here is the list!</h2>" +
                    "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                    "</ol>";
        }

        @GetMapping("form")
        public static String form() {
            return "<form action=\"form\" method=\"post\">\n" +
                    "<label for=\"inputName\">Name:</label>\n" +
                        "<input type=\"text\" name=\"name\" id=\"inputName\">\n" +
                    "<br>\n" +
                    "<label for=\"firstOption\">My favorite language</label>\n" +
                        "select name=\"option1\" id=\"firstOption\">\n" +
                            "<option value=\"JavaScript\">JavaScript</option>\n" +
                            "<option value=\"Java\">Java</option>\n" +
                            "<option value=\"Python\">Python</option>\n" +
                        "</select>\n" +
                    "<br>\n" +
                    "<label for=\"secondOption\">My second favorite language</label>\n" +
                        "<select name=\"option2\" id=\"secondOption\">\n" +
                            "<option value=\"JavaScript\">JavaScript</option>\n" +
                            "<option value=\"Java\">Java</option>\n" +
                            "<option value=\"Python\">Python</option>\n" +
                        "</select>\n" +
                    "<br>\n" +
                    "<label for=\"thirdOption\">My third favorite language</label>\n" +
                        "<select name=\"option3\" id=\"thirdOption\">\n" +
                            "<option value=\"JavaScript\">JavaScript</option>\n" +
                            "<option value=\"Java\">Java</option>\n" +
                            "<option value=\"Python\">Python</option>\n" +
                        "</select>\n" +
                    "<br>" +
                    "<button type='submit'>Submit here</button>" +
                    "</form>";
        }
    }
