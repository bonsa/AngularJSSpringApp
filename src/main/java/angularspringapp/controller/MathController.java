package angularspringapp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import angularspringapp.model.MathResponse;
import angularspringapp.service.ApiService;

@Controller
@RequestMapping("/math")
public class MathController
{
    static final Logger log = Logger.getLogger(DayController.class);

    @Autowired
    private ApiService  apiService;

    @RequestMapping("/{number}")
    public @ResponseBody MathResponse getMathPropertyAboutNumber(@PathVariable("number") String number)
    {
        MathResponse mathResponse = apiService.getMathPropertyAboutNumber(number);
        return mathResponse;
    }

    @RequestMapping("/layout")
    public String getMathPartialPage()
    {
        return "/math/layout";
    }
}
