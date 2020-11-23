package me.lee.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FileController {
	
	@GetMapping("/file")
	public String fileUploadForm (Model model) {
		return "files/index";
	}

	
	@PostMapping("/file") // 요청 파라미터를 파일로 받는다
	public String fileUpload(@RequestParam MultipartFile file,
							  RedirectAttributes attributes) {
		// save
		String message = file.getOriginalFilename() + " is uploaded";
		attributes.addFlashAttribute("message", message);
		return "redirect:/file";
		// addFlash를 쓰면 세션에 저장하고 자동으로 마지막에 세션없애주고 또한
		// redirect 페이지에 갈 때 모델에 선언만 해두면 데이터 모델에 담긴다
		
	}
	
}
