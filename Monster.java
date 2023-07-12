package ZomBi;

public class Monster {
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;
    int damage;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

    //Метод, который выводит рёв монстра:
    public void growl() {
    }

    //Метод,выводит информацию о силе разрушения, которое наносит монстр:
    public void attack() {
    }
}
