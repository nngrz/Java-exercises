class Person<T> {

    private T obj;

    public Person(T obj) {
        this.obj = obj;
    }

    public T getPerson() {
        return obj;
    }
}

class ResponseMessage {
    private String status;

    public ResponseMessage(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class PersonT {
    public static void main(String[] args) {
        Person<Integer> objInt = new Person<Integer>(15);
        System.out.println(objInt.getPerson());

        Person<ResponseMessage> objStr = new Person<>(new ResponseMessage("OK"));
        System.out.println(objStr.getPerson().getStatus());
    }
}
