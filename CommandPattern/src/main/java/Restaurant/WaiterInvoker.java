package Restaurant;

public class WaiterInvoker {
    private String waiterName;

    private InterfaceCommand interfaceCommand;



    public WaiterInvoker(String waiterName) {
        this.waiterName = waiterName;
    }


    public void setOrderCommand(InterfaceCommand interfaceCommand) {
        this.interfaceCommand = interfaceCommand;
    }

    public void setUpOrder(){
        interfaceCommand.executeOrder();
    }

    public void withdrawOrder(){
        interfaceCommand.undoOrder();
    }
}
