//метод написан по собственной инициативе, это расширенная версия решения второго задания;
//метод найдет все повторяющиеся символы, даже если они стоят не рядом;

import java.util.*;
//import java.util.stream.Collectors;

public class task2Method {
    public static void findDuplicateChar(String text) {
        //немного отформатируем текст, оставим только буквы и приведем к единому регистру;
        String replaceText = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        char[] charArray = replaceText.toCharArray();  //переносим текст в массив с символами;
        Arrays.sort(charArray); //расставим все буквы по алфавиту;
        String result = "";
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i+1]) { //находим все повторяющиеся буквы;
                result = result + charArray[i];
            };
        };
        char[] charArray2 = result.toCharArray(); //создаём новый массив из результата;
        List<char[]> asList = Arrays.asList(charArray2); // создаем лист и заполняем его элементами массива;
        List<Character> charList = new ArrayList<Character>();
        for (char i : charArray2) {
            charList.add(i);
        };
        // создаём интерфейс для итоговой очистки от дублей;
        Set<Character> charSet = new HashSet<Character>(charList);
        charList.clear();
        charList.addAll(charSet);
        // ещё немного доработаем вывод;
        String finalResult = charSet.toString();
        String finalFinalResult = finalResult.substring(1, finalResult.length() - 1);
        //выводим результат;
        System.out.println("Повторяющиеся буквы в тексте: " + finalFinalResult);
    };
    public static void main(String[] args) {
        findDuplicateChar("java is cool");
        findDuplicateChar ("Ехал грека через реку, видит грека — в реке рак." +
                "Сунул грека руку в реку, рак за руку греку — цап!");
    };
};
