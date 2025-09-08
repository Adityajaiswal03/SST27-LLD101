package com.example.report;
import java.nio.file.*; import java.util.*;

public class App {
    public static void main(String[] args) {
        JsonWriter jw=new JsonWriter();
        Zipper z=new Zipper();
        AuditLog log=new AuditLog();
        ReportBundleFacade reportBundleFacade=new ReportBundleFacade(jw, z, log);
        Map<String,Object> data = Map.of("name", "Quarterly");
        reportBundleFacade.export(data,  Path.of("out"), "report");

    }
}
