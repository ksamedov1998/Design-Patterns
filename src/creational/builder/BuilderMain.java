package creational.builder;

/* Builder pattern
* Good to use constructing complex objects.
* Examples:
*   - StringBuilder
*           StringBuilder builder =  new StringBuilder();
*           builder.append("H");
*           builder.append("E");
*           builder.append("LL");
*           builder.append(0);
*   - DocumentBuilder
*   - Locale.Builder
*  Design:
*  often written in static inner class
*  calls appropriate constructor
*  negates the need for exposed setter
*
*Bean model is simple model and all it has is setters
* ! if we expose the setters, it won't be immutable
*
* There is an variation of Builder pattern is telescoping constructors
*
* It's like adding for every couple of parameters constructor and they call.
* This type of variation waste too much of time and it produces not that clear code
* and u "cant" individually set parameters.
* */
public class BuilderMain {
    public static void main(String[] args) {
        Worker.Builder builder = new Worker.Builder();
        builder.age("22").name("Kamran").position("Programmer").universityGraduated("National Aviation Academy");

        Worker worker = builder.build();
        System.out.println(worker);
    }
}

class Worker{
    public static class Builder{
        private String name;
        private String position;
        private String universityGraduated;
        private String age;
        // we can add parameter must be
        public Builder() {
        }
        public Worker build(){
            return new Worker(this);
        }
        public Builder name(String name){
            this.name =  name;
            return this;
        }
        public Builder position(String position){
            this.position =  position;
            return this;
        }
        public Builder universityGraduated(String universityGraduated){
            this.universityGraduated =  universityGraduated;
            return this;
        }
        public Builder age(String age){
            this.age =  age;
            return this;
        }

    }

    private String name;
    private String position;
    private String universityGraduated;
    private String age;

    public Worker(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.position = builder.position;
        this.universityGraduated = builder.universityGraduated;
    }
    public String getUniversityGraduated() {
        return universityGraduated;
    }
    public String getPosition() {
        return position;
    }
    public String getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", universityGraduated='" + universityGraduated + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}


