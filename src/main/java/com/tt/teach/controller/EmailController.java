package com.tt.teach.controller;

import com.tt.teach.utils.EmailUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;

@Controller
@RequestMapping("/email")
public class EmailController extends EmailUtil{

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestParam String email,@RequestParam String title,@RequestParam String context,@RequestParam MultipartFile file) {
        try {
            sendEmailPlus(email,title,context,file);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return "/student/index";
    }
}
