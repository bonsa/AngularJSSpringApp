package angularspringapp.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	static final Logger log = Logger.getLogger(IndexController.class);

	@RequestMapping
	public String getIndexPage() {
		return "index";
	}
}
