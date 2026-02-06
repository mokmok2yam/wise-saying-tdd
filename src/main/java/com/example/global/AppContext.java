package com.example.global;

import com.example.system.controller.SystemController;
import com.example.wiseSaying.controller.WiseSayingController;
import com.example.wiseSaying.repository.WiseSayingRepository;
import com.example.wiseSaying.service.WiseSayingService;

import java.util.Scanner;

public class AppContext {
    public static Scanner sc;
    public static SystemController systemController;
    public static WiseSayingController wiseSayingController;
    public static WiseSayingService wiseSayingService;
    public static WiseSayingRepository wiseSayingRepository;

    public static void init(Scanner _sc) {
        AppContext.sc = sc;
        AppContext.wiseSayingRepository = new WiseSayingRepository();
        AppContext.wiseSayingService = new WiseSayingService();
        AppContext.wiseSayingController = new WiseSayingController(sc);
        AppContext.systemController = new SystemController();
    }

    public static void init() {
        init(new Scanner(System.in));
    }
}
