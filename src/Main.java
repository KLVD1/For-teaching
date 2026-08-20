public class Main {
    static void main() {
        System.out.println ("Задание8,1");

        var fulltime=640;
        var time1=8;
        var workers=fulltime/time1;
        System.out.println ("Всего работников в компании = " + workers + "  работников" );

        System.out.println ("Задание8,2");
        var workersnew=workers+94;
        var time=workersnew*time1;
        System.out.println (" Если в компании работает = " + workersnew + " человек"+",то всего = "+ time + "  часов работы может быть поделено между сотрудниками" );
    }
}