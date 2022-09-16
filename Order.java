package CustomerOrder;

public class Order {
    public static void main(String[] args) {
        //Создаю новый заказ клиенту

        //Клиент. Наименование и номер.
        Client client1 = new Client("ООО ЗАРЯ",5554421);

        //Номенклатура.Наименование
        Nomenclature nomenclature1 = new Nomenclature("Огурцы");

        //Количество товара и сумма товара
        int quantity = 1000;
        int sum = 25000;
        int nomer = 101;
        CustomerIsOrder firstOrder = new CustomerIsOrder(client1,nomenclature1,quantity,sum,nomer);

        System.out.println("Заказ клиента №" + firstOrder.nummer + ":");
        System.out.println("Клиент - " + firstOrder.client.name + ". Номер клиента -" + firstOrder.client.idClient);
        System.out.println("Товар - " + "'" + firstOrder.nomenclature.name + "'");
        System.out.println("Количество - " + firstOrder.quantityOfGoods + ".Сумма - " + firstOrder.summaOfGoods);
    }
}
