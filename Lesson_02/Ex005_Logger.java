package Lesson_02;
import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        // создаем хендлер чтобы выводить ошибки в консоль или файл
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        // указать хендлер в качестве аргумента логгера, чтобы было понятно куда отправлять сообщения
        logger.addHandler(fh);
        
        // описать формат в рамках которого будет производится запись/вывод сообщений
        // текстовый формат для удобства чтения
        SimpleFormatter sFormat = new SimpleFormatter();
        // XML формат чтобы было удобно парсить логи
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        // logger.log - позволяет указать уровень сообщения и то сообщение которое нужно показать
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        // упрощенный фариант без флажка (Level.INFO)
        logger.info("Тестовое логирование 2");

    }
}








