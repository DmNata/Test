package Modui11.p8;

public class Wizart extends Player {
    //целочисленную переменную manaLevel — уровень маны;
    //строковую переменную element — стихия мага;
    int manaLevel;
    String element;


    //реализуйте конструктор, принимающий в себя параметры (hp, level, type, weapon, manaLevel, element);
    public Wizart(int hp, int level, int type, String weapon,int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    //реализуйте метод getFullInfo(), который будет возвращать строку,
    // в которой все параметры стоят через пробел в порядке:
    // hp, level, type, weapon, manaLevel, element;
    @Override
    public String getFullInfo() {
        return String.valueOf(hp + level + type + weapon);
    }

    //реализуйте метод levelUp(), при вызове которой переменная level должна увеличиваться на 1;
    @Override
    public void levelUp() {
        level++;

    }

    //реализуйте метод doDamage(), который при manaLevel >= 10 будет
    //понижать manaLevel на 10 единиц и возвращать true, а при manaLevel < 10 будет возвращать false.
    @Override
    public boolean doDamage() {
        if (manaLevel >= 10)
            return true;
        else
            return false;
    }
}
