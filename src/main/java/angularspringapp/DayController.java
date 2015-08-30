package angularspringapp;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/day")
public class DayController {

	static final Logger log = Logger.getLogger(DayController.class);

	@RequestMapping("/{day}/{month}")
	public @ResponseBody String getDayDescription(@PathVariable("day") String day, @PathVariable("month") String month) {
		log.info("Day: " + day + " + Month: " + month);

		return "Ellen Fairclough is sworn in as Canada's first woman Cabinet Minister, year 1957";
	}

	@RequestMapping("/layout")
	public String getDayPartialPage() {
		return "/day/layout";
	}
}
