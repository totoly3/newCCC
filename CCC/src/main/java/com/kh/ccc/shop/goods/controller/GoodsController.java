package com.kh.ccc.shop.goods.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GoodsController {
	
	
	@RequestMapping("goodsMain.go")
	public String goCart(HttpSession session, Model model) {
		
		return "shop/goodsMain";
	}
	
}
