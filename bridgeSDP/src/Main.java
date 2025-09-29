public class Main {
    public static void main(String[] args) {

        Program [] programs ={
                new BankSystem(new JavaDeveloper()),
                new AppSystem(new CppDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
        }

    }
}