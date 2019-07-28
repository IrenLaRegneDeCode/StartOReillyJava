/**
 * Created by Ira on 28.07.2019.
 */
public class Quotes {
    // Три набора слов для выбора
    String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш",
            "фронтэнд","на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути",
            "динамичный"};
    String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
            "распределенный", "кластеризированный", "фирменный", "нестандартный ум", "позиционированный","сетевой",
            "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный",
            "ускоренный"};
    String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход",
            "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

    public String getQuote (){
        // Вычисляем, сколько слов в каждом списке (длина массива)
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Генерируем три случайных числа
        int rand1 ;
        rand1= (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String x = wordListOne[2];
        //Строим фразу
        String phrase;
        phrase = wordListOne[rand1]+" "+ wordListTwo[rand2] + " " + wordListThree[rand3];

        // Выводим фразу на экран
        //System.out.println("Всё, что нам нужно - это " + phrase);

        return phrase;
    }

    @Override
    public String toString() {
        return "Всё, что нам нужно - это ";
    }
}
