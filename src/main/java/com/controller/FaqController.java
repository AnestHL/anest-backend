package com.controller;

import java.util.List;

import com.util.ApiMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.service.IFaqService;
import com.entity.Faq;

@Controller
@RequestMapping("faq")
public class FaqController {
    private IFaqService iFaqService;

    @Autowired
    public FaqController(IFaqService iFaqService) {
        this.iFaqService = iFaqService;
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getAllFaqByCourseId(@PathVariable("id") long id) {
        List<Faq> list = iFaqService.getListFaqByCourseId(id);
        if (list == null || list.isEmpty()) {
            ApiMessages message = new ApiMessages("not found list faq id: " + id);
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

	@GetMapping("get/{id}")
	public ResponseEntity<?> getFaqById(@PathVariable("id") long id) {
        if (iFaqService.getFaq(id) == null) {
            ApiMessages message = new ApiMessages("Faq id " + id + " not found.");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
		Faq dataFaq = iFaqService.getFaq(id);
		return new ResponseEntity<>(dataFaq, HttpStatus.OK);
	}

    @PostMapping("add")
    public ResponseEntity<Faq> addFaq(@RequestBody Faq faq) {
        Faq dataFaq = iFaqService.addFaq(faq);
        return new ResponseEntity<>(dataFaq, HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<?> updateFaq(@RequestBody Faq faq) {
        if (iFaqService.getFaq(faq.getId()) == null) {
            ApiMessages message = new ApiMessages("Faq id " + faq.getId() + " not found.");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
        Faq dataFaq = iFaqService.updateFaq(faq);
        return new ResponseEntity<>(dataFaq, HttpStatus.OK);
    }
}
