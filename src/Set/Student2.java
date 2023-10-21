package Set;

public class Student2 {
    private String name;
    private int age;
    private int Chinese;
    private int math;
    private int English;

    public Student2() {
    }

    public Student2(String name, int age, int Chinese, int math, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.math = math;
        this.English = English;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    public String toString() {
        int sum=Chinese+English+math;
        return "Student2{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", math = " + math + ", English = " + English + ",sum="+sum+"}";
    }
}
