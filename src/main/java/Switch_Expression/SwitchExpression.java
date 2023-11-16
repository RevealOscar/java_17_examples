package Switch_Expression;

public class SwitchExpression {

    private int id;
    public void traditionalSwitch(){
        switch(id){
            case 0:
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + id);
        }
    }

    public void newSwitch(){
        switch(id){
            case 0, 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            default -> throw new IllegalStateException("Unexpected value: " + id);
        }
    }
}
