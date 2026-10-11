public class SeasonTest {

    static void love(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getTemperature());
        System.out.println("Описание: " + favorite.getDescription());

        System.out.println();
        love(favorite);
        love(Season.WINTER);

        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.println(s + ", температура: " + s.getTemperature() + ", " + s.getDescription());
        }
    }
}
