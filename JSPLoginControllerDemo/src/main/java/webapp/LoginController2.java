package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController2 {
	
	private LoginService loginService = new LoginService();

	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login2";
	}

	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name,
			@RequestParam String password) {

		if (!loginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login2";
		}

		model.put("name", name);
		model.put("password", password);
		
		return "welcome2";
	}
}