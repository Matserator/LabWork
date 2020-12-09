package _0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human h10 = new Human("Аня", true, 20);
        Human h11 = new Human("Вика", true, 20);
        Human h12 = new Human("Валера", false, 22);

        Human h20 = new Human("Катя", true, 43);
        Human h21 = new Human("Валера", false, 45);

        Human h30 = new Human("Вероника", true, 70);
        Human h31 = new Human("Михаил", false, 70);
        Human h32 = new Human("Юлия", true, 70);
        Human h33 = new Human("Антон", false, 70);

        h20.setFather(h31);
        h20.setMother(h30);

        h21.setMother(h32);
        h21.setFather(h33);

        h10.setFather(h21);
        h10.setMother(h20);
        h11.setFather(h21);
        h11.setMother(h20);
        h12.setFather(h21);
        h12.setMother(h20);

        System.out.println("--------------------\n" + h10.toString());
        System.out.println("--------------------\n" + h11.toString());
        System.out.println("--------------------\n" + h21.toString());
    }

    public static class Human {
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(){}
        private String name;
        private boolean sex;
        private int age;
        Human father;
        Human mother;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Human getFather() {
            return father;
        }

        public void setFather(Human father) {
            this.father = father;
        }

        public Human getMother() {
            return mother;
        }

        public void setMother(Human mother) {
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}