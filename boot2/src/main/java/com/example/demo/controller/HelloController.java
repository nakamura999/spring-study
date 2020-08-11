package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("/")
	// @GetMapping HTTPのGETリクエストを受け付ける
	public String greeting() {
		return "hello";
	}
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam("message") String message, Model model) {
		model.addAttribute("sample", message);
		return "hello";
	}
	// @RequestParam リクエストの値(パラメータ)を取得
	// 取得した値をThymeleafに渡すには、Modelに追加。ModelクラスのaddAttribute("名前", 値)を使用
}
