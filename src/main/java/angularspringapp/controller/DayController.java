package angularspringapp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import angularspringapp.model.DayResponse;
import angularspringapp.service.ApiService;

@Controller
@RequestMapping("/day")
public class DayController {

	static final Logger log = Logger.getLogger(DayController.class);

	@Autowired
	private ApiService apiService;

	@RequestMapping("/{day}/{month}")
	public @ResponseBody DayResponse getDayDescription(@PathVariable("day") String day,
			@PathVariable("month") String month) {

		DayResponse dayResponse = apiService.getFactAboutDay(day, month);
		return dayResponse;
	}

	@RequestMapping("/layout")
	public String getDayPartialPage() {
		return "/day/layout";
	}
}
