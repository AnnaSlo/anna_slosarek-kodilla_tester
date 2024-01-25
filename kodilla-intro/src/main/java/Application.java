    public class Application {

        String name;
        double age;
        double height;

        public Application (String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
        public String getName() {
            return name;
        }

        public double getAge() {
            return age;
        }

        public double getHeight() {
            return height;
        }
     public static void main(String[] args) {
          Application[] applikations = new Application[1];
            applikations[0] = new Application("Adam",40.5, 178);

                if (applikations[0].getName() != null) {
                if (applikations[0].getAge() > 30 && applikations[0].getHeight() > 160) {
                    System.out.println("User is older than 30 and taller than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }
    }
