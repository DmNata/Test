package RazNoe;

public class Main {

    public static void main(String[] args) {

        TVset tv = new TVset();
        Remote remote = new Remote();
        remote.setTVset(tv);
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);

    }
}
///2

//                TVset tv = new TVset();
//                TVset.Remote remote = tv.getRemote();
//                System.out.println(tv);
//                remote.turnOn();
//                System.out.println(tv);
//                remote.setChannel(2);
//                System.out.println(tv);
//                remote.turnOff();
//                System.out.println(tv);
//
//