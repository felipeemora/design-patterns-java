import creational.abstractfactory.example1.AbstractFactory;
import creational.abstractfactory.example1.Card;
import creational.abstractfactory.example1.FactoryProvider;
import creational.abstractfactory.example1.PaymentMethod;
import creational.factory.Payment;
import creational.factory.PaymentFactory;
import creational.factory.TypePayment;

public class Main {
  public static void main(String[] args) {
    abstractFactory();
  }

  private static void testFactoryMethod() {
    Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
    payment.doPayment();
  }

  private static void abstractFactory() {
    AbstractFactory<?> abstractFactory = FactoryProvider.getFactory("Card");
    Card tarjeta = (Card) abstractFactory.create("VISA");
    System.out.println(tarjeta.getCardNumber());
    System.out.println(tarjeta.getCardType());

    AbstractFactory<?> abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
    PaymentMethod paymentMethodFactory = (PaymentMethod) abstractFactory1.create("DEBIT");
    System.out.println(paymentMethodFactory.doPayment());
  }
}
