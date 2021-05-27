package webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController3 {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login3", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login3";
	}

	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name,
			@RequestParam String password) {

		if (!loginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login3";
		}

		model.put("name", name);
		model.put("password", password);
		
		return "welcome3";
	}
}