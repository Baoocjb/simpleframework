package com.bao.controller;

import com.bao.controller.frontend.MainPageController;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet("/")
public class Dispacterservlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // getRequestPath() -> 包含工程名的路径
        log.debug("request path: " + req.getServletPath());
        log.debug("request name: " + req.getMethod());

        if("/frontend/getmainpageinfo".equals(req.getServletPath()) && "GET".equals(req.getMethod())){
//            new MainPageController().getMainPageInfo();
            System.out.println("返回主界面");
        }
    }
}

