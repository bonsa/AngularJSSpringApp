package angularspringapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day")
public class DayController {

	@RequestMapping("/layout")
	public String getDayPartialPage() {
		return "/day/layout";
	}
}
