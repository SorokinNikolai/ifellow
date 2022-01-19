//Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
// На вход функции подаётся время в виде двух переменных: "hours" и "minutes"

public class task4 {
    public static void calcAngle (int hours, double minutes) {
        // даём возможность методу понимать 24-часовой формат времени
        if (hours > 12 && hours < 25) hours = hours - 12;
        // не считаем некорректно указанное время
        if (hours > 24) {
            System.out.println("В сутках нет столько часов, попробуйте исправить значение :-)");
            return;
        }
        if (minutes > 60) {
            System.out.println("В часе нет столько минут, попробуйте исправить значение :-)");
            return;
        }
        if (hours < 0 || minutes < 0) {
            System.out.println("Время не бывает отрицательным :-)");
        }
        // избавляемся от магических чисел
        int degreePerHours = 30;
        int degreePerMinute = 6;
        int minutesPerHour = 60;
        // проводим вычисления
        double totalTimeInHours = hours + minutes / minutesPerHour;
        double positionOfHoursHand = totalTimeInHours * degreePerHours;
        double positionOfMinutesHand = minutes * degreePerMinute;
        double angle = Math.abs(positionOfHoursHand - positionOfMinutesHand);
        // выводим как меньший, так и больший угол, а также вариант, когда они равны
        if (angle > 180) {
            double minAngle = Math.abs(360 - angle);
            System.out.println("Меньший угол составляет " + minAngle + "°");
            System.out.println("Больший угол составляет " + angle + "°");
        }
        else if (angle == 180) System.out.println("Угол в обе стороны составляет " + angle + "°");
        else {
            System.out.println("Меньший угол составляет " + angle + "°");
            double maxAngle = Math.abs(360 - angle);
            System.out.println("Больший угол составляет " + maxAngle + "°");
        }
    }
    public static void main(String[] args) {
        calcAngle(12, 30);
        calcAngle(23, 15);
        calcAngle(25, 30);
        calcAngle(5, 164);
    }
}
