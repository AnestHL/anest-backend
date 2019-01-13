package com.controller;

import java.util.List;

import com.util.ApiMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.IFaqService;
import com.entity.Faq;

@Controller
@RequestMapping("faq")
public class FaqController {
	@Autowired
	private IFaqService iFaqService;

	@GetMapping("{id}")
	public ResponseEntity<List<Faq>> getListFaqByCourseId(@PathVariable("id") int id) {
		List<Faq> list = iFaqService.getListFaqByCourseId(id);
		if(list == null || list.isEmpty() || list.size() == 0){
			ApiMessages message = new ApiMessages("not found list faq id: " + id);
			return new ResponseEntity(message, HttpStatus.NOT_FOUND);
		}else{
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
	}
}
