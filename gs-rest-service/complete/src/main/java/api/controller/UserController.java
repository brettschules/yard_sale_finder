package api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import api.model.User;
import api.service.UserService;



@Controller 
@RequestMapping(path="/users")
public class UserController {

	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private UserService userService;
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String firstName
			, @RequestParam String lastName) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setFirstName(firstName);
		n.setLastName(lastName);
		userService.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userService.findAll();
	}
}