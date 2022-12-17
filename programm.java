import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*

Написать приложение, которое хранит информацию о фильмах и позволяет получaть все детали о них.
Реализовать поиск по части имени фильма.

*/

public class programm {

    public static void main(String[] args) {

        film iron_man = new film();
        iron_man.name = "Iron Man";
        iron_man.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        iron_man.director = "Джон Фавро";
        iron_man.lead_actor = "Роберт Дауни Младший, Терренс Ховард, Джефф Бриджес, Гвинет Пэлтроу";
        iron_man.country = "США";
        iron_man.year = 2008;
        
        film iron_man_2 = new film();
        iron_man_2.name = "Iron Man 2";
        iron_man_2.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        iron_man_2.director = "Джон Фавро";
        iron_man_2.lead_actor = "Роберт Дауни Младший, Дон Чидл, Скарлетт Йоханссон, Гвинет Пэлтроу, Микки Рурк";
        iron_man_2.country = "США";
        iron_man_2.year = 2010;
        
        film iron_man_3 = new film();
        iron_man_3.name = "Iron Man 3";
        iron_man_3.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        iron_man_3.director = "Шейн Блэк";
        iron_man_3.lead_actor = "Роберт Дауни Младший, Дон Чидл, Гай Пирс, Гвинет Пэлтроу, Бен Кингсли";
        iron_man_3.country = "США";
        iron_man_3.year = 2013;

        film incredible_hulk = new film();
        incredible_hulk.name = "Incredible Hulk";
        incredible_hulk.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        incredible_hulk.director = "Луи Летерье";
        incredible_hulk.lead_actor = "Эдвард Нортон, Лив Тайлер, Тим Рот, Уильям Хёрт";
        incredible_hulk.country = "США";
        incredible_hulk.year = 2008;

        film tor = new film();
        tor.name = "Tor";
        tor.genre = "Супергеройский боевик, Фантастика, Фэнтези";
        tor.director = "Кеннет Брана";
        tor.lead_actor = "Крис Хемсворт, Натали Портман, Том Хиддлстон, Стеллан Скарсгард, Колм Фиори, Рэй Стивенсон, Идрис Эльба, Кэт Деннингс, Рене Руссо, Энтони Хопкинс";
        tor.country = "США";
        tor.year = 2011;

        film first_avenger = new film();
        first_avenger.name = "First Avenger";
        first_avenger.genre = "Супергеройский боевик, Фантастика, Фэнтези, Приключения";
        first_avenger.director = "Джо Джонстон";
        first_avenger.lead_actor = "Крис Эванс, Томми Ли Джонс, Хьюго Уивинг, Хейли Этвелл, Себастиан Стэн, Доминик Купер, Нил Макдонаф, Дерек Люк, Стэнли Туччи";
        first_avenger.country = "США";
        first_avenger.year = 2011;

        film avengers = new film();
        avengers.name = "Avengers";
        avengers.genre = "Супергеройский боевик, Фантастика, Фэнтези, Приключения";
        avengers.director = "Джосс Уидон";
        avengers.lead_actor = "Роберт Дауни Младший, Крис Эванс, Марк Руффало, Крис Хемсворт, Скарлетт Йоханссон, Джереми Реннер, Том Хиддлстон, Кларк Грегг, Коби Смолдерс, Стеллан Скарсгард, Сэмюэл Л. Джексон";
        avengers.country = "США";
        avengers.year = 2012;

        List<film> cinema = new ArrayList<film>(Arrays.asList(iron_man, iron_man_2, iron_man_3, incredible_hulk, tor, first_avenger, avengers));

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