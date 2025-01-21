package PaymentService;

import java.util.Deque;
import java.util.LinkedList;

public class MobileAppInvoker {
    private PaymentService payment;
    private Deque<PaymentService> undoStack;
    private Deque<PaymentService> redoStack;

    public MobileAppInvoker() {
        undoStack = new LinkedList<PaymentService>();
        redoStack = new LinkedList<PaymentService>();
    }


    public void performTransaction(PaymentService trans) {
        trans.execute();
        undoStack.offerLast(trans);
    }

    public void undoLastTransaction() {
        if (!undoStack.isEmpty()) {
            PaymentService previousTrans = undoStack.pollLast();
            redoStack.offerLast(previousTrans);
            System.out.println("\n<<<<<<<<<<<<<<<<<<<< Undo last transaction >>>>>>>>>>>>>>>>>>>>");
            previousTrans.undo();
        } else {
            System.out.println("Nothing to UNDO!!!");
        }
    }

    public void redoLastTransaction() {
        if (!redoStack.isEmpty()) {
            PaymentService previousTransaction = redoStack.pollLast();
            undoStack.offerLast(previousTransaction);
            System.out.println("\n<<<<<<<<<<<<<<<<<<<< Redo last transaction >>>>>>>>>>>>>>>>>>>>");
            previousTransaction.redo();
        } else {
            System.out.println("Nothing for REDO!!!");
        }
    }
}
