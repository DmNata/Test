package Modui11.p8;

public abstract class Player {

    //целочисленную переменную hp — здоровье;
    //целочисленную переменную level — уровень;
    // переменную type — класс игрока;
    //строковую переменную weapon — оружие игрока;
    int hp;
    int level;
    int type;
    String weapon;

    //конструктор принимающий параметры (hp, level, type, weapon);
    public Player(int hp, int level, int type, String weapon) {
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.weapon = weapon;
    }
    //абстрактный метод, возвращающий строку getFullInfo();
    public  abstract String getFullInfo();

    //абстрактный метод без возвращаемого значения levelUp();
    public abstract void levelUp();

    //абстрактный метод, возвращающий булевое значение doDamage().
    public abstract boolean doDamage();



}


