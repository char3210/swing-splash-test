package me.char321;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash == null) {
            System.out.println("No splash screen?");
            return;
        }
        Thread.sleep(100000);
    }
}