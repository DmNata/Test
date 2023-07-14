package RazNoe;

public class TVset {
    int channel = 5;
    boolean isOn;

    public String toString(){
        if (!isOn){
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }
}

class Remote{

    private TVset tvSet;

    public void setTVset(TVset tvSet){
        this.tvSet = tvSet;
    }
    public void setChannel(int channel){
        tvSet.channel = channel;
    }
    public void turnOn(){
        tvSet.isOn = true;
    }
    public void turnOff(){
        tvSet.isOn = false;
    }
}
///2
//class TVset{
//
//    private int channel = 5;
//    private boolean isOn;
//    private Remote remote = new Remote();
//
//    public Remote getRemote(){
//        return remote;
//    }
//
//    class Remote{
//
//        public void setChannel(int channel){
//            TVset.this.channel = channel;
//        }
//        public void turnOn(){
//            isOn = true;
//        }
//        public void turnOff(){
//            isOn = false;
//        }
//    }
//
//    public String toString(){
//        if (!isOn){
//            return "The TVset is OFF";
//        }
//        return "Channel " + channel + " is on the TVset now.";
//    }
//}






//                TVset tv = new TVset();
//                Remote remote = new Remote();
//                remote.setTVset(tv);
//                System.out.println(tv);
//                remote.turnOn();
//                System.out.println(tv);
//                remote.setChannel(2);
//                System.out.println(tv);
//                remote.turnOff();
//                System.out.println(tv);

