package com.klef.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClassController
{
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@GetMapping("/demo1")
	public ModelAndView admin()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("admin");
		return m;
	}
	@GetMapping("/demo4")
	@ResponseBody
	public String demo4()
	{
		return "jfsd";
	}
	@GetMapping("/demo5")
	@ResponseBody
	public String demo5(@RequestParam("x") int a ,@RequestParam("y")  int b)
	{
		int c;
		c=a+b;
		return Integer.toString(c) ;
	}
	@GetMapping("/demo6/{fname}/{iname}")
	@ResponseBody
	public String demo6(@PathVariable("fname") String a,@PathVariable("iname") String b)
	{
		return a+"\t"+b;
	}
}
