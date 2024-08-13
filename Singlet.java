public class Singlet {
    private static Singlet inst;

    private  Singlet(){
        System.out.println("helk");
    }

    public static Singlet getInst(){
        if (inst==null)
            inst =new Singlet();

        return inst;
    }

    public static void main(String[] args) {
        Singlet singlet=Singlet.getInst();
        Singlet singlet1=Singlet.getInst();
    }

}