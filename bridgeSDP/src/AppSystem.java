public class AppSystem extends Program {

    protected AppSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("AppSystem develop in progress..");
        developer.writeCode();
    }
}
