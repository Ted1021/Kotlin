package chap6.section03;

public class JavaTogether {
    public static void main(String[] arg) {
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login(); // @JvmStatic 을 붗여주지않으면, 항상 이렇게 Companion 으로 접근해 주어야 함
        KCustomer.JOB.getTitle();
    }
}
