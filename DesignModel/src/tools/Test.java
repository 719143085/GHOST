package tools;

public class Test {
    public static void main(String[] args) {

        Abc abc = new Abc();
        abc.setName("111");
        abc.setName("222");
        Abc abc1 = abc;
        abc1.setName("333");
        System.out.println(abc.getName() + "-----------" + abc1.getName());
    }

    static class Abc {
        private String number;
        private String name;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
