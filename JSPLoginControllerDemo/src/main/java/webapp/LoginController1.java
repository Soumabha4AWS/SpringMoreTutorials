package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController1 {
	@RequestMapping(value = "/login1", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login1";
	}

	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name,
			@RequestParam String password) {
		model.put("name", name);
		model.put("password", password);
		return "welcome1";
	}
}