public class CustomerManager {
    private BaseLogger logger; //field-attribute

    public CustomerManager(BaseLogger logger){  //newlerken çalışır.
        this.logger = logger;   //CustomerManager new edildiğinde bize BaseLogger verecek.
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");

    }
}
