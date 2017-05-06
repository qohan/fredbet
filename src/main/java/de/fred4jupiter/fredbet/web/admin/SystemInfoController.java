package de.fred4jupiter.fredbet.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import de.fred4jupiter.fredbet.service.admin.SystemInfoService;

@Controller
@RequestMapping("/systeminfo")
public class SystemInfoController {

	private static final String SYSTEMINFO_VIEW = "admin/systeminfo";

	@Autowired
	private SystemInfoService systemInfoService;

	@RequestMapping
	public ModelAndView list() {
		return new ModelAndView(SYSTEMINFO_VIEW, "buildInfoMap", systemInfoService.fetchSystemInfo());
	}

}
