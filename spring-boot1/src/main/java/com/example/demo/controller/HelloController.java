package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @Controller・・・このクラスが、コントローラであることを示す。
public class HelloController {
	@RequestMapping("/")
	// @RequestMapping・・・HTTPリクエストを受け付ける。今回は、引数にルート("/")を指定て、http://localhost:8080/でアクセス可能
	public String index() {
		// hello.htmlを呼び出す
		return "hello";
	}
}
