package quicksort;

/**
 * @author mati
 * @since 2018/9/3 14:15
 */
public enum Job {
    docter(1, "医生", "医生介绍"), teacher(2, "教师", "教师介绍");

    private int id;
    private String name;
    private String introduce;

    Job(int id, String name, String introduce) {
        this.id = id;
        this.name = name;
        this.introduce = introduce;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIntroduce() {
        return introduce;
    }

}
