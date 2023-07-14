package Modui11.p8;

public class Warrior extends Player{
    //строковую переменную armor — броню воина;
    String armor;

    //реализуйте конструктор принимающий в себя параметры (hp, level, type, weapon, armor);
    public Warrior(int hp, int level, int type, String weapon,String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    //реализуйте метод getFullInfo(), который будет возвращать строку,
    //в которой все параметры стоят через пробел в порядке: hp, level, type, weapon, armor.
    @Override
    public String getFullInfo() {
        return String.valueOf(hp + level + type + weapon + armor);
    }

    //реализуйте метод levelUp(), при вызове которого переменная Level должна увеличиваться на 1;
    @Override
    public void levelUp() {
        level++;

    }

    //реализуйте метод doDamge(), который при вызове будет возвращать true.
    @Override
    public boolean doDamage() {

        return true;
    }
}
