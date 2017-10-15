package JavaApp;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlRead{
    public void creatingAndReadingHtml() throws IOException {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"ru\">\n" +
                "<head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "    <title>Резюме</title>\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"\n" +
                "          integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"\n" +
                "          crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"\n" +
                "            integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\n" +
                "            crossorigin=\"anonymous\"></script>\n" +
                "    <style>\n" +
                "        body{background: darkgray; padding: 10px 0;}\n" +
                "        .container { max-width: 50%; background: white; padding: 10px;}\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h4 class=\"text-center\"><strong>Резюме</strong><p>на должность Java-стажер</p></h4>\n" +
                "        <div class=\"row\">\n" +
                "            <div class=\"col-xs-8 col-md-8\">\n" +
                "                <dl class=\"dl-horizontal\">\n" +
                "                    <dt>ФИО:</dt><dd>" + new PropertiesRead().getPropertyValue("FIO") + "</dd>\n" +
                "                    <dt>Дата рождения:</dt><dd>" + new PropertiesRead().getPropertyValue("DOB") +"</dd>\n" +
                "                    <dt>Телефон:</dt><dd>" + new PropertiesRead().getPropertyValue("phone") + "</dd>\n" +
                "                    <dt>E-mail:</dt><dd>" + new PropertiesRead().getPropertyValue("email") + "</dd>\n" +
                "                    <dt>Skype:</dt><dd>" + new PropertiesRead().getPropertyValue("skype") +"</dd>\n" +
                "                </dl></div>\n" +
                "            <div class=\"col-xs-4 col-md-4\">\n" +
                "                <img src=\"" + new PropertiesRead().getPropertyValue("avatar") + "\" width=\"100%\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"card card-block\">\n" +
                "            <h4 class=\"card-title\"><strong>Цель:</strong></h4>\n" +
                "            <p class=\"card-text\">" + new PropertiesRead().getPropertyValue("target") + "</p>\n" +
                "        </div>\n" +
                "        <div class=\"card card-block\">\n" +
                "            <h4 class=\"card-title\"><strong>Опыт работы:</strong></h4>\n" +
                "            <ol class=\"card-text\">\n" + new PropertiesRead().getPropertyValue("experiences") +
                "            </ol>\n" +
                "        </div>\n" +
                "        <div class=\"card card-block\">\n" +
                "            <h4 class=\"card-title\"><strong>Образование:</strong></h4>\n" +
                "            <p class=\"card-text\">" + new PropertiesRead().getPropertyValue("educations") + "</p>\n" +
                "        </div>\n" +
                "        <div class=\"card card-block\">\n" +
                "            <h4 class=\"card-title\"><strong>Доп. образование и курсы:</strong></h4>\n" +
                "            <ol class=\"card-text\">\n" + new PropertiesRead().getPropertyValue("additional_educations") +
                "            </ol>\n" +
                "        </div>\n" +
                "        <div class=\"card card-block\">\n" +
                "            <h4 class=\"card-title\"><strong>Навыки:</strong></h4>\n" +
                "            <ol class=\"card-text\">\n"+ new PropertiesRead().getPropertyValue("skills") +
                "            </ol>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
        File file = new File("resume.html");
        if (file.createNewFile()) {
            System.out.println("resume.html успешно создан в корневой директории проекта");
        } else System.out.println("resume.html уже существует в корневой директории проекта");
       try {
           BufferedWriter bw = new BufferedWriter(new FileWriter(file));
           bw.write(html);
           bw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
