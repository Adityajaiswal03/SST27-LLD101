package com.example.config;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : "/Users/adi/Desktop/LLD II/singleton-config/src/com/example/config/app.properties";

        SettingsLoader loader = new SettingsLoader();
        AppSettings s=loader.load(Path.of(path));// encourages extra instances
        System.out.println("app.name=" + s.get("app.name"));
        System.out.println("instance=" + System.identityHashCode(s));

        AppSettings.getInstance().loadFromFile(Path.of(path)); // not thread-safe, re-loadable
        System.out.println("app.name=" + AppSettings.getInstance().get("app.name"));
        System.out.println("instance=" + System.identityHashCode(AppSettings.getInstance()));
    }
}