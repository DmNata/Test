package Lesson4L;

public class Mage {
    public static void main(String[] args) {
    }

    //    поле name (имя, строка);
    String name;
    //    поле level (уровень мага, число);
    int level;
    //    поле damage (урон, число);
    int damage;
    //    поле type (тип магии, строка, может быть равен fire, ice, earth);
    String type = "fire, ice, earth";

    //   конструктор, инициализирующий данные поля (name, level, damage, type);
    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;

    }

    //    метод getInfo(), возвращающий строку вида {name, level, damage, type};
    public String getInfo() {
        return name + level + damage + type;

    }

    //    метод fight(Mage mage), этот метод должен вернуть имя мага-победителя.
    public String fight(Mage mage) {

        // проверяем все возможные ситуации
        // тип магии
        // вернуть имя  мага победителя
        // Маг огня побеждает мага льда, но проигрывает магу земли.
        if (this.type.equals("fire") && mage.type.equals("ice")) return this.name;
        //Маг льда побеждает мага земли, но проигрывает магу огня.
        else if (this.type.equals("ice") && mage.type.equals("earth")) return this.name;
        //Маг земли побеждает мага огня, но проигрывает магу льда.
        else if (this.type.equals("earth") && mage.type.equals("fire")) return this.name;
        //Если же стихия магов одинаковая, то выигрывает более высокоуровневый маг
        else if (!this.type.equals(mage.type)) return mage.name;
        else {
            //если же и уровни одинаковы, то тот, у которого больший урон,
            if (this.level > mage.level) return this.name;
            else if (this.level < mage.level) return mage.name;
            else {
                if (this.damage > mage.damage) return this.name;
                else if (this.damage < mage.damage) return mage.name;
                //если же и урон одинаковый, то вернуть строку draw (ничья).
                else return "draw";
            }
        }
    }
}



//    Задача 10
//    Опишите класс Mage. В нем пропишите:
//    поле name (имя, строка);
//    поле level (уровень мага, число);
//    поле damage (урон, число);
//    поле type (тип магии, строка, может быть равен fire, ice, earth);
//    конструктор, инициализирующий данные поля (name, level, damage, type);
//    метод getInfo(), возвращающий строку вида {name, level, damage, type};
//    метод fight(Mage mage), этот метод должен вернуть имя мага-победителя.
//    Кто из них победит решается следующем образом:
//            ⚡ Маг огня побеждает мага льда, но проигрывает магу земли.
//            ⚡ Маг льда побеждает мага земли, но проигрывает магу огня.
//            ⚡ Маг земли побеждает мага огня, но проигрывает магу льда.
//            ⚡Если же стихия магов одинаковая, то выигрывает более высокоуровневый маг
//    , если же и уровни одинаковы, то тот, у которого больший урон,
//    если же и урон одинаковый, то вернуть строку draw (ничья).
