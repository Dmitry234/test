public class Tank {
        private int x;

        public void goForward(int i){
            x+=i;

        }
        public void printPosition(){
            System.out.println("This Tank is at " + x + " now.");
        }
        public void goBackward(int i){
            x=x+(-i);
        }
}

































