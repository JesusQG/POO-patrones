package eventsystem;

import eventsystem.decorator.*;
import eventsystem.observer.*;

public class Main {
    public static void main(String[] args){
        Event Concurso = new Event("Concurso de moda 2025", "Competencia 2025");
        User ana = new User("Ana");
        User pedro = new User("Pedro");

        Concurso.addObserver(ana);
        Concurso.addObserver(pedro);

        Concurso.setDescription("Fecha movida");

        Notification n = new BasicNotification("Recordatorio inscripción");
        n = new TimestampDecorator(n);
        n = new ImportantTagDecorator(n);
        ana.update(n);
        pedro.update(n);

        Event clone = Concurso.clone();
        clone.setName("Concurso 2026");
    }
}
