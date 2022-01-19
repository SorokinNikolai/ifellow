// Напишите класс BaseConverter для конвертации из градусов по Цельсию в Кельвины, Фаренгейты, и так далее.
// У метода должен быть метод convert, который и делает конвертацию.

// Данный метод принимает количество градусов и шкалу измерения, и переводит её в 2 других;
public class BaseConvert {
    public static void convert(double degrees, String temperatureUnit) {
        // учим конвертер понимать градусы Цельсия
        if (temperatureUnit.equals("Цельсия") || temperatureUnit.equals("C")
                || temperatureUnit.equals("c") || temperatureUnit.equals("цельсия")
                || temperatureUnit.equals("Celsius") || temperatureUnit.equals("с")
                || temperatureUnit.equals("С"))
        { //приводим значения к читаемому виду и выводим на экран
            String kelvin = String.format("%.2f",(degrees + 273.15)) + " K";
            String fahrenheit = String.format("%.2f",(degrees * 9/5 + 32)) + " °F";
            String result = String.format("%.2f",degrees) + " °C = " + kelvin + " = " + fahrenheit;
            System.out.println(result);
        } // учим конвертер понимать Кельвины
        else if (temperatureUnit.equals("Кельвина") || temperatureUnit.equals("K")
                || temperatureUnit.equals("k") || temperatureUnit.equals("кельвина")
                || temperatureUnit.equals("Kelvin") || temperatureUnit.equals("к")
                || temperatureUnit.equals("К"))
        { //приводим значения к читаемому виду и выводим на экран
            String celsius = String.format("%.2f",(degrees - 273.15)) + " °C";
            String fahrenheit = String.format("%.2f",((degrees - 273.15) * 9/5 + 32)) + " °F";
            String result = String.format("%.2f",degrees) + " K = " + celsius + " = " + fahrenheit;
            System.out.println(result);
        } // учим конвертер понимать градусы Фаренгейта
        else if (temperatureUnit.equals("Фаренгейта") || temperatureUnit.equals("F")
                || temperatureUnit.equals("f") || temperatureUnit.equals("фаренгейта")
                || temperatureUnit.equals("Fharenheit") || temperatureUnit.equals("ф")
                || temperatureUnit.equals("Ф"))
        { //приводим значения к читаемому виду и выводим
            String celsius = String.format("%.2f",(degrees - 32) * 5/9) + " °C";
            String kelvin = String.format("%.2f",((degrees - 32) * 5/9) + 273.15) + " K";
            String result = String.format("%.2f",degrees) + " °F = " + celsius + " = " + kelvin;
            System.out.println(result);
        }


    };

    public static void main(String[] args) {
        convert(37.2, "Celsius");
        convert(314, "k");
        convert(378.12,"Фаренгейта");
    }
}
