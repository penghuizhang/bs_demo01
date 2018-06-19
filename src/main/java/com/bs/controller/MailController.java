package com.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

/**
 * Created by kylin on 2018/6/17.
 */
@RestController
@RequestMapping("mail")
public class MailController {
    @Autowired
    JavaMailSender mailSender;

    @RequestMapping("sendemail")
    public Object sendEmail()
    {
        try
        {
            final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
            final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("15890651564@163.com");
            message.setTo("1360315221@qq.com");
            message.setSubject("IT技能教学");
            message.setText("您订阅的课程有更新，请及时学习哦！！！");
            this.mailSender.send(mimeMessage);

           return 1;
        }
        catch(Exception ex)
        {
          return 2;
        }
    }
}