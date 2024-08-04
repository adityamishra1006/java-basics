class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getMeAPen(int cost){
        if(cost >= 10){
            return "Pen";
        }
        return "Nothing";
    }
}

public class oop2_Computer {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String result = comp.getMeAPen(15);
        System.out.println(result);
    }
    
}
