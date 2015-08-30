package angularspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/math")
public class MathController {

	@RequestMapping("/layout")
	public String getMathPartialPage() {
		return "/math/layout";
	}
}
