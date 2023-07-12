package ZomBi;

    public class Zombie extends Monster {

        public Zombie(String name) {
            super(name + " the Zombie", 5);
        }

        @Override
        public void growl(){
            System.out.print("Raaaauuughhhh");

        }

        @Override
        public void attack(){
            super.attack();
            growl();
        }

    }