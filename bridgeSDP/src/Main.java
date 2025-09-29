public class Main {
    public static void main(String[] args) {
        Program bankSystem = new BankSystem(new JavaDeveloper());
        bankSystem.developProgram();

        System.out.println("=======================================");
        
        Program appSystem = new AppSystem(new CppDeveloper());
        appSystem.developProgram();

    }
}
