package immutablity;

// rules to make immutable class
// 1- Class should be final
// 2- All memeber veriablees should be private
// 3- All member veriables should be intilize in the constructor.
// 4- class should return copies of multilpe field.

public final class immutableEmployee {
    private final String name;
    private final Integer id;

    public immutableEmployee(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public String getName(){
        return this.name;
    }
}
