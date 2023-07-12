//package ZomBi;
//
//public class GiantSnake {
//    public static String scream = "Ssssss";
//
//    public GiantSnake() {
//        super();
//    }
//
//    @Override
//    public void growl(){
//        System.out.print(scream);
//        super.growl();
//    }
//
//    public void growl(boolean loud){
//        if (!loud) {
//            growl();
//        }
//        else {
//            System.out.print(scream.toUpperCase());
//            super.growl();
//        }
//    }
//
//    @Override
//    public void attack(){
//        growl(true);
//        super.attack();
//        System.out.println("     ...and hid in the grass");
//    }
//
//}