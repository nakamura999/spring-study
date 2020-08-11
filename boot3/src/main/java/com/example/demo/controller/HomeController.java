package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@RequestParam String message, Model model) {
		model.addAttribute("message", message);
		return "confirm";
	}
	// @PostMapping HTTPのPOSTリクエストを受け付ける
	// 取得した値をThymeleafに渡すには、Modelに追加。ModelクラスのaddAttribute("名前", 値)を使用
}
