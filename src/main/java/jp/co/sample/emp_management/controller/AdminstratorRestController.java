package jp.co.sample.emp_management.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toInsert")
public class AdminstratorRestController {
	
	@RequestMapping(value = "/checkpass", method = RequestMethod.POST)
	public Map<String, String> checkPass(String password, String confirmPassword) {
		Map<String, String> map = new HashMap<>();
		String checkMessage = null;
		if (password.equals(confirmPassword)) {
			checkMessage = "確認パスワードOK";
		} else if (confirmPassword.isEmpty()) {
			checkMessage = "";
		} else {
			checkMessage = "パスワードが一致していません";
		}
		map.put("checkMessage", checkMessage);
		return map;
	}
	
}
