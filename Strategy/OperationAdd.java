package Strategy;

/**
 * Description: OperationAdd
 * Author: silence
 * Update: silence(2016-08-02 21:59)
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
