import java.util.ArrayList;
import java.util.List;

class Util{
    public static boolean isVeg(String item){
        return List.of("idly","vada","poori").contains(item)
    }
}

public class App2 {
    public static void main(String[] args) {

        List<String> menu=new ArrayList<>();
        menu.add("idly");
        menu.add("vada");
        menu.add("biryani");
        menu.add("poori");

        menu.removeIf(item->!Util.isVeg(item));
        menu.removeIf(Util::isVeg); // Method reference


        System.out.println(menu);

    }
}
