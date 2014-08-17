import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMock implements ProductDAO {
    private Map<Integer, Product> products = new HashMap<Integer, Product>();

    public ProductMock() {
            products.put(1, new Product("Изучаем Java EE 7", 842,
                "Данная книга представляет собой логичное пошаговое руководство, в котором подробно описаны многие спецификации и эталонные реализации Java EE 7." +
                " Работа с ними продемонстрирована на практических примерах." +
                " В этом фундаментальном издании также используется новейшая версия инструмента GlassFish, предназначенного для развертывания и администрирования примеров кода.\n" +
                "Книга написана ведущим специалистом по обработке запросов на спецификацию Java EE, членом наблюдательного совета организации Java Community Process (JCP)." +
                " В ней вы найдете максимально ценную информацию, изложенную с точки зрения эксперта по технологиям Java для предприятий.",
                    "img/1010335961.jpg"));

        products.put(2, new Product("Java EE 7. Основы", 439
                , "Изучите передовые технологии платформы Java Enterprise Edition 7 и узнайте о новинках, реализованных в ее последней версии," +
                " которая обеспечивает поддержку HTML5 и предлагает повышенную производительность и расширенную функциональность" +
                " корпоративных приложений. Книга написана одним из ведущих разработчиков проекта Java EE," +
                " и каждая глава в ней посвящена рассмотрению одной из ключевых спецификаций платформы, включая WebSockets," +
                " Batch Processing, RESTful Web Services и Java Message Service."
                , "img/1010407494.jpg"));


        products.put(3, new Product("Java SE 8. Вводный курс", 360
                , "В своей книге Кей С. Хорстманн, маститый автор и знаток Java, предлагает вниманию читателей наиболее " +
                "ценные из новых языковых средств в версии Java 8, а также рассматривает те средства, которые были внедрены " +
                "в версии Java 7, но не удостоились должного внимания программистов. Те, у кого имеется опыт программирования" +
                " на Java, найдут в этой книге практические рекомендации и примеры кода, демонстрирующие нововведения в версии Java 8," +
                " чтобы как можно быстрее воспользоваться этими и другими усовершенствованиями языка и платформы Java.\n"
                , "img/1010639885.jpg"));
    }

    @Override
    public Product getByID(Integer id) {
        return products.get(id);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<Product>(products.values());
    }

}
