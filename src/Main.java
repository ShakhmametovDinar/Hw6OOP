
public class Main {
    public static void main(String[] args) {
            System.out.println("Введите заказ:");
            inputFromConsole inputFromConsole1 = new inputFromConsole();
            inputFromConsole1.OrderCreator();
            Json.saveToJson(inputFromConsole1.getOrder());
        }
    }
