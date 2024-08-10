package javaDevelopment.Day4;

class Computers{
    public void code(){

    }

}

class Laptopp extends Computers{
    public void code(){
        System.out.println("Code, Run, Dev");
    }
}

class Desktops extends Computers{
    public void code(){
        System.out.println("Faster : Code, Run, Dev");
    }
}

class Developer{
    public void devApp(Computers lap){
        lap.code();
    }
} 



public class Interface {
    public static void main(String[] args) {

        Computers lap = new Laptopp();

        Computers desk = new Desktops();

        Developer aditya = new Developer();
        aditya.devApp(desk);

    }
}
