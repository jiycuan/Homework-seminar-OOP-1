/*

Написать приложение, которое хранит информацию о фильмах и позволяет получaть все детали о них.
Реализовать поиск по части имени фильма.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {

        film ironMan = new film();
        ironMan.name = "Iron Man";
        ironMan.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        ironMan.director = "Джон Фавро";
        ironMan.leadActor = "Роберт Дауни Младший, Терренс Ховард, Джефф Бриджес, Гвинет Пэлтроу";
        ironMan.country = "США";
        ironMan.year = 2008;

        film ironMan2 = new film();
        ironMan2.name = "Iron Man 2";
        ironMan2.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        ironMan2.director = "Джон Фавро";
        ironMan2.leadActor = "Роберт Дауни Младший, Дон Чидл, Скарлетт Йоханссон, Гвинет Пэлтроу, Микки Рурк";
        ironMan2.country = "США";
        ironMan2.year = 2010;
        
        film ironMan3 = new film();
        ironMan3.name = "Iron Man 3";
        ironMan3.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        ironMan3.director = "Шейн Блэк";
        ironMan3.leadActor = "Роберт Дауни Младший, Дон Чидл, Гай Пирс, Гвинет Пэлтроу, Бен Кингсли";
        ironMan3.country = "США";
        ironMan3.year = 2013;

        film incredibleHulk = new film();
        incredibleHulk.name = "Incredible Hulk";
        incredibleHulk.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        incredibleHulk.director = "Луи Летерье";
        incredibleHulk.leadActor = "Эдвард Нортон, Лив Тайлер, Тим Рот, Уильям Хёрт";
        incredibleHulk.country = "США";
        incredibleHulk.year = 2008;

        film tor = new film();
        tor.name = "Tor";
        tor.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        tor.director = "Кеннет Брана";
        tor.leadActor = "Крис Хемсворт, Натали Портман, Том Хиддлстон, Стеллан Скарсгард, Колм Фиори, Рэй Стивенсон, Идрис Эльба, Кэт Деннингс, Рене Руссо, Энтони Хопкинс";
        tor.country = "США";
        tor.year = 2011;

        film firstAvenger = new film();
        firstAvenger.name = "First Avenger";
        firstAvenger.genre = "Супергеройский боевик, Фантастика, Фэнтези, Приключения";
        firstAvenger.director = "Джо Джонстон";
        firstAvenger.leadActor = "Крис Эванс, Томми Ли Джонс, Хьюго Уивинг, Хейли Этвелл, Себастиан Стэн, Доминик Купер, Нил Макдонаф, Дерек Люк, Стэнли Туччи";
        firstAvenger.country = "США";
        firstAvenger.year = 2011;

        film avengers = new film();
        avengers.name = "Avengers";
        avengers.genre = "Супергеройский боевик, Фантастика, Фэнтези, Приключения";
        avengers.director = "Джосс Уидон";
        avengers.leadActor = "Роберт Дауни Младший, Крис Эванс, Марк Руффало, Крис Хемсворт, Скарлетт Йоханссон, Джереми Реннер, Том Хиддлстон, Кларк Грегг, Коби Смолдерс, Стеллан Скарсгард, Сэмюэл Л. Джексон";
        avengers.country = "США";
        avengers.year = 2012;

        List<film> cinema = new ArrayList<film>(Arrays.asList(ironMan, ironMan2, ironMan3, tor, firstAvenger, avengers));

        film user = new film();
        Scanner in = new Scanner(System.in);
        System.out.println("База содержит несколько фильмов первой фазы киновселенной Марвел. Укажите полное или частичное название фильма на английском языке: ");
        user.name = in.nextLine();
        in.close();
        System.out.println(user.name);

        for (int i = 0; i < cinema.size(); i++) {
            if (cinema.get(i).search(user)) {
                cinema.get(i).info();
                System.out.println();
            }
        }
    }
}
