package com.company.html.generator;

import com.company.setting.counters.ShareCounter;
import com.company.model.Computer;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlGenerator {

    private static final Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
    private static final String PATH_TO_TEMPLATES = "src/com/company/resources/templates";

    public void generateComputerReport(List<Computer> computers){
        Map<String, Object> data = new HashMap<>();
        data.put("computers", computers);

        ShareCounter sc = new ShareCounter();
        sc.countShares(computers);
        data.put("totalUnits", sc.getTotalUnits());

        generateHtml(data, "computers.html", "computers.ftl");
    }

    public static void generateHtml(Map<String, Object> data, String fileName, String templateName) {
        Writer out = null;
        try {
            configuration.setDirectoryForTemplateLoading(new File(PATH_TO_TEMPLATES));
            Template template = configuration.getTemplate(templateName);
            out = new FileWriter(fileName);
            template.process(data, out);
            out.flush();

        } catch (IOException e) {
            System.out.println("Problem reading the file !");
        } catch (TemplateException e) {
            System.out.println("Problem with template !");
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("Problem closing the stream ! ");
                }
            }
        }
    }
}
